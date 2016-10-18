import { Component } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Store, Action } from '@ngrx/store';


import { AppStore } from '../common/models/appstore.model';
import { Product } from '../common/models/product.model';
import { Pricing , ActiveStatus } from '../common/models/pricing.model';
import {
  ShoppingCart,
  LineItem,
  SDWANLocationInfo,
  ContactInfo,
  EnterpriseAddress,
  LocationInfo
} from '../common/models/cart.model';
import { Alert } from '../common/models/alert.model';
import { ProductsService } from '../common/service/products.service';
import { PricingService } from '../common/service/pricing.service';
import { CartService } from '../common/service/cart.service';





@Component({
  selector: 'product-details',
  styleUrls: ['./product-details.component.css'],
  templateUrl: './product-details.component.html'
})
export class ProductDetailsComponent {
  product: Observable<Product>;
  prices: Observable<Pricing>;
  cart: Observable<ShoppingCart>;
  title: String;
  loading: boolean;
  error: boolean;
  errorAlert: Alert;
  term: String;
  status: ActiveStatus;


  public totalItems: number = 64;
  public currentPage: number = 4;
  public maxSize: number = 5;


  constructor(public prodService: ProductsService,
    public pricingService: PricingService,
    public cartService: CartService,
    public store: Store<AppStore>) {

    this.product = prodService.product;
    this.prices = pricingService.pricing;
    this.errorAlert = null;
    this.loading = false;
    this.error = false;
    this.loadProduct();
  //  this.loadPricing();
    this.title = 'Description';
    this.term = '12';
    this.status = {
      mode: '',
      sku: ''
    };

    /*  this.addCartItem();
      this.addLocation();
      this.addLocation2();
      this.updateLocation();
      this.deleteLocation();*/
    // this.products.subscribe(v => console.log(v));
  }

  public setPage(pageNo: number): void {
    this.currentPage = pageNo;
  };

