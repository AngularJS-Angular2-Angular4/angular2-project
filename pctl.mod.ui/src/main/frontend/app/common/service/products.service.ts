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

//const BASE_URL = 'http://localhost:3001/productMS/';
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json'}) };

@Injectable()
export class ProductsService implements OnInit {
    product: Observable<Product>;
    baseURL: string;
    constructor(
        private http: Http, public store: Store<AppStore>
    ) {
        this.product = <Observable<Product>>store.select('products');
    }

    ngOnInit() {

    }

    loadProduct(): Observable<Product> {
        return this.http.get(BASE_URL_PRODUCTS,this.jwt())
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
    private jwt() {
            // create authorization header with jwt token
            let jwtTok = 'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhcGljbGllbnRAY3RsLmNvbSIsImlzcyI6IkN0bCIsImlhdCI6MTQ3NzQyMzA3NSwiZXhwIjoxNjMyOTQzMDc1fQ.x459-spv6AqdsZE-M9uXFoX183Og0VuTba5aGhakugmZULa9ntaRWWm_757ybLuey8amxbUx8Kp6o_JDnn4Fxg';
            if (jwtTok) {
                let headers = new Headers({'X-Authorization':'Bearer ' + jwtTok,'Content-Type': 'application/json'});
                return new RequestOptions({ headers: headers});

            }

    }


}
