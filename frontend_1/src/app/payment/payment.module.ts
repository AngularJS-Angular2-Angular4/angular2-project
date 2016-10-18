import { NgModule }                     from '@angular/core';
import { FormsModule }                  from '@angular/forms';
import { CommonModule }                 from '@angular/common';
import { CreditCheckComponent }         from './credit-check.component';

@NgModule({
    imports: [ FormsModule,
    CommonModule],
    exports: [ CreditCheckComponent],
    declarations: [ CreditCheckComponent],
    providers: []
})
export class PaymentModule { }
