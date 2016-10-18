import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {BrowserModule} from '@angular/platform-browser';
import {About} from './about.component';
import {MdButtonModule} from '@angular2-material/button';
import {MdCardModule} from '@angular2-material/card';
import {MdCheckboxModule} from '@angular2-material/checkbox';
import {MdGridListModule} from '@angular2-material/grid-list';
import {MdIconModule} from '@angular2-material/icon';
import {MdInputModule} from '@angular2-material/input';
import {MdListModule} from '@angular2-material/list';
import {MdProgressBarModule} from '@angular2-material/progress-bar';
import {MdProgressCircleModule} from '@angular2-material/progress-circle';
import {MdRadioModule} from '@angular2-material/radio';
import {MdSidenavModule} from '@angular2-material/sidenav';
import {MdSlideToggleModule} from '@angular2-material/slide-toggle';
import {MdTabsModule} from '@angular2-material/tabs';
import {MdToolbarModule} from '@angular2-material/toolbar';
import {MdCoreModule} from '@angular2-material/core';

export const ROUTER_CONFIG = [
  {path: '', component: About, pathMatch: 'full'}
];

@NgModule({
  imports: [
    RouterModule.forChild(ROUTER_CONFIG),
    FormsModule,
    BrowserModule,
    MdButtonModule,
    MdCardModule,
    MdCheckboxModule,
    MdGridListModule,
    MdIconModule,
    MdInputModule,
    MdListModule,
    MdProgressBarModule,
    MdProgressCircleModule,
    MdRadioModule,
    MdSidenavModule,
    MdSlideToggleModule,
    MdTabsModule,
    MdToolbarModule,
    MdCoreModule,
  ],
  declarations: [About],
  bootstrap: [About]
})
export class AboutModule {
  static routes = ROUTER_CONFIG;
}
