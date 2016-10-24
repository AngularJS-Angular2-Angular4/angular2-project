import { Component, Input, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormGroup,
  FormControl,
  Validators,
  AbstractControl,
	ReactiveFormsModule
} from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../common/service/auth.service';
import { User } from '../common/models/user.model';

@Component({
  selector: 'login',
  templateUrl: './login.component.html'
})
export class LoginComponent implements OnInit {

loginForm: FormGroup;
isLoading: boolean = false;
error: boolean = false;
@Input() user: User;

  constructor(private fb: FormBuilder, public authService: AuthService, private router: Router) {

			this.loginForm = fb.group ({
				username: ['', Validators.compose(
					[Validators.required, (control: FormControl): { [s: string]: boolean } => {
			if (control.value.indexOf(' ') >= 0) {
				return { cannotContainSpace: true};
			}
			return undefined;
	}]
					)],
				password: ['', Validators.required],
				remember: ['']
			});

		}

        login() {
            console.log(this.loginForm.value.username);
            this.isLoading = true;
            this.authService.login(this.loginForm.value.username, this.loginForm.value.password);
        }
        ngOnInit() {
            let userDet = localStorage.getItem('user');
            this.user = JSON.parse(localStorage.getItem('user'));
            if (this.user && this.user.email.trim().length != 0) {
                this.router.navigate(['/home']);
            }
        }
}
