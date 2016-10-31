import { Component, Input } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Validations } from './validations';

@Component({
  selector: 'control-messages',
  template: `<span style="color: #E82C0C; margin: 6px 0;" *ngIf="errorMessage !== null" >
  {{errorMessage}}</span>`
})
export class ControlMessagesComponent {
  @Input() control: FormControl;
  constructor() { }

  get errorMessage() {
    for (let propertyName in this.control.errors) {
      if (this.control.errors.hasOwnProperty(propertyName) && this.control.touched) {
        return Validations.getValidatorErrorMessage(propertyName,
        this.control.errors[propertyName]);
      }
    }
    return null;
  }
}
