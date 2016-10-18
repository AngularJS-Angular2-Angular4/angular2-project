import {LocationStrategy, PathLocationStrategy} from '@angular/common';
import {NgModuleFactoryLoader} from '@angular/core';
import {NG2_WEBSTORAGE} from 'ng2-webstorage';
import {AUTH_PROVIDERS} from '../../app/app.routes';
import {AsyncNgModuleLoader} from './webpack';


/*
 * Application Providers/Directives/Pipes
 * providers/directives/pipes that only live in our browser environment
 */
export const APPLICATION_PROVIDERS = [
  ...NG2_WEBSTORAGE,
  ...AUTH_PROVIDERS,
  {
    provide: NgModuleFactoryLoader,
    useClass: AsyncNgModuleLoader,
  },
  {
    provide: LocationStrategy,
    useClass: PathLocationStrategy as any
  },
];

export const PROVIDERS = [
  ...APPLICATION_PROVIDERS
];
