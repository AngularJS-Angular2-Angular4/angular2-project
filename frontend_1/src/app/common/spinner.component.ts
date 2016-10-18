import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'spinner',
  templateUrl: './spinner.component.html'
})
export class SpinnerComponent {
    @Input() loading: boolean;
}
