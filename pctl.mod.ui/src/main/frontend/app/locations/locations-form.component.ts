import { Component, Input, EventEmitter, OnInit, Output,
  AfterViewInit } from '@angular/core';
import {
  EnterpriseAddress,
  ContactInfo,
  SDWANLocationInfo,
  LocationsFormModel
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
  @Input() data: LocationsFormModel;
  @Output() locationEvent = new EventEmitter();
  //  EnterpriseAddress
  //  ContactInfo
  //  SDWANLocationInfo

  @Input() set formData(formData: LocationsFormModel) {
    this.data = formData;
    this.createForm();
  }

  constructor(private fb: FormBuilder) {
    this.resetDataModel();
    this.createForm();
  }

  resetDataModel() {
    this.data = {
      id: '',
      contactid: '',
      email: '',
      firstName: '',
      lastName: '',
      primaryPhone: '',
      contactAddressid: '',
      locationName: '',
      address: '',
      street: '',
      country: '',
      city: '',
      state: '',
      zipCode: '',
      checkAddress: '',
      shippingAddressid: '',
      shippingLocationName: '',
      shippingAddress: '',
      shippingStreet: '',
      shippingCountry: '',
      shippingCity: '',
      shippingState: '',
      shippingZipCode: ''
    };
  }
  createForm() {
    this.form = this.fb.group({
      'contactid': [''],
      'email': ['', [Validators.required, Validations.emailValidator]],
      'firstName': ['', [Validators.required, Validators.minLength(3)]],
      'lastName': ['', Validators.required],
      'primaryPhone': ['', [Validators.required, Validations.phoneValidator]],
      'contactAddressid': [''],
      'locationName': ['', [Validators.required, Validators.minLength(3)]],
      'address': [''],
      'street': [''],
      'country': ['', Validators.required],
      'city': [''],
      'state': [''],
      'zipCode': ['', Validations.zipCodeValidator],
      'checkAddress': [''],
      'shippingAddressid': [''],
      'shippingLocationName': ['', Validators.required],
      'shippingAddress': [''],
      'shippingStreet': [''],
      'shippingCountry': ['', Validators.required],
      'shippingCity': [''],
      'shippingState': [''],
      'shippingZipCode': ['', Validations.zipCodeValidator]

    });
  
//this.form.controls['contactid'].setValue = this.data.contactid;

   // this.form.setValue()
  }

  ngOnInit() {
    // prepopulate form
  }

  onSubmit() {
    this.locationInfo = this.form.value;
    this.locationInfo = Object.assign({},
      this.locationInfo,
      { id: FingerPrintService.UUID() }
    );
    console.log(this.locationInfo);

    //this.locations.push(this.form.value);
    //console.info(this.locations);
    //this.form.reset();

    this.resetDataModel();
    this.createForm();
    this.locationEvent.emit(this.locationInfo);
  }


}
