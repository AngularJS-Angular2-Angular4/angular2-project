import { Routes, RouterModule } from '@angular/router';
import { LocationsComponent } from './locations.component';
import { NgModule } from '@angular/core/src/metadata/ng_module';


export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: LocationsComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: []
})
export class LocationsRoutingModule {
}
