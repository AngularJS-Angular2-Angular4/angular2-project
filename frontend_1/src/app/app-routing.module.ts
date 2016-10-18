import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ROUTES } from './app.routes';

import { HomeComponent } from './home';
import { AboutComponent } from './about';
import { NoContentComponent } from './no-content';

import { DataResolver } from './app.resolver';
import { LocationsComponent } from './locations/locations.component';

@NgModule({
  imports: [
      RouterModule.forRoot(ROUTES, { useHash: false })
  ],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule {
}
