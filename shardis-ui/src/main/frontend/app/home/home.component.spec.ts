import {inject} from '@angular/core/testing';
import {TestBed} from '@angular/core/testing/test_bed';
import {BaseRequestOptions, Http, Response, ResponseOptions} from '@angular/http';
import {MockBackend} from '@angular/http/testing';
import {Home} from './home.component';
import {Title} from './shared';
import {AuthService} from '../shared';
import {MdInputModule} from '@angular2-material/input';
import {FormsModule} from '@angular/forms';


// Load the implementations that should be tested

describe('Home', () => {

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
        Title,
        AuthService
      ],
      imports: [
        FormsModule,
        MdInputModule
      ],
      declarations: [Home]
    });

    TestBed.overrideComponent(Home, {
      set: {
        // you can override values here
      }
    });
  });

  beforeEach(() => {
    let fixture = TestBed.createComponent(Home);
    fixture.detectChanges();

    component = fixture.componentInstance;
  });


  it('should have default data', () => {
    expect(component.data).toEqual({value: ''});
  });

  it('should have a title', () => {
    expect(!!component.title).toEqual(true);
  });

  it('should log ngOnInit', inject([MockBackend], (backend) => {

    spyOn(console, 'log');
    expect(console.log).not.toHaveBeenCalled();

    var mockedResponse = new Response(
      new ResponseOptions({
          body: '{"value":"API SERVER IS ALIVE"}'
        }
      ));

    backend.connections.subscribe(connection => {
      connection.mockRespond(mockedResponse);
    });

    component.ngOnInit();

    expect(console.log).toHaveBeenCalled();
  }));

});
