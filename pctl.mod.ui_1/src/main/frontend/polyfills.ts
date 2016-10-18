// Ccre.js
import 'core-js/es6';
import 'core-js/es7/reflect';

// Zone.js
import 'zone.js/dist/zone';

// Typescript emit helpers polyfill

if ('production' !== ENV) {
  Error.stackTraceLimit = Infinity;
  require('zone.js/dist/long-stack-trace-zone');
}

