import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Store } from '@ngrx/store';

import { AppStore } from '../common/models/appstore.model';
import { Variant } from '../common/models/product.model';
import { ProductsService } from '../common/service/products.service';

@Component({
  selector: 'product-features',
  templateUrl: './product-features.component.html'
})
export class ProductFeaturesComponent {
   options = ['Standard CPE', 'High Availability', 'Security Package', 'Tier 1 Support'];
   @Input() variants: Variant[];
}
