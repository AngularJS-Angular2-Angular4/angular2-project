/* tslint:disable */
import { Injectable, Inject, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Observer } from 'rxjs/Observer';

import { Store } from '@ngrx/store';
import { AppStore } from '../models/appstore.model';
import { Pricing } from '../models/pricing.model';




/* Authentication Service for
      1) Storing the current auth token (if loggedIn)
      2) Handle login and logout methods
*/

const BASE_URL = 'http://localhost:3001/prices/';
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json' }) };


@Injectable()
export class PricingService implements OnInit {
    pricing: Observable<Pricing>;
    constructor(
        private http: Http, public store: Store<AppStore>
    ) {
        this.pricing = <Observable<Pricing>>store.select('prices');
    }

    ngOnInit() {

    }

    loadPrices(): Observable<Pricing> {
        return this.http.get(BASE_URL)
            .map(res => res.json())
            .catch(this.handleError);
    }

    // this could also be a private method of the component class
    private handleError(error: any) {
        // log error
        // could be something more sofisticated
        let errMsg = (error.message) ? error.message :
            error.status ? `${error.status} - ${error.statusText}` : 'Server error';
        
        // throw an application level error
        return Observable.throw(errMsg);
    }

    /* 
        setActiveSelection(item: ActiveService) {

            this.store.dispatch({ type: 'UPDATE_ACTIVE_SELECTION', payload: entInfo });
        }
    */

}
