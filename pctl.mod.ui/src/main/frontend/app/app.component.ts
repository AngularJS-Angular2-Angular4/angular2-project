/*
 * Angular 2 decorators and services
 */
import { Component, ViewEncapsulation } from '@angular/core';

import { AppState } from './app.service';

import { Store, Action } from '@ngrx/store';
import { AppStore } from './common/models/appstore.model';
import { User, EnterpriseInfo } from './common/models/user.model';
import { AuthService } from './common/service/auth.service';
import { FingerPrintService } from './common/service/fingerprint.service';
import { ProductsService } from './common/service/products.service';
// declare var $: JQueryStatic;

/*
 * App Component
 * Top Level Component
 */
@Component({
  selector: 'app',
  encapsulation: ViewEncapsulation.None,
  styleUrls: [
    './app.component.css'
  ],
  templateUrl: './app.component.html'
})
export class AppComponent {
  angularclassLogo = 'assets/img/angularclass-avatar.png';
  name = 'Angular 2 Webpack Starter';


  constructor(
    public appState: AppState,
    public authService: AuthService,
    public store: Store<AppStore>,
    public fingerPrintService: FingerPrintService,
    public prodService: ProductsService) {

  }

  ngOnInit() {
    console.log('Initial App State', this.appState.state);
    //  $("div").css("border", "3px solid red");
    this.initState();
  }

  initState() {
    this.authService.init();
    this.fingerPrintService.getFingerPrint();
    this.loadProductAndPrices();
  }

  private loadProductAndPrices() {
    this.prodService.loadProduct()
      .map(payload => ({ type: 'ADD_PRODUCTS', payload }))
      .subscribe(
      action => {
        this.store.dispatch(action);
        this.store.dispatch(<Action>{ type: 'LOAD_PRICES' });
      });

  }
}

/*
 * Please review the https://github.com/AngularClass/angular2-examples/ repo for
 * more angular app examples that you may copy/paste
 * (The examples may not be updated as quickly. Please open an issue on github for us to update it)
 * For help or questions please contact us at @AngularClass on twitter
 * or our chat on Slack at https://AngularClass.com/slack-join
 */
