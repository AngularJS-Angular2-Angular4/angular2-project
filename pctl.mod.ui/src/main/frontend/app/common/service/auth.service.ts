/* tslint:disable */
import { Injectable, Inject, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Observer } from 'rxjs/Observer';

import { Store } from '@ngrx/store';
import { AppStore } from '../models/appstore.model';
import { User, EnterpriseInfo , CartInfo} from '../models/user.model';
import { CartState } from '../models/cart.model';




/* Authentication Service for
      1) Storing the current auth token (if loggedIn)
      2) Handle login and logout methods
*/

const BASE_URL = 'http://localhost:3001/user/';
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json' }) };


@Injectable()
export class AuthService implements OnInit {
    user: Observable<User>;
    constructor(
        private http: Http,public store: Store<AppStore>
    ) {
       this.user = <Observable<User>> store.select('user');
    }

    ngOnInit() {
       
    }

 
    public login(username: String, password?: String) {
        
        let user: User = {
            id: 1,
            email: username.toString(),
            loggedIn: true
        }

        this.http.post(`${BASE_URL}`, JSON.stringify(user), HEADER)
            .map(res => res.json())
            .map(payload => ({ type: 'CREATE_USER', payload }))
            .subscribe(action => {
                this.store.dispatch(action)
                this.addCartInfo(<CartInfo>{
                    cartState: CartState.LandingPage,
                    shoppingCartId: '',
                    cartItemCount: 2
                })
            });

    }

    public logout() {

        //this.http.delete(`${BASE_URL}${user.id}`)
         //   .subscribe(action => this.store.dispatch({ type: 'DELETE_USER', payload: user }));
         this.store.dispatch({ type: 'DELETE_USER', payload: {} });
    }

    public init() {

       this.store.dispatch({ type: 'INIT_USER'});

    }

    public addUserInfo(entInfo: EnterpriseInfo) {
        this.store.dispatch({ type: 'UPDATE_ENT_DETAILS', payload: entInfo });
    }

    public addCartInfo(cartInfo: CartInfo) {
        this.store.dispatch({ type: 'UPDATE_CART_DETAILS', payload: {
           cartInfo: cartInfo
        } });
    }

    public check() {
   //     return this.user.isLoggedIn;
    }


}
