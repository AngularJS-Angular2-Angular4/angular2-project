import { NgModule }                     from '@angular/core';
import { FormsModule, ReactiveFormsModule }                  from '@angular/forms';
import { CommonModule }                 from '@angular/common';
import { LocationsComponent }           from './locations.component';
import { LocationsBatchUploadComponent } from './locations-batch-upload.component';
import { LocationsListComponent }       from './locations-list.component';
import { LocationsFormComponent }       from './locations-form.component';
import { LocationsRoutingModule }       from './locations-routing.module';

@NgModule({
    imports: [ FormsModule,
                CommonModule,
                ReactiveFormsModule],
    exports: [ LocationsComponent,
                LocationsBatchUploadComponent,
                LocationsListComponent,
                LocationsFormComponent ],
    declarations: [ LocationsComponent,
                    LocationsBatchUploadComponent,
                    LocationsListComponent,
                    LocationsFormComponent ],
    providers: []
})
export class LocationsModule { }
