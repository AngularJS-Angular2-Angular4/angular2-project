/* tslint:disable */
import { inject, TestBed } from '@angular/core/testing';
import { Component } from '@angular/core';


import { ContactUsComponent } from './contact-us.component';
import { ContactService } from '../service/contact.service';

describe('Contact Us', () => {
    beforeEach(() => TestBed.configureTestingModule({
        providers: [
            ContactUsComponent,
            ContactService
        ]
    }));
    it('Has First Name? ', inject([ ContactUsComponent ], (contactUs: ContactUsComponent) => {
        expect(contactUs.firstName.value).toEqual({ value: ''});
    }));
});
