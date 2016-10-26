/* tslint:disable */
import { Injectable, Inject, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Observer } from 'rxjs/Observer';
import { Router } from '@angular/router';
import { Store } from '@ngrx/store';
import { AppStore } from '../models/appstore.model';
import { User, EnterpriseInfo , CartInfo} from '../models/user.model';
import { CartState,ShoppingCart } from '../models/cart.model';





/* Authentication Service for
      1) Storing the current auth token (if loggedIn)
      2) Handle login and logout methods
*/

const BASE_URL = 'http://localhost:3001/user/';
const GET_USER_URL = "/auth/user/me";
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json' }) };


@Injectable()
export class AuthService implements OnInit {
    user: Observable<User>;
    constructor(
        private http: Http,
        private router: Router,
        public store: Store<AppStore>
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
            /*    this.addCartInfo(<CartInfo>{
                    cartState: CartState.LandingPage,
                    shoppingCartId: '',
                    cartItemCount: 2
                });*/
             //   this.getUserDetails();
                this.router.navigate(['/home']);
            });

    }

    public logout() {

        //this.http.delete(`${BASE_URL}${user.id}`)
         //   .subscribe(action => this.store.dispatch({ type: 'DELETE_USER', payload: user }));
         this.store.dispatch({ type: 'DELETE_USER', payload: {} });
         this.updateUserCartInfo(<CartInfo>{
                    cartState: CartState.LandingPage,
                    shoppingCartId: '',
                    cartItemCount: 0
                });
        this.getUserDetails();
    }

    public init() {

       this.store.dispatch({ type: 'INIT_USER'});

    }

    public addUserInfo(entInfo: EnterpriseInfo) {
        this.store.dispatch({ type: 'UPDATE_ENT_DETAILS', payload: entInfo });
    }

    public updateUserCartInfo(cartInfo: CartInfo) {
       // console.log(cartInfo);
        this.store.dispatch({ type: 'UPDATE_CART_DETAILS', payload: {
           cartInfo: cartInfo
        } });
    }

    public updateUserCartInfoFromCart(shoppingCart: ShoppingCart) {
        this.updateUserCartInfo( <CartInfo>{
                    cartState: CartState.LandingPage,
                    shoppingCartId: shoppingCart.id,
                    cartItemCount: shoppingCart.lineItems.length
                });
    }

    public check() {
   //     return this.user.isLoggedIn;
    }

    public getUserDetails() {
        return this.http.get(`${GET_USER_URL}`, this.jwt())
            .map(res => res.json())
            .subscribe( user => console.log(user),
                error => console.log(error));
    }

    private jwt() {
        // create authorization header with jwt token
        let jwtTok = 'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYmVnaW5zYW11ZWxAZ21haWwuY29tIiwic2NvcGVzIjpbIlJPTEVfVVNFUiIsIlJPTEVfVVNFUiJdLCJpc3MiOiJDdGwiLCJpYXQiOjE0NzY4NzYzMTQsImV4cCI6MTQ3OTQ2ODMxNH0.KyWVkQFLvsQr9vlKJUZDy-hEt7EtO5RM1tNu_Scd25poEGhSgUnXq1Dq0IiYh8Suv5NH8EY8L44wX3uNI3YMNw';
        if (jwtTok) {
            let headers = new Headers({'X-Authorization':'Bearer ' + jwtTok,'Content-Type': 'application/json'});
            return new RequestOptions({ headers: headers});

        }

    }


}
