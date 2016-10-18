import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Product } from '../common/models/product.model';


@Component({
  selector: 'product-description',
  styleUrls: [ './product-desc.component.css' ],
  templateUrl: './product-desc.component.html'
})
export class ProductDescriptionComponent {
   product: Product;
   @Input() title: String;

   @Input() set item(value: Product) {
     this.product = Object.assign({}, value);
   }


}
