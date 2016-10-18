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
      serviceContact: this.fb.group({
        email: new FormControl('', Validators.required),
        firstName: new FormControl(''),
        lastName: new FormControl(''),
        primaryPhone: new FormControl('')
      }),
      serviceAddress: this.fb.group({
        locationName: new FormControl('', Validators.required),
        address: new FormControl(''),
        street: new FormControl(''),
        country: new FormControl('', Validators.required),
        city: new FormControl(''),
        state: new FormControl(''),
        zipCode: new FormControl('')
      }),
      shippingAddress: this.fb.group({
        checkAddress: new FormControl(),
        shippingLocationName: new FormControl('', Validators.required),
        shippingAddress: new FormControl(''),
        shippingStreet: new FormControl(''),
        shippingCountry: new FormControl('', Validators.required),
        shippingCity: new FormControl(''),
        shippingState: new FormControl(''),
        shippingZipCode: new FormControl('')
      })
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
