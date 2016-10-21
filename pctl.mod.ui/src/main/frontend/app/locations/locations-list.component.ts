import { Component, Input, Output, EventEmitter } from '@angular/core';
import { SDWANLocationInfo } from '../common/models/cart.model';

@Component({
  selector: 'locations-list',
  templateUrl: './locations-list.component.html'
})
export class LocationsListComponent {
  @Input() locations: SDWANLocationInfo[];

  /*
    Create dummy data for SDWANLocationInfo[] and assign it to locations
    Create a new model
    {
      location: string; -> {{location.serviceAddress.locationName}}
      fullName: string; -> {{location.serviceContact.firstName}} {{location.serviceContact.lastName}}
      address: string; -> {{location.serviceAddress.
JOIN all of this and place in address
            addressLine: string;
    street: string;
    city: string;
    country: string;
    state: string;
    zipCode: string;
    }

    Create observable of array
    map -> create new structure and assig to new array 
  */
}
