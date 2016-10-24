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

import * as _ from 'lodash';

@Component({
  selector: 'locations-list',
  templateUrl: './locations-list.component.html'
})
export class LocationsListComponent implements OnInit {

  currentStore: AppStore;
  locations: LocationDisplay[] = [];
  @Output() deleteEvent = new EventEmitter();
  @Output() editEvent = new EventEmitter();
  selected: LocationDisplay;
  pagedLocations: LocationDisplay[] = [];

  //pagination counters
  pageSize = 2;

  @Input() set items(locationsDisplay: LocationDisplay[]) {
    //console.log(locationsDisplay);
    if (locationsDisplay !== undefined || locationsDisplay.length > 0) {
      this.locations = locationsDisplay;
      this.pagedLocations = _.take(this.locations, this.pageSize);
    }
  }


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

  onPageChanged(page) {
    let startIndex = (page - 1) * this.pageSize;
    this.pagedLocations = _.take(_.drop(this.locations, startIndex), this.pageSize);
  }

}
