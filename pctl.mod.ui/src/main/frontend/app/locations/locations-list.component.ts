import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';
import { Store, Action } from '@ngrx/store';
import { AppStore } from '../common/models/appstore.model';
import { ProductVariant, ActiveStatus } from '../common/models/pricing.model';
import { AppStateService } from '../common/service/app-state.service';
import {
  ShoppingCart,
  LineItem,
  SDWANLocationInfo,
  ContactInfo,
  EnterpriseAddress,
  LocationInfo,
  LocationDisplay
} from '../common/models/cart.model';

@Component({
  selector: 'locations-list',
  templateUrl: './locations-list.component.html'
})
export class LocationsListComponent implements OnInit {

 // @Input() cart: ShoppingCart;
 // @Input() activeStatus: ActiveStatus;
  currentStore: AppStore;
  @Input() locations: LocationDisplay[];


  constructor(
    private appStateService: AppStateService) {
    this.currentStore = this.appStateService.getState();


  /*  this.lineItems = this.cart.lineItems.filter(location => {
      return location.productTemplateId !== this.currentStore.user.status.productVariant.sku;
    });*/
  }

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

  ngOnInit() {
  //  console.log(this.lineItems);
  }


}
