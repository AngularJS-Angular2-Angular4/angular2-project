import { Component } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Store, Action } from '@ngrx/store';
import { AppStore } from '../common/models/appstore.model';
import { Product } from '../common/models/product.model';
import { Pricing, ActiveStatus } from '../common/models/pricing.model';
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
  prices: Observable<Array<Pricing>>;
  cart: Observable<ShoppingCart>;
  title: String;
  loading: boolean;
  error: boolean;
  errorAlert: Alert;
  term: String;
  status: ActiveStatus;
  activeNav: string;


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
    this.title = 'Description';
    this.term = '12';
    this.activeNav = 'description';
    this.status = {
      mode: '',
      sku: ''
    };

  }

  // workaround due to hashLocationStrategy issue
  // https://github.com/angular/angular/issues/6595
  public onClickLinkFeat(event) {
    this.activeNav = 'features';
    event.preventDefault();
    document.getElementById('features').scrollIntoView();
  }

  public onClickLinkDesc(event) {
    this.activeNav = 'description';
    event.preventDefault();
    document.getElementById('description').scrollIntoView();
  }

  public onClickLinkPricing(event) {
    this.activeNav = 'pricing';
    event.preventDefault();
    document.getElementById('pricing').scrollIntoView();
  }

  public setPage(pageNo: number): void {
    this.currentPage = pageNo;
  }

  public pageChanged(event: any): void {
    console.log('Page changed to: ' + event.page);
    console.log('Number items per page: ' + event.itemsPerPage);
  }

}
