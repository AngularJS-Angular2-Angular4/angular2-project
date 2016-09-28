## CHANGELOG:

### 2.2.0 (unreleased)


### 2.1.0 (28.08.2016)
* Added Spring Cloud Config server for centralized configuration
* Added Spring REST Docs support for API microservices
* Remapped coverage reports to typescript
* Rewritten angular tests using Testbed
* Updated Spring Cloud to Brixton.SR5
* Updated angular2-material to 2.0.0-alpha.7-4
* Updated dependencies
* Removed typedoc (it doesn't support typescript2)

### 2.0.0 (16.08.2016)
* Updated Spring Platform to Athens-RC1 and Spring Boot to 1.4.0
* Updated Spring Cloud to Brixton.SR4
* Updated Node to v6.3.1 and npm to 3.10.3
* Updated dependencies
* Removed shardis-parent project
* Added docker support (thanks to Tarun Sukhu)
* Disabled Eureka client in unit tests
* Docker and standalone profiles
* Spring Boot admin support
* Added gateway service
* Updated Angular to rc.5
* Updated angular2-material to 2.0.0-alpha.7-2
* Added live demo

### 1.9.0 (29.07.2016)
* Updated dependencies
* Updated Angular to rc.4
* Switched back to awesome-ts-loader (faster)
* Updated Spring Cloud to Brixton.SR1
* Removed lombok from project
* Added UUID to all entities
* Moved styles from main.scss to separate module
* Updated Spring Cloud to Brixton.SR2
* Updated Spring Platform to 2.0.6 and Spring Boot to 1.3.6
* Renamed java test classes to match surefire convention
* Webpack 2 and Typescript 2
* Reduced bundle size
* Updated Spring Cloud to Brixton.SR3
* Enabled gzip compression
* Removed typings in favor of types
* Updated angular2-material to 2.0.0-alpha.6-2
* Updated Spring Platform to 2.0.7 and Spring Boot to 1.3.7

### 1.8.0 (30.06.2016)
* Better directory structure for angular components
* Dependency updates
* Updated Angular to rc.2
* Migrate awesome-ts-loader to ts-loader due to problems with karma
* Migrate to router 3
* Lazy routes with modified version of AngularClass webpack resolver
* Updated Angular to rc.3
* Added 404 page
* Much cleaner webpack configuration
* Role based visibility of menu items
* CRUD example for authenticated users
* Route access for selected roles (guards)
* Switched to new Angular Forms
* Updated angular2-material to 2.0.0-alpha.6

### 1.7.0 (08.06.2016)
* Added npm-check-updates as dev dependency
* Removed kitchensink page
* Updated dependencies
* Removed foundation and motion-ui
* Added angular2-material
* Basic angular2-material styling
* Added normalize.css
* Added fancy loading screen
* Removed development ribbon
* Updated angular2-material to 2.0.0-alpha.5-2
* Added angular2-material palette to main.scss
* Added sidenav navigation
* Added working login form
* Added ng2-webstorage library
* Inline base css from file and minify html

### 1.6.0 (26.05.2016)
* Updated node to 6.2.0
* Updated npm to 3.9.2
* Removed typings from git
* Updated typings
* Updated all node packages
* Fixed problem with nonexistent static directory
* Fixed webpack validator custom schema config
* Some fixes from AngularClass starter

### 1.5.0 (13.05.2016)
* Updated Spring Boot to 1.3.4
* Updated Spring Boot to 1.3.5
* Added Spring IO Platform dependency
* Various bugfixes

### 1.4.0 (05.05.2016)
* Updated Angular to beta 16
* Updated node dependencies
* Updated maven dependencies
* Fixed .gitignore
* Fully stateless authentication
* Storing oauth2 token in localstorage
* Removed form authentication
* Removed deprecated injectAsync
* Decoding user token and showing expiration date
* Updated Angular to beta 17
* Updated Angular to rc.1
* Replaced router-deprecated with router (temporary no async routes)

### 1.3.0 (21.07.2016)
* Refactoring to microservices
* Multi module pom project
* Shared common library
* Maven enforcer plugin
* Custom schema for webpack config validator
* Zull proxy
* Auth module
* Service discovery module (eureka)
* Oauth2 security
* Updated Angular to beta 14
* Included all rxjs
* Updated Angular to beta 15
* Updated some dependencies
* Path location strategy
* Implicit login flow

### 1.2.2 (01.04.2016)
* Updated Angular to beta 13

### 1.2.1 (24.03.2016)
* Updated Angular to beta 12
* Removed zone.js fixes for beta 11
* Replaced es6-promise loader with custom solution

### 1.2.0 (23.03.2016)
* Added motion-ui integration
* Added fancy animation for accordion

### 1.1.9 (21.03.2016)
* Refactoring
* First Angular component for Foundation : Accordion

### 1.1.8 (20.03.2016)
* Typescript files naming convention
* Foundation kitchensink wit samples
* Some changes from AngularClass

### 1.1.7 (19.03.2016)
* Switched to Angular2 beta 11

### 1.1.6 (17.03.2016)
* Added sourcemaps for css
* Added webpack text extract plugin for production
* Removed styles.ts entry point

### 1.1.5 (16.03.2016)
* Postcss and autoprefixer

### 1.1.4 (16.03.2016)
* Webpack config refactor and cleanup
* Sass loader path configuration
* Bootstrap 4 (alpha) replaced by Foundation 6

### 1.1.3 (15.03.2016)
* Some other fixes from original AngularClass starter

### 1.1.2 (14.03.2016)
* Some fixes from original AngularClass starter

### 1.1.1 (10.03.2016)
* Temporary removed ng2-bootstrap

### 1.1.0 (10.03.2016)
* Switched to Angular2 beta 9
* Added scss support
* Added font-awesome package
* Added Bootstrap 4
* Added ng-bootstrap (still buggy)

### 1.0.1 (09.03.2016)
* Replaced ts-loader with awesome-typescript-loader

### 1.0.0 (07.03.2016)
* Initial Version
