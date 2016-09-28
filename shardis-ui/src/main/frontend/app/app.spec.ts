import {App} from './app.component';
import {AuthService} from './shared';
import {BrowserModule} from '@angular/platform-browser';
import {BaseRequestOptions, Http} from '@angular/http';
import {MockBackend} from '@angular/http/testing/mock_backend';
import {MdInputModule} from '@angular2-material/input';
import {FormsModule} from '@angular/forms';
import {TestBed} from '@angular/core/testing/test_bed';
import {Router, ActivatedRoute, RouterModule} from '@angular/router';
import {MockRouter} from './shared/testing';
import {MockActivatedRoute} from './shared/testing/mock.activated.route';
import {LocationStrategy, PathLocationStrategy, APP_BASE_HREF} from '@angular/common';

describe('App', () => {

  let component: any;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        BaseRequestOptions,
        MockBackend,
        {
          provide: Http,
          useFactory: function (backend, defaultOptions) {
            return new Http(backend, defaultOptions);
          },
          deps: [MockBackend, BaseRequestOptions]
        },
         {provide: Router, useClass: MockRouter},
         {provide: ActivatedRoute, useClass: MockActivatedRoute},
        {
          provide: LocationStrategy,
          useClass: PathLocationStrategy as any
        },
        {
          provide: APP_BASE_HREF,
          useValue: '/'
        },
        AuthService
      ],
      imports: [
        BrowserModule,
        FormsModule,
        MdInputModule,
        RouterModule.forRoot([]),
      ],
      declarations: [
        App
      ]
    });

    TestBed.overrideComponent(App, {
      set: {
        // you can override values here
      }
    });
  });

  beforeEach(() => {
    let fixture = TestBed.createComponent(App);
    fixture.detectChanges();

    component = fixture.componentInstance;
  });


  it('should have a url', () => {
    expect(component.url).toEqual('https://github.com/kucharzyk');
  });

});
