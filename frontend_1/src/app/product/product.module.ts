import { NgModule }                     from '@angular/core';
import { FormsModule }                  from '@angular/forms';
import { CommonModule }                 from '@angular/common';
import { ProductDescriptionComponent }  from './product-desc.component';
import { ProductPricingComponent }      from './product-pricing.component';
import { CheckmarkPipe }                from '../common/pipes/checkmark.pipe';
import { ProductTermSelectionComponent } from './product-term-selection.component';
import { ProductFeaturesComponent }     from './product-features.component';
import { ProductDetailsComponent }      from './product-details.component';
import { SpinnerComponent }             from '../common/spinner.component';
import { AlertComponent }               from '../common/alert.component';
import { PaginationModule }             from 'ng2-bootstrap/ng2-bootstrap';

@NgModule({
    imports: [ FormsModule,
    CommonModule ,
    PaginationModule
    ],
    exports: [ ProductDescriptionComponent,
                ProductPricingComponent,
                ProductTermSelectionComponent,
                CheckmarkPipe,
                ProductFeaturesComponent,
                ProductDetailsComponent ],
    declarations: [ ProductDescriptionComponent ,
                    ProductPricingComponent,
                    ProductTermSelectionComponent,
                    CheckmarkPipe,
                    ProductFeaturesComponent,
                    ProductDetailsComponent,
                    SpinnerComponent,
                    AlertComponent ],
    providers: [],
})
export class ProductModule { }
