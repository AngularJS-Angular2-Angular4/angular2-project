import { NgModule, ApplicationRef } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';
import { removeNgStyles, createNewHosts, createInputTransfer } from '@angularclass/hmr';

/*
 * Platform and Environment providers/directives/pipes
 */
import { ENV_PROVIDERS } from './environment';
import { ROUTES } from './app.routes';

// App is our top level component
import { AppComponent } from './app.component';
import { APP_RESOLVER_PROVIDERS } from './app.resolver';
import { AppState, InternalStateType } from './app.service';
import { HomeComponent } from './home';
import { AboutComponent } from './about';
import { NoContentComponent } from './no-content';
import { XLarge } from './home/x-large';

import { CtlHomeComponent } from './home/ctl-home.component';
import { CoreModule } from './common/core.module';
import { ProductModule } from './product/product.module';
import { UserAndSecurityModule } from './user-management/user-and-security.module';
import { CartModule } from './shopping-cart/cart.module';
import { OrderModule } from './order/order.module';
import { PaymentModule } from './payment/payment.module';
import { Store, StoreModule, combineReducers } from '@ngrx/store';
import { compose } from '@ngrx/core/compose';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { StoreLogMonitorModule, useLogMonitor } from '@ngrx/store-log-monitor';
import { localStorageSync } from 'ngrx-store-localstorage';
import { userReducer } from './common/reducers/user.reducer';
import { productsReducer } from './common/reducers/products.reducer';
import { pricesReducer } from './common/reducers/prices.reducer';
import { cartReducer } from './common/reducers/cart.reducer';
import { AppRoutingModule } from './app-routing.module';
import { LocationsModule } from './locations/locations.module';

import { EffectsModule } from '@ngrx/effects';
import { UserEffects } from './effects/user-effects.component';
import { User } from './common/models/user.model';
import { ShoppingCart } from './common/models/cart.model';


// Application wide providers
const APP_PROVIDERS = [
  ...APP_RESOLVER_PROVIDERS,
  AppState
];

type StoreType = {
  state: InternalStateType,
  restoreInputValues: () => void,
  disposeOldHosts: () => void
};

const initialCartState: ShoppingCart = {
  lineItems: []
};

const initialUserState: User = {
  id: 0,
  email: '',
  loggedIn: false,
  breadcrumbs: []
};

/**
 * `AppModule` is the main entry point into Angular2's bootstraping process
 */
@NgModule({
  bootstrap: [AppComponent],
  declarations: [
    AppComponent,
    AboutComponent,
    HomeComponent,
    NoContentComponent,
    XLarge,
    CtlHomeComponent
  ],
  imports: [ // import Angular's modules
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    CoreModule,
    ProductModule,
    UserAndSecurityModule,
    CartModule,
    OrderModule,
    PaymentModule,
    AppRoutingModule,
    LocationsModule,
    //    RouterModule.forRoot(ROUTES, { useHash: true }),
    StoreModule.provideStore(compose(
      localStorageSync(['user'], true),
      combineReducers
    )({
      user: userReducer,
      products: productsReducer,
      prices: pricesReducer,
      cart: cartReducer
    }), {
        user: initialUserState,
        cart: initialCartState
      }),
    StoreDevtoolsModule.instrumentStore({
      monitor: useLogMonitor({
        visible: false,
        position: 'right'
      })
    }),
    StoreLogMonitorModule,
    EffectsModule.run(UserEffects)
  ],
  providers: [ // expose our Services and Providers into Angular's dependency injection
    ENV_PROVIDERS,
    APP_PROVIDERS
  ]
})
export class AppModule {
  constructor(public appRef: ApplicationRef, public appState: AppState) { }

  hmrOnInit(store: StoreType) {
    if (!store || !store.state) return;
    console.log('HMR store', JSON.stringify(store, null, 2));
    // set state
    this.appState._state = store.state;
    // set input values
    if ('restoreInputValues' in store) {
      let restoreInputValues = store.restoreInputValues;
      setTimeout(restoreInputValues);
    }

    this.appRef.tick();
    delete store.state;
    delete store.restoreInputValues;
  }

  hmrOnDestroy(store: StoreType) {
    const cmpLocation = this.appRef.components.map(cmp => cmp.location.nativeElement);
    // save state
    const state = this.appState._state;
    store.state = state;
    // recreate root elements
    store.disposeOldHosts = createNewHosts(cmpLocation);
    // save input values
    store.restoreInputValues = createInputTransfer();
    // remove styles
    removeNgStyles();
  }

  hmrAfterDestroy(store: StoreType) {
    // display new elements
    store.disposeOldHosts();
    delete store.disposeOldHosts;
  }

}

