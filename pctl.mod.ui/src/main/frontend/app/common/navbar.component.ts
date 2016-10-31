import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import { Store } from '@ngrx/store';

import { AppStore } from '../common/models/appstore.model';
import { User } from '../common/models/user.model';
import {
  ShoppingCart,
  LineItem,
  SDWANLocationInfo,
  ContactInfo,
  EnterpriseAddress,
  LocationInfo
} from '../common/models/cart.model';
import { AuthService } from '../common/service/auth.service';
import { CartService } from '../common/service/cart.service';

@Component({
  selector: 'ctl-nav-bar',
  templateUrl: './navbar.component.html'
})
export class NavBarComponent {
   ctlLogo = 'assets/img/centurylink-logo-white-text.png';

   user: Observable<User>;
   cart: Observable<ShoppingCart>;

   constructor(
              private router: Router,
              public authService: AuthService,
              public cartService: CartService,
              public store: Store<AppStore>) {
      this.user = authService.user;
      this.cart = cartService.cart;
      authService.init();
   //   this.user.subscribe(v => console.log(v));
  }

  login() {
    // this.authService.login('tsukhu@hcl.com', 'xxx');
    // this.router.navigate(['/login']);
  }

  logout() {
    this.authService.logout();
  }

}
