import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Pricing, ActiveStatus , ProductVariant } from '../common/models/pricing.model';
import { PricingService } from '../common/service/pricing.service';
import { Router } from '@angular/router';
import { Store, Action } from '@ngrx/store';
import { AppStore } from '../common/models/appstore.model';
import { ShoppingCart, LineItem } from '../common/models/cart.model';
import { FingerPrintService } from '../common/service/fingerprint.service';
import { CartService } from '../common/service/cart.service';

@Component({
  selector: 'product-pricing',
  styleUrls: ['./product-pricing.component.css'],
  templateUrl: './product-pricing.component.html'
})
export class ProductPricingComponent {
  @Input() prices: Pricing;
  @Input() term: string;
  @Input() status: ActiveStatus;
  transport: string;
  currentPrice: number;
  activeIndex: string;
  selected: boolean;
  // status: ActiveStatus;
  options = ['Product Option', 'With My Own Transport', 'With CenturyLink Transport'];

  constructor(
  private router: Router,
  private pricingService: PricingService,
  private cartService: CartService,
  public store: Store<AppStore>) {
    this.selected = false;

   }

  onTermClick(term: string) {
    this.term = term;
    this.status = {
      mode: 'own',
      sku: this.prices.productVariants[0].sku
    };
    this.getCurrentSelection();
  }

  getCurrentSelection() {
    switch (this.term) {
      case '12':
        this.currentPrice = this.prices.productVariants[0].priceInfo.term_12.own;
        break;
      case '24':
        this.currentPrice = this.prices.productVariants[0].priceInfo.term_24.own;
        break;
      case '36':
        this.currentPrice = this.prices.productVariants[0].priceInfo.term_36.own;
        break;
      default:
        this.currentPrice = this.prices.productVariants[0].priceInfo.term_12.own;
    };
  }

  onPriceSelection(mode: string, sku: string, price: number, variant: ProductVariant) {
    this.status = {
      mode: mode,
      sku: sku,
      term: this.term,
      productVariant: variant,
      transport: mode === 'own' ? this.options[1] : this.options[2]
    };
    this.currentPrice = price;
    this.selected = true;
     console.log(this.getState(this.store));
    // this.pricingService.setActiveSelection(this.status);
  }

  nextPage() {
    this.pricingService.setActiveSelection(this.status);
    let currentStore = this.getState(this.store);
    // currentStore.prices.name;
    // currentStore.prices.product_id;
    // this.status.productVariant.name;
    // this.status.productVariant.sku;
    let lineItem: LineItem;
    lineItem = {
      id: FingerPrintService.UUID(),
      productName: currentStore.prices.name,
      productId: (currentStore.prices.product_id).toString(),
      productTemplateName: this.status.productVariant.name,
      productTemplateId: this.status.productVariant.sku,
      locations: []
    };
    console.log('next page additem');
    this.cartService.addItem(lineItem).subscribe(
      action => {
          this.store.dispatch(action);
          this.router.navigate(['/locations']);
      }
    );
  }

  getState(store: Store<AppStore>): AppStore {
    let state: AppStore;
    store.take(1).subscribe(s => state = s);
    return state;
  }
}
