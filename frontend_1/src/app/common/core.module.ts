import { NgModule, Optional, SkipSelf } from '@angular/core';
import { FormsModule }                  from '@angular/forms';
import { CommonModule }                 from '@angular/common';
import { NavBarComponent }              from './navbar.component';
import { FooterComponent }              from './footer.component';
import { ContactUsComponent }           from './contact-us/contact-us.component';
import { LiveChatComponent }            from './contact-us/live-chat.component';
import { throwIfAlreadyLoaded }         from './module-import-guard';

import { AuthService } from './service/auth.service';
import { FingerPrintService } from './service/fingerprint.service';
import { ProductsService } from './service/products.service';
import { PricingService } from './service/pricing.service';
import { CartService } from './service/cart.service';



@NgModule({
    imports: [ FormsModule,
                CommonModule
                ],
    exports: [  ContactUsComponent,
                LiveChatComponent,
                FooterComponent,
                NavBarComponent],
    declarations: [ ContactUsComponent,
                    LiveChatComponent,
                    FooterComponent,
                    NavBarComponent ],
    providers: [ AuthService,
                 ProductsService,
                 PricingService,
                 FingerPrintService,
                 CartService ],
})

export class CoreModule {
    constructor( @Optional() @SkipSelf() parentModule: CoreModule) {
        throwIfAlreadyLoaded(parentModule, 'CoreModule');
    }
}
