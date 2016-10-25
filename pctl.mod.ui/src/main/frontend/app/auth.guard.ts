import { Injectable } from '@angular/core';
import { Router, CanActivate } from '@angular/router';
import { AppStateService } from './common/service/app-state.service';

@Injectable()
export class AuthGuard implements CanActivate {

    constructor(
        private router: Router,
        private appStateService: AppStateService) { }

    canActivate() {
        let currentStore = this.appStateService.getState();
        let lineItemCount = currentStore.cart.lineItems.length;

        // console.log( "lineItemCount "+ lineItemCount );

        if (lineItemCount) {
            return true;
        }

        this.router.navigate(['/home']);
        return false;
    }
}