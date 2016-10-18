import {TestBed} from '@angular/core/testing/test_bed';
import {BaseRequestOptions, Http} from '@angular/http';
import {MockBackend} from '@angular/http/testing';
import {AuthService} from '../shared';
import {OrderComponent} from './order.component';
import {MdInputModule} from '@angular2-material/input';
import {FormsModule} from '@angular/forms';

// Load the implementations that should be tested

describe('OrderComponent', () => {

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
        AuthService
      ],
      imports: [
        FormsModule,
        MdInputModule
      ],
      declarations: [
        OrderComponent
      ]
    });

    TestBed.overrideComponent(OrderComponent, {
      set: {
        // you can override values here
      }
    });
  });

  beforeEach(() => {
    let fixture = TestBed.createComponent(OrderComponent);
    fixture.detectChanges();

    component = fixture.componentInstance;
  });


  it('should log ngOnInit', () => {
    spyOn(console, 'log');
    expect(console.log).not.toHaveBeenCalled();

    component.ngOnInit();
    expect(console.log).toHaveBeenCalled();
  });

});
