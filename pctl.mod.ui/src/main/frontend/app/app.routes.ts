import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home';
import { AboutComponent } from './about';
import { NoContentComponent } from './no-content';
import { LocationsComponent } from './locations/locations.component';
import { ContactUsComponent } from './common/contact-us/contact-us.component';

import { DataResolver } from './app.resolver';
import { AuthGuard } from './auth.guard';



export const ROUTES: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact-us', component: ContactUsComponent },
  {
    path: 'locations',
    component: LocationsComponent,
    canActivate: [AuthGuard]
//    pathMatch: 'prefix',
//    loadChildren: 'app/locations/locations.module#LocationsModule'
  },
  {
    path: 'detail', loadChildren: () => System.import('./+detail').then((comp: any) => {
      return comp.default;
    })
    ,
  },
  { path: '**', component: NoContentComponent },
];
