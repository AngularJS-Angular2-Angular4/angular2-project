import { Injectable, OnDestroy } from '@angular/core';
import { Http } from '@angular/http';
import { Actions, Effect } from '@ngrx/effects';
import { Observable } from 'rxjs/Observable';
import { PricingService } from '../common/service/pricing.service';

@Injectable()
export class UserEffects implements OnDestroy {

  @Effect() loadPrices$ = this.actions$
      // Listen for the 'LOAD_PRICES' action
      .ofType('LOAD_PRICES')
      .switchMap(() => this.pricingService.loadPrices()
        // If successful, dispatch success action with result
        .map(payload => ({ type: 'ADD_PRICES', payload }))
        .catch(() => Observable.of({ type: 'LOAD_PRICES_FAILED' }))
    );

  constructor(
    private http: Http,
    private pricingService: PricingService,
    private actions$: Actions
  ) { }


  ngOnDestroy() {

  }

}
