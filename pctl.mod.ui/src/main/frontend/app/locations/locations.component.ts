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
  locations: LocationDisplay[];
  // Subscribe to ActiveStatus from user Store
  user: Observable<User>;
  currentStore: AppStore;
  formData: LocationsFormModel;


  constructor(
    private appStateService: AppStateService,
    public cartService: CartService,
    public store: Store<AppStore>) {
    this.user = <Observable<User>>store.select('user');
    this.cart = <Observable<ShoppingCart>>store.select('cart');
    let self = this;
    this.currentStore = this.appStateService.getState();
    console.log(this.currentStore.cart.lineItems);
    console.log(this.currentStore.user.status.productVariant.sku);
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

  resetFormDataModel() {
    this.formData = {
      id: '',
      contactid: '',
      email: '',
      firstName: '',
      lastName: '',
      primaryPhone: '',
      contactAddressid: '',
      locationName: '',
      address: '',
      street: '',
      country: '',
      city: '',
      state: '',
      zipCode: '',
      checkAddress: '',
      shippingAddressid: '',
      shippingLocationName: '',
      shippingAddress: '',
      shippingStreet: '',
      shippingCountry: '',
      shippingCity: '',
      shippingState: '',
      shippingZipCode: ''
    };
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

  editAction($event) {
    console.log($event);
  }

  deleteAction($event) {
    let locationDisplay: LocationDisplay;
    locationDisplay = $event;
    console.log(locationDisplay);
    let delLocationInfo: LocationInfo;
    let sdwanLocationInfo = this.getLocationById(locationDisplay.id);
    delLocationInfo = {
      productTemplateId: this.currentStore.user.status.productVariant.sku,
      location: sdwanLocationInfo
    };
    this.cartService.deleteLocation(delLocationInfo);
  }

  locationSubmit($event) {
    console.log($event);
    let sdwanLocation: SDWANLocationInfo;
    /*
                'contactid': [''],
        'email': ['', [Validators.required, Validations.emailValidator]],
        'firstName': ['', [Validators.required, Validators.minLength(3)]],
        'lastName': ['', Validators.required],
        'primaryPhone': ['', [Validators.required, Validations.phoneValidator]],
        'contactAddressid': [''],
        'locationName': ['', [Validators.required, Validators.minLength(3)]],
        'address': [''],
        'street': [''],
        'country': ['', Validators.required],
        'city': [''],
        'state': [''],
        'zipCode': ['', Validations.zipCodeValidator],
        'checkAddress': [''],
        'shippingAddressid': [''],
        'shippingLocationName': ['', Validators.required],
        'shippingAddress': [''],
        'shippingStreet': [''],
        'shippingCountry': ['', Validators.required],
        'shippingCity': [''],
        'shippingState': [''],
        'shippingZipCode': ['', Validations.zipCodeValidator]
    */
    sdwanLocation = {
      id: $event.id,
      serviceContact: {
        id: $event.contactid,
        email: $event.email,
        firstName: $event.firstName,
        lastName: $event.lastName,
        phoneNumber: $event.primaryPhone
      },
      serviceAddress: {
        id: $event.contactAddressid,
        locationName: $event.locationName,
        addressLine: $event.address,
        street: $event.street,
        city: $event.city,
        country: $event.country,
        state: $event.state,
        zipCode: $event.zipCode
      },
      shippingAddress: {
        id: $event.shippingAddressid,
        locationName: $event.locationName,
        addressLine: $event.address,
        street: $event.street,
        city: $event.city,
        country: $event.country,
        state: $event.state,
        zipCode: $event.zipCode
      }
    }
    let newLocation = {
      productTemplateId: this.currentStore.user.status.productVariant.sku,
      location: <SDWANLocationInfo>sdwanLocation
    };
    //  console.log(newLocation);
    this.cartService.updateLocation(<LocationInfo>newLocation);
  }

  ngOnDestroy() {
    this.cartSubscription.unsubscribe();
  }



}
