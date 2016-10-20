/* tslint:disable */
import { Injectable, Inject, OnInit } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { Observer } from 'rxjs/Observer';

import { Store } from '@ngrx/store';
import { AppStore } from '../models/appstore.model';
import { ShoppingCart, LineItem, SDWANLocationInfo, LocationInfo } from '../models/cart.model';
import { FingerPrintService } from './fingerprint.service';
import { AuthService } from './auth.service';



const BASE_URL = 'http://localhost:3001/cart/';
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json' }) };


@Injectable()
export class CartService implements OnInit {
    cart: Observable<ShoppingCart>;
    constructor(
        private http: Http, public store: Store<AppStore>,
        public authService: AuthService
    ) {
        this.cart = <Observable<ShoppingCart>>store.select('cart');
    }

    ngOnInit() {

    }

    loadItems() {
        this.http.get(BASE_URL)
            .map(res => res.json())
            .map(payload => ({ type: 'ADD_ITEMS', payload }))
            .subscribe(action => this.store.dispatch(action));
    }

    createCart(item: ShoppingCart) {
        this.http.post(`${BASE_URL}`, JSON.stringify(item), HEADER)
            .map(res => res.json())
            .map(payload => ({ type: 'CREATE_CART', payload }))
            .subscribe(action => {
                this.store.dispatch(action);
                this.authService.updateCartInfo(action.payload);
            }   
                );
      //  this.store.dispatch({ type: 'CREATE_CART', payload: item });            
    }

    updateItem(item: LineItem) {
        this.http.put(`${BASE_URL}${item.id}`, JSON.stringify(item), HEADER)
            .subscribe(action => this.store.dispatch({ type: 'UPDATE_ITEM', payload: item }));
    }

    updateLocation(item: LocationInfo) {
        this.http.put(`${BASE_URL}`, JSON.stringify(item), HEADER)
            .subscribe(action => this.store.dispatch({ type: 'UPDATE_LOCATION', payload: item }));
    }

    deleteItem(item: LineItem) {
        this.http.delete(`${BASE_URL}${item.id}`)
            .subscribe(action => this.store.dispatch({ type: 'DELETE_ITEM', payload: item }));
    }

    deleteLocation(item: LocationInfo) {
         this.http.put(`${BASE_URL}`, JSON.stringify(item), HEADER)
            .subscribe(action => this.store.dispatch({ type: 'DELETE_LOCATION', payload: item }));
    }

    addItem(item: LineItem) {
         this.http.post(`${BASE_URL}`, JSON.stringify(item), HEADER)
            .map(res => res.json())
            .map(payload => ({ type: 'ADD_ITEM', payload }))
            .subscribe(action => this.store.dispatch(action));
      //      this.store.dispatch({ type: 'ADD_ITEM', payload: item });
    }

    public initCart(): ShoppingCart {
        //TODO: Call API to get cart ID from Cart Microservice
        // for now generating our own ID
        let cart: ShoppingCart;	
        cart = {	
         id: FingerPrintService.UUID(),
         lineItems: []		
        };
        this.createCart(cart);
        return cart;
    }   

    private addCartItem() {		
       let cart: ShoppingCart;		
       let lineItem: LineItem;
       


       cart = {	

         lineItems: []		
       };	

       this.createCart(cart);		
   		
     }		
   		
 
}
