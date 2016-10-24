import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home';
import { AboutComponent } from './about';
import { NoContentComponent } from './no-content';
import { LocationsComponent } from './locations/locations.component';
import { ContactUsComponent } from './common/contact-us/contact-us.component';
import { BillingComponent } from './billing/billing.component';

import { DataResolver } from './app.resolver';



export const ROUTES: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'contact-us', component: ContactUsComponent },
  { path: 'billing', component: BillingComponent },
  {
    path: 'locations',
    component: LocationsComponent
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
