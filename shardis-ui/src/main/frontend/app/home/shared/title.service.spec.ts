import {async, inject} from '@angular/core/testing';
import {BaseRequestOptions, Http, ResponseOptions, Response} from '@angular/http';
import {MockBackend} from '@angular/http/testing';
import {Title} from './title.service';
import {AuthService} from '../../shared';
import {TestBed} from '@angular/core/testing/test_bed';

describe('Title', () => {

  let title: Title;

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
        AuthService,
        Title
      ],
      declarations: []
    });
  });


  beforeEach(inject([Title], (t) => {
    title = t;
  }));

  it('should have http', () => {
    expect(!!title.http).toEqual(true);
  });

  it('should get data from the server', async(inject([MockBackend], (backend) => {
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

    return new Promise((pass, fail) => {
      title.getData().subscribe(
        (next) => {
          expect(console.log).toHaveBeenCalled();
          expect(next).toEqual({value: 'API SERVER IS ALIVE'});
          pass();
        }, (error) => {
          fail(error);
        }
      );

    });

  })));

});