  public pageChanged(event: any): void {
    console.log('Page changed to: ' + event.page);
    console.log('Number items per page: ' + event.itemsPerPage);
  };

/*
  private loadPricing() {
    this.loading = true;
    this.error = false;
    this.errorAlert = null;
    this.pricingService.loadPrices()
      .map(res => {
        //    console.log(res);
        return res;
      })
      .map(payload => ({ type: 'ADD_PRICES', payload }))
      .subscribe(
      action => {
        this.store.dispatch(action);
        this.loading = false;
      },
      error => {
        this.errorAlert = <Alert>{
          type: 'error',
          header: 'Warning!',
          message: <any>error
        };
        this.loading = false;
        this.error = true;
      },
      () => this.loading = false);

  }
*/
  private loadProduct() {
    this.loading = true;
    this.error = false;
    this.errorAlert = null;
    this.prodService.loadProduct()
      .map(payload => ({ type: 'ADD_PRODUCTS', payload }))
      .subscribe(
      action => {
        this.store.dispatch(action);
        this.store.dispatch(<Action>{ type: 'LOAD_PRICES' });
        this.loading = false;
      },
      error => {
        this.errorAlert = <Alert>{
          type: 'error',
          header: 'Warning!',
          message: <any>error
        };
        this.loading = false;
        this.error = true;
      },
      () => this.loading = false);

  }
  /*
     private addCartItem() {
      let cart: ShoppingCart;
      let location: SDWANLocationInfo[];
      let serviceContact: ContactInfo;
      let serviceAddress: EnterpriseAddress;
      let shippingAddress: EnterpriseAddress;
      let lineItem: LineItem;
  
      serviceAddress = {
        locationName: 'location 1',
        addressLine: 'address line 1',
        street: 'street 1',
        city: 'Denver',
        country: 'US',
        state: 'CO',
        zipCode: '71100'
      };
  
      shippingAddress = serviceAddress;
  
      serviceContact = {
        email: 'tsukhu@hcl.com',
        firstName: 'Tarun',
        lastName: 'Sukhu',
        phoneNumber: '111122223333'
      };
  
      location = [{
        id: 1,
        serviceContact: serviceContact,
        serviceAddress: serviceAddress,
        shippingAddress: shippingAddress
      }];
  
      lineItem = {
        id: 1,
        productName: 'SDWAN',
        productId: 'SDWAN',
        productTemplateName: 'SDWAN BASIC',
        productTemplateId: 'SDWANBASIC',
        locations: location
      };
  
      cart = {
        lineItems: [lineItem]
      };
      this.cartService.createCart(cart);
  
    }
  
    private addLocation() {
      let location: SDWANLocationInfo;
      let serviceContact: ContactInfo;
      let serviceAddress: EnterpriseAddress;
      let shippingAddress: EnterpriseAddress;
      let lineItem: LineItem;
  
      serviceAddress = {
        locationName: 'location 2',
        addressLine: 'address line 2',
        street: 'street 2',
        city: 'Highlands Ranch',
        country: 'US',
        state: 'CO',
        zipCode: '71200'
      };
  
      shippingAddress = serviceAddress;
  
      serviceContact = {
        email: 'tsukhu@hcl.com',
        firstName: 'Tarun',
        lastName: 'Sukhu',
        phoneNumber: '111122223333'
      };
  
      location = {
        id: 2,
        serviceContact: serviceContact,
        serviceAddress: serviceAddress,
        shippingAddress: shippingAddress
      };
  
      lineItem = {
        id: 1,
        productName: 'SDWAN',
        productId: 'SDWAN',
        productTemplateName: 'SDWAN BASIC',
        productTemplateId: 'SDWANBASIC',
        locations: [location]
      };
  
  
      this.cartService.addItem(lineItem);
  
    }
  
      private updateLocation() {
      let location: SDWANLocationInfo;
      let newLocation: LocationInfo;
      let serviceContact: ContactInfo;
      let serviceAddress: EnterpriseAddress;
      let shippingAddress: EnterpriseAddress;
      let lineItem: LineItem;
  
      serviceAddress = {
        locationName: 'location 2',
        addressLine: 'address line 2',
        street: 'street 2',
        city: 'Highlands Rancher',
        country: 'US',
        state: 'CO',
        zipCode: '71211'
      };
  
      shippingAddress = serviceAddress;
  
      serviceContact = {
        email: 'tsukhu@gmail.com',
        firstName: 'Tarun',
        lastName: 'Sukhu',
        phoneNumber: '999999'
      };
  
      location = {
        id: 2,
        serviceContact: serviceContact,
        serviceAddress: serviceAddress,
        shippingAddress: shippingAddress
      };
  
      newLocation = {
        productTemplateId: 'SDWANBASIC',
        location: location
      };
  
  
      this.cartService.updateLocation(newLocation);
  
    }
  
   private deleteLocation() {
      let location: SDWANLocationInfo;
      let newLocation: LocationInfo;
      let serviceContact: ContactInfo;
      let serviceAddress: EnterpriseAddress;
      let shippingAddress: EnterpriseAddress;
      let lineItem: LineItem;
  
      serviceAddress = {
        locationName: 'location 2',
        addressLine: 'address line 2',
        street: 'street 2',
        city: 'Highlands Rancher',
        country: 'US',
        state: 'CO',
        zipCode: '71211'
      };
  
      shippingAddress = serviceAddress;
  
      serviceContact = {
        email: 'tsukhu@gmail.com',
        firstName: 'Tarun',
        lastName: 'Sukhu',
        phoneNumber: '999999'
      };
  
      location = {
        id: 2,
        serviceContact: serviceContact,
        serviceAddress: serviceAddress,
        shippingAddress: shippingAddress
      };
  
      newLocation = {
        productTemplateId: 'SDWANBASIC',
        location: location
      };
  
  
      this.cartService.deleteLocation(newLocation);
  
    }
  
    private addLocation2() {
      let location: SDWANLocationInfo;
      let serviceContact: ContactInfo;
      let serviceAddress: EnterpriseAddress;
      let shippingAddress: EnterpriseAddress;
      let lineItem: LineItem;
  
      serviceAddress = {
        locationName: 'location 2',
        addressLine: 'address line 2',
        street: 'street 2',
        city: 'Highlands Ranch',
        country: 'US',
        state: 'CO',
        zipCode: '71200'
      };
  
      shippingAddress = serviceAddress;
  
      serviceContact = {
        email: 'tsukhu@hcl.com',
        firstName: 'Tarun',
        lastName: 'Sukhu',
        phoneNumber: '111122223333'
      };
  
      location = {
        id: 2,
        serviceContact: serviceContact,
        serviceAddress: serviceAddress,
        shippingAddress: shippingAddress
      };
  
      lineItem = {
        productName: 'SDWAN',
        productId: 'SDWAN',
        productTemplateName: 'SDWAN BASIC HA',
        productTemplateId: 'SDWANBASICHA',
        locations: [location]
      };
  
      this.cartService.addItem(lineItem);
  
    }
  
   
  */
}
