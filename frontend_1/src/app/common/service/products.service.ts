/* tslint:disable */
import { Injectable, Inject, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Observer } from 'rxjs/Observer';

import { Store } from '@ngrx/store';
import { AppStore } from '../models/appstore.model';
import { Product } from '../models/product.model';




/* Authentication Service for
      1) Storing the current auth token (if loggedIn)
      2) Handle login and logout methods
*/

const BASE_URL = 'http://localhost:3001/products/';
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json' }) };


@Injectable()
export class ProductsService implements OnInit {
    product: Observable<Product>;
    constructor(
        private http: Http, public store: Store<AppStore>
    ) {
        this.product = <Observable<Product>>store.select('products');
    }

    ngOnInit() {

    }

    loadProduct(): Observable<Product> {
        return this.http.get(BASE_URL + '/1')
            .map(res => res.json())
            .catch(this.handleError);
//            .map(payload => ({ type: 'ADD_PRODUCTS', payload }))
  //          .catch(this.handleError);
         //   .subscribe(action => this.store.dispatch(action));
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

}
