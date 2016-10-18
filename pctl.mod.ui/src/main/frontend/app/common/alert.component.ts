import { Component, Input, Output, EventEmitter } from '@angular/core';

import { Alert } from './models/alert.model';

@Component({
  selector: 'alert-block',
  templateUrl: './alert.component.html'
})
export class AlertComponent {
    alert: Alert;

    @Input() set message(value: Alert) {
    //  console.log(value);
     this.alert = Object.assign({}, value);
   }
}
