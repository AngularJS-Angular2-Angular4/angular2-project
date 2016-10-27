/* tslint:disable */
import { Http, Headers, RequestOptions } from '@angular/http';
import { Injectable, Inject, OnInit } from '@angular/core';

import { Observable } from 'rxjs/Rx';
import { Router } from '@angular/router';

import { ContactUs } from '../models/contact-us.model';

const BASE_URL = 'http://ds-1078d24c5e66:8086/contact/';
const HEADER = { headers: new Headers({ 'Content-Type': 'application/json' }) };

@Injectable()
export class ContactService implements OnInit {

    constructor(private router: Router,private http: Http){}

    ngOnInit() {

    }

    persist(item : ContactUs){
        console.log(JSON.stringify(item));
        this.http.post(`${BASE_URL}`, JSON.stringify(item), HEADER)
            .map(res => res.json())
            .catch(this.customErrorHandler);
            console.log("coming here");
        this.router.navigate(['/thanks']);
    }

    private customErrorHandler(e : any) {
		console.log(e);
        this.router.navigate(['/thanks']);
        return Observable.throw(e);
	}

}
