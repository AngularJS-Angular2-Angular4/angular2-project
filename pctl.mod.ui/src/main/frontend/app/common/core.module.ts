import { NgModule, Optional, SkipSelf } from '@angular/core';
import { CommonModule }                 from '@angular/common';
import { NavBarComponent }              from './navbar.component';
import { FooterComponent }              from './footer.component';
import { ContactUsComponent }           from './contact-us/contact-us.component';
import { ThankComponent }               from './contact-us/thank-you.component';
import { LiveChatComponent }            from './contact-us/live-chat.component';
import { throwIfAlreadyLoaded }         from './module-import-guard';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Routes, RouterModule }         from '@angular/router';

import { AuthService } from './service/auth.service';
import { FingerPrintService } from './service/fingerprint.service';
import { ProductsService } from './service/products.service';
import { PricingService } from './service/pricing.service';
import { CartService } from './service/cart.service';
import { AppStateService } from './service/app-state.service';
import { ContactService } from './service/contact.service';


@NgModule({
    imports: [ FormsModule,
                CommonModule,
                ReactiveFormsModule,
                RouterModule
                ],
    exports: [  ContactUsComponent,
                LiveChatComponent,
                FooterComponent,
                NavBarComponent,
                ThankComponent],
    declarations: [ ContactUsComponent,
                    LiveChatComponent,
                    FooterComponent,
                    NavBarComponent,
                    ThankComponent ],
    providers: [ 
                 AppStateService,
                 AuthService,
                 ProductsService,
                 PricingService,
                 FingerPrintService,
                 CartService,
                 ContactService ],
})

export class CoreModule {
    constructor( @Optional() @SkipSelf() parentModule: CoreModule) {
        throwIfAlreadyLoaded(parentModule, 'CoreModule');
    }
}
