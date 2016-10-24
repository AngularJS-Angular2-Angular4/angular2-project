import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { ActivatedRoute } from '@angular/router';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import {
  ShoppingCart,
  LineItem,
  SDWANLocationInfo,
  ContactInfo,
  EnterpriseAddress,
  LocationInfo,
  LocationDisplay,
  LocationsFormModel
} from '../common/models/cart.model';
import { Subscription } from 'rxjs/Subscription';

import { CartService } from '../common/service/cart.service';
import { Store, Action } from '@ngrx/store';
import { AppStore } from '../common/models/appstore.model';
import { Pricing, ActiveStatus } from '../common/models/pricing.model';
import { User } from '../common/models/user.model';
import { PricingService } from '../common/service/pricing.service';
import { AppStateService } from '../common/service/app-state.service';


@Component({
  selector: 'locations',
  templateUrl: './locations.component.html'
})

export class LocationsComponent implements OnInit {
  form: FormGroup;
  cart: Observable<ShoppingCart>;
  cartSubscription: Subscription;
  lineItem: LineItem;
  locations: LocationDisplay[] = [];
  // Subscribe to ActiveStatus from user Store
  user: Observable<User>;
  currentStore: AppStore;
  formData: SDWANLocationInfo;


  constructor(
    private appStateService: AppStateService,
    public cartService: CartService,
    public store: Store<AppStore>) {
    this.user = <Observable<User>>store.select('user');
    this.cart = <Observable<ShoppingCart>>store.select('cart');
    let self = this;
    this.currentStore = this.appStateService.getState();
    //  console.log(this.currentStore.cart.lineItems);
    //   console.log(this.currentStore.user.status.productVariant.sku);
    /*   this.lineItems = this.currentStore.cart.lineItems.filter(location => {
             return location.productTemplateId === self.currentStore.user.status.productVariant.sku;
           });*/
    this.cartSubscription = this.cart.subscribe(
      cart => {
        self.lineItem = cart.lineItems.find(lineItem => {
          return lineItem.productTemplateId === self.currentStore.user.status.productVariant.sku;
        });
        self.locations = [];
        self.lineItem.locations.map(
          item => {
            let location: LocationDisplay = {
              id: item.id,
              name: item.serviceAddress.locationName,
              contact: item.serviceContact.firstName + ' ' + item.serviceContact.lastName,
              address: item.serviceAddress.addressLine + ',' +
              item.serviceAddress.city + ',' +
              item.serviceAddress.street + ',' +
              item.serviceAddress.state + ',' +
              item.serviceAddress.country + ',' +
              item.serviceAddress.zipCode
            };
            self.locations.push(location);
          }
        );
      }

    );
  }

  getLocationById(id: string): SDWANLocationInfo {
    return this.lineItem.locations.find(location =>
      location.id === id);
  }

  convertLocationToForm(location: SDWANLocationInfo): LocationsFormModel {
    return {
      id: location.id,
      contactid: location.serviceContact.id,
      email: location.serviceContact.email,
      firstName: location.serviceContact.firstName,
      lastName: location.serviceContact.lastName,
      primaryPhone: location.serviceContact.phoneNumber,
      contactAddressid: location.serviceAddress.id,
      locationName: location.serviceAddress.locationName,
      address: location.serviceAddress.addressLine,
      street: location.serviceAddress.street,
      country: location.serviceAddress.country,
      city: location.serviceAddress.city,
      state: location.serviceAddress.state,
      zipCode: location.serviceAddress.zipCode,
      checkAddress: '',
      shippingAddressid: location.shippingAddress.id,
      shippingLocationName: location.shippingAddress.locationName,
      shippingAddress: location.shippingAddress.addressLine,
      shippingStreet: location.shippingAddress.street,
      shippingCountry: location.shippingAddress.country,
      shippingCity: location.shippingAddress.city,
      shippingState: location.shippingAddress.state,
      shippingZipCode: location.shippingAddress.zipCode
    };
  }

  ngOnInit() {

  }

  resetDataModel() {
    this.formData = {
      id: '',
      serviceContact: {
        id: '',
        email: '',
        firstName: '',
        lastName: '',
        phoneNumber: '',
      },
      serviceAddress: {
        id: '',
        locationName: '',
        addressLine: '',
        street: '',
        city: '',
        country: '',
        state: '',
        zipCode: ''
      },
      shippingAddress: {
        id: '',
        locationName: '',
        addressLine: '',
        street: '',
        city: '',
        country: '',
        state: '',
        zipCode: '',
        checkAddress: ''
      }
    };
  }

  editAction($event) {
    console.log($event);
    this.resetDataModel();
    let locationDisplay: LocationDisplay;
    locationDisplay = $event;
    // console.log(locationDisplay);
    this.formData = this.getLocationById(locationDisplay.id);
    //  this.cartService.deleteLocation(delLocationInfo);
  }

  deleteAction($event) {
    let locationDisplay: LocationDisplay;
    locationDisplay = $event;
    //  console.log(locationDisplay);
    let delLocationInfo: LocationInfo;
    let sdwanLocationInfo = this.getLocationById(locationDisplay.id);
    delLocationInfo = {
      productTemplateId: this.currentStore.user.status.productVariant.sku,
      location: sdwanLocationInfo
    };
    this.cartService.deleteLocation(delLocationInfo);
  }

  locationSubmit($event) {
    //   console.log($event);
    let sdwanLocation: SDWANLocationInfo;
    let newLocation = {
      productTemplateId: this.currentStore.user.status.productVariant.sku,
      location: <SDWANLocationInfo>$event
    };
    //  console.log(newLocation);
    this.cartService.updateLocation(<LocationInfo>newLocation);
  }

  ngOnDestroy() {
    this.cartSubscription.unsubscribe();
  }



}
