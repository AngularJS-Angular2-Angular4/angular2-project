import {TestBed} from '@angular/core/testing/test_bed';
import {Component} from '@angular/core';
import {XLarge} from './x-large.directive.ts';


describe('x-large directive', () => {

  // Create a test component to test directives
  @Component({
    template: '<div x-large>Content</div>',
    directives: [XLarge]
  })
  class TestComponent {
  }

  let nativeElement: any;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        XLarge
      ],
      imports: [],
      declarations: [
        TestComponent
      ]
    });

  });

  beforeEach(() => {
    let fixture = TestBed.createComponent(TestComponent);
    fixture.detectChanges();

    nativeElement = fixture.nativeElement;
  });

  it('should sent font-size to x-large', () => {
    console.log(nativeElement);
    let compiled = nativeElement.children[0];
    expect(compiled.style.fontSize).toBe('x-large');
  });

});
