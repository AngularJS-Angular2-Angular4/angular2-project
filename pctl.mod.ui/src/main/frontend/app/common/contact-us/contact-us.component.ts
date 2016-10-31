import { Component, OnInit } from '@angular/core';
// import { ControlGroup, Control, Validators } from '@angular/common';
import { FormGroup,
         FormControl,
         Validators,
         FormBuilder,
         ReactiveFormsModule } from '@angular/forms';

import { ContactUs } from './../models/contact-us.model';
import { ContactService } from '../service/contact.service';
import { Validations } from './common/validations/validations';

@Component({
  selector: 'contact-us',
  templateUrl: './contact-us.component.html',
  styles: ['.contactus-alert { color: #E82C0C; margin: 6px 0; }']
})
export class ContactUsComponent implements OnInit {
  form: FormGroup;
  /*ControlGroup({
    firstName: new Control('', Validators.required),
    lastName: new Control('', Validators.required),
    primaryPhone: new Control('', Validators.required),
    email: new Control('', Validators.required),
    companyName: new Control('', Validators.required),
    jobTitle: new Control('', Validators.required),
    comments: new Control('', Validators.required)
  });*/

          firstName = new FormControl('', [Validators.required, Validators.minLength(3),
          Validators.pattern('[A-Za-z ]{3,30}')]);
          lastName = new FormControl('', [Validators.required,
          Validators.pattern('[A-Za-z ]{1,30}')]);
          primaryPhone = new FormControl('', [Validators.required,
          Validators.pattern('[0-9]{10}')]);
          email = new FormControl('', [Validators.required, Validators.pattern(
            "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]" +
            "(?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")]);
          companyName = new FormControl('');
          jobTitle = new FormControl('');
          comments = new FormControl('');

  constructor(public contactService: ContactService, _form: FormBuilder) {
        this.form = _form.group({
          'firstName': this.firstName,
          'lastName': this.lastName,
          'primaryPhone': this.primaryPhone,
          'email': this.email,
          'companyName': this.companyName,
          'jobTitle': this.jobTitle,
          'comments': this.comments
        });
  }



  ngOnInit() {
    // this.form = this._form.group({
    //   firstName: new FormControl("", Validators.required),
    //   lastName: new FormControl("", Validators.required),
    //   primaryPhone: new FormControl("", Validators.required),
    //   email: new FormControl("", Validators.required),
    //   companyName: new FormControl("", Validators.maxLength(55)),
    //   jobTitle: new FormControl("", Validators.maxLength(55)),
    //   comments: new FormControl("", Validators.minLength(25))
    // });
  }

  contactUs() {
    // console.log("FORM VALUES: " + this.form.value);
    let contact: ContactUs;
    contact = {
      firstName: this.form.value.firstName,
      lastName: this.form.value.lastName,
      primaryPhone: this.form.value.primaryPhone,
      email: this.form.value.email,
      companyName: this.form.value.companyName,
      jobTitle: this.form.value.jobTitle,
      comments: this.form.value.comments
    };
    this.contactService.persist(contact);
  }
}
