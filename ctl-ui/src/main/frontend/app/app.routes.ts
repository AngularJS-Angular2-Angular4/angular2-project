import {Routes} from '@angular/router';
import {Home} from './home';
import {Login} from './login';
import {NotFound} from './not-found';
import {AccessDenied} from './access-denied/access-denied.component';
import {AuthenticatedGuard, AdminGuard, UnauthenticatedGuard} from './shared/guards';
import {AuthService} from './shared/auth/auth.service';
import {load} from '../platform/browser/webpack/async.ng.module.loader';

export const routes: Routes = [
  {
    path: '',
    pathMatch: 'prefix',
    redirectTo: 'order'
  },
  {
    path: 'home',
    pathMatch: 'prefix',
    component: Home
  },
  {
    path: 'about',
    pathMatch: 'prefix',
    loadChildren: load(() => new Promise(resolve => {
      (require as any).ensure([], (require: any) => {
        resolve(require('./+about/about.module').AboutModule);
      });
    }))
  },
  {
    path: 'order',
    pathMatch: 'prefix',
    loadChildren: load(() => new Promise(resolve => {
      (require as any).ensure([], (require: any) => {
        resolve(require('./+order/order.module').OrderModule);
      });
    })),
    //canActivate: [UnauthenticatedGuard, AdminGuard]

  },
  {
    path: 'playground',
    pathMatch: 'prefix',
    loadChildren: load(() => new Promise(resolve => {
      (require as any).ensure([], (require: any) => {
        resolve(require('./+playground/playground.module').PlaygroundModule);
      });
    })),
  },
  {
    path: 'login',
    pathMatch: 'prefix',
    component: Login,
    canActivate: [UnauthenticatedGuard]
  },
  {
    path: 'accessDenied',
    pathMatch: 'prefix',
    component: AccessDenied
  },
  {
    path: '404',
    pathMatch: 'prefix',
    component: NotFound
  },
  {
    path: '**',
    pathMatch: 'prefix',
    redirectTo: '404',
    terminal: true
  },
];

export const AUTH_PROVIDERS = [AuthService, AdminGuard, AuthenticatedGuard, UnauthenticatedGuard];


