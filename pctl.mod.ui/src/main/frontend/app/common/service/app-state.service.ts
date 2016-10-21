import { Injectable, Inject, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { AppStore } from '../models/appstore.model';



@Injectable()
export class AppStateService implements OnInit {

    public getState(): AppStore {
        let state: AppStore;
        this.store.take(1).subscribe(s => state = s);
        return state;
    }

    constructor(
        public store: Store<AppStore>) {

    }


    ngOnInit() {

    }




}
