import { Component, Input } from '@angular/core';
import { Breadcrumb } from '../models/breadcrumb.model';

@Component({
  selector: 'breadcrumb',
  templateUrl: './breadcrumb.component.html'
})
export class BreadcrumbComponent {

  @Input() breadcrumbs: Breadcrumb[];
  @Input() homePage: boolean;

}
