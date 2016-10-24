import { inject, TestBed } from '@angular/core/testing';
import { Component } from '@angular/core';


import { ContactUsComponent } from './contact-us.component';

describe('Contact Us', () => {
    beforeEach(() => TestBed.configureTestingModule({
        providers: [
            ContactUsComponent
        ]
    }));
    it('Has First Name? ', inject([ ContactUsComponent ], (contactUs: ContactUsComponent) => {
        expect(contactUs.firstName.value).toEqual({ value: ''});
    }));
});
