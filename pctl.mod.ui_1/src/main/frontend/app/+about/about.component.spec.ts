import {TestBed} from '@angular/core/testing/test_bed';
import {About} from './about.component';

describe('About', () => {

  let component: any;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [],
      declarations: [About]
    });

    TestBed.overrideComponent(About, {
      set: {
        // you can override values here
      }
    });
  });

  beforeEach(() => {
    let fixture = TestBed.createComponent(About);
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
