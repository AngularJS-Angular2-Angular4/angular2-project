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

  currentStore: AppStore;
  @Input() locations: LocationDisplay[] = [];
  @Output() deleteEvent = new EventEmitter();
  @Output() editEvent = new EventEmitter();
  selected: LocationDisplay;


  constructor(
    private appStateService: AppStateService) {
    this.currentStore = this.appStateService.getState();
  }

  ngOnInit() {
    //  console.log(this.lineItems);
  }

  deleteLocation(location) {
    this.deleteEvent.emit(location);
  }

  editLocation(location) {
    this.editEvent.emit(location);
  }


}
