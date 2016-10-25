import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login.component';
import { SignUpComponent } from './sign-up.component';

@NgModule({
    imports: [ FormsModule,
    ReactiveFormsModule,
    CommonModule],
    exports: [ SignUpComponent,
                LoginComponent ],
    declarations: [ SignUpComponent ,
                    LoginComponent ],
    providers: [],
})
export class UserAndSecurityModule { }