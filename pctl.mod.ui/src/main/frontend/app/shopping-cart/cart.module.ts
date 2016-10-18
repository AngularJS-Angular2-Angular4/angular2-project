import { NgModule }                     from '@angular/core';
import { FormsModule }                  from '@angular/forms';
import { CommonModule }                 from '@angular/common';
import { CartSummaryComponent }        from './cart-summary.component';
import { CartDetailComponent }        from './cart-detail.component';


@NgModule({
    imports: [ FormsModule,
    CommonModule],
    exports: [ CartSummaryComponent,
                CartDetailComponent ],
    declarations: [ CartSummaryComponent,
                    CartDetailComponent ],
    providers: []
})
export class CartModule { }
