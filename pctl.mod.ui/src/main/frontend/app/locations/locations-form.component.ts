import { Component, Input, EventEmitter, OnInit, Output } from '@angular/core';
import {
  EnterpriseAddress,
  ContactInfo,
  SDWANLocationInfo
} from '../common/models/cart.model';
import { Observable } from 'rxjs/Observable';
import { ActivatedRoute } from '@angular/router';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { Location } from '../common/models/locations.model';

import { FingerPrintService } from '../common/service/fingerprint.service';
import { Validations } from '../common/validations/validations';

@Component({
  selector: 'locations-form',
  templateUrl: './locations-form.component.html'
})
export class LocationsFormComponent implements OnInit {
  form: FormGroup;
  locationInfo: SDWANLocationInfo;
  @Output() locationEvent = new EventEmitter();
  //  EnterpriseAddress
  //  ContactInfo
  //  SDWANLocationInfo

  constructor(private fb: FormBuilder) {
     this.form = this.fb.group({
        'email': ['', [Validators.required, Validations.emailValidator]],
        'firstName': ['', [Validators.required, Validators.minLength(3)]],
        'lastName': ['', Validators.required],
        'primaryPhone': ['', [Validators.required, Validations.phoneValidator]],
        'locationName': ['', [Validators.required, Validators.minLength(3)]],
        'address': [''],
        'street': [''],
        'country': ['', Validators.required],
        'city': [''],
        'state': [''],
        'zipCode': ['', Validations.zipCodeValidator],
        'checkAddress': [''],
        'shippingLocationName': ['', Validators.required],
        'shippingAddress': [''],
        'shippingStreet': [''],
        'shippingCountry': ['', Validators.required],
        'shippingCity': [''],
        'shippingState': [''],
        'shippingZipCode': ['', Validations.zipCodeValidator]

    });
  }

  ngOnInit() {
    // prepopulate form
  }

  onSubmit() {
    this.locationInfo = this.form.value;
    this.locationInfo = Object.assign({},
                        this.locationInfo,
                        { id: FingerPrintService.UUID()}
                        );
    console.log(this.locationInfo);

    //this.locations.push(this.form.value);
    //console.info(this.locations);
    //this.form.reset();
     this.locationEvent.emit(this.locationInfo);
  }


}
