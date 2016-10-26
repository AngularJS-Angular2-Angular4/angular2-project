import {
  Component, Input, EventEmitter, OnInit, Output,
  AfterViewInit
} from '@angular/core';
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
  styleUrls: [ './locations-form.component.css' ],
  templateUrl: './locations-form.component.html'
})
export class LocationsFormComponent implements OnInit {
  public myForm: FormGroup;
  locationInfo: SDWANLocationInfo;
  @Input() data: SDWANLocationInfo;
  @Output() locationEvent = new EventEmitter();
  submitted: boolean;

  @Input() set formData(formData: SDWANLocationInfo) {
    //console.log(formData);
    this.data = formData;
    if (formData !== undefined) {
      console.log(formData);
      document.getElementById('email').focus();
      this.populateForm();
    }

  }

  constructor(private fb: FormBuilder) {

  }

  resetDataModel() {
    this.data = {
      id: '',
      serviceContact: {
        id: '',
        email: '',
        firstName: '',
        lastName: '',
        phoneNumber: '',
      },
      serviceAddress: {
        id: '',
        locationName: '',
        addressLine: '',
        street: '',
        city: '',
        country: '',
        state: '',
        zipCode: ''
      },
      shippingAddress: {
        id: '',
        locationName: '',
        addressLine: '',
        street: '',
        city: '',
        country: '',
        state: '',
        zipCode: '',
        checkAddress: ''
      }
    };
  }
  populateForm() {
    (<FormGroup>this.myForm)
      .setValue(this.data, { onlySelf: true });
  }

  ngOnInit() {
    this.submitted = false;
    // prepopulate form
    this.resetDataModel();


    this.myForm = this.fb.group({
      id: [''],
      serviceContact: this.fb.group({
        id: [''],
        email: ['', [<any>Validators.required, <any>Validations.emailValidator]],
        firstName: ['', [<any>Validators.required, <any>Validators.minLength(3), <any>Validations.nameValidator]],
        lastName: ['', [<any>Validators.required, <any>Validations.nameValidator]],
        phoneNumber: ['', [<any>Validators.required, <any>Validations.phoneValidator]],
      }),
      serviceAddress: this.fb.group({
        id: [''],
        locationName: ['', [<any>Validators.required, <any>Validators.minLength(3)]],
        addressLine: ['', <any>Validators.required],
        street: [''],
        city: ['', [<any>Validators.required, <any>Validations.nameValidator]],
        country: ['', <any>Validators.required],
        state: ['', <any>Validators.required],
        zipCode: ['', <any>Validations.zipCodeValidator],
      }),
      shippingAddress: this.fb.group({
        id: [''],
        checkAddress: [''],
        locationName: ['', [<any>Validators.required, <any>Validators.minLength(3)]],
        addressLine: ['', <any>Validators.required],
        street: [''],
        city: ['', [<any>Validators.required, <any>Validations.nameValidator]],
        country: ['', <any>Validators.required],
        state: ['', <any>Validators.required],
        zipCode: ['', <any>Validations.zipCodeValidator],
      })
    });
    (<FormGroup>this.myForm)
      .setValue(this.data, { onlySelf: true });
    this.populateForm();

  }

  onSubmit() {
    this.submitted = true;
    this.locationInfo = this.myForm.value;
    if (this.locationInfo.id === '') {
      this.locationInfo = Object.assign({},
        this.locationInfo,
        { id: FingerPrintService.UUID() }
      );
    }
    console.log(this.locationInfo);

    this.resetDataModel();
    this.populateForm();
    //this.myForm.markAsPristine
    this.myForm.markAsUntouched();
    // this.myForm.reset();
    this.locationEvent.emit(this.locationInfo);
  }

  
  onClickCheckAddress(checked){
        if(checked){
         this.myForm.value.shippingAddress.locationName=this.myForm.value.serviceAddress.locationName;
         this.myForm.value.shippingAddress.addressLine=this.myForm.value.serviceAddress.addressLine;
         this.myForm.value.shippingAddress.street=this.myForm.value.serviceAddress.street;
         this.myForm.value.shippingAddress.city=this.myForm.value.serviceAddress.city;
         this.myForm.value.shippingAddress.country=this.myForm.value.serviceAddress.country;
         this.myForm.value.shippingAddress.state=this.myForm.value.serviceAddress.state;
         this.myForm.value.shippingAddress.zipCode=this.myForm.value.serviceAddress.zipCode;

         this.myForm.patchValue({shippingAddress:{locationName: this.myForm.value.shippingAddress.locationName,
           addressLine:this.myForm.value.shippingAddress.addressLine,
           street:this.myForm.value.shippingAddress.street,
           city:this.myForm.value.shippingAddress.city,
           country:this.myForm.value.shippingAddress.country,
           state:this.myForm.value.shippingAddress.state,
           zipCode:this.myForm.value.shippingAddress.zipCode,
          }});
        }else{

          this.myForm.patchValue({shippingAddress:{
           locationName: '',
           addressLine:'',
           street:'',
           city:'',
           country:'',
           state:'',
           zipCode:'',
          }});

        }
  }



}
