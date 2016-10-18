import { Component } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Store } from '@ngrx/store';

import { AppStore } from '../common/models/appstore.model';
import { User } from '../common/models/user.model';
import { AuthService } from '../common/service/auth.service';

@Component({
  selector: 'ctl-nav-bar',
  templateUrl: './navbar.component.html'
})
export class NavBarComponent {
   ctlLogo = 'assets/img/centurylink-logo-white-text.png';

   user: Observable<User>;

   constructor(public authService: AuthService,
              public store: Store<AppStore>) {
      this.user = authService.user;
      authService.init();
   //   this.user.subscribe(v => console.log(v));
  }

  login() {
    this.authService.login('tsukhu@hcl.com', 'xxx');
  }

  logout() {
    this.authService.logout();
  }

}
