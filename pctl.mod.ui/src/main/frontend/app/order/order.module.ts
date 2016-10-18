import { NgModule }                     from '@angular/core';
import { FormsModule }                  from '@angular/forms';
import { CommonModule }                 from '@angular/common';
import { OrderComponent }               from './order.component';
import { SavePdfComponent }             from './save-pdf.component';
import { TnCComponent }                 from './tnc.component';

@NgModule({
    imports: [ FormsModule,
    CommonModule],
    exports: [ OrderComponent,
                SavePdfComponent,
                TnCComponent],
    declarations: [ OrderComponent,
                SavePdfComponent,
                TnCComponent],
    providers: []
})
export class OrderModule { }
