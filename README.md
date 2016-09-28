# CTL PLATFORM


## PROJECT DESCRIPTION:

This skleton project is built on top of Spring Boot application with Angular 2.
Node and npm are installed as part of maven build. Also webpack build and karma tests runs with maven.
It also uses Spring Cloud microservices and Spring Security with Oauth2 JWT tokens.

### [LIVE DEMO: http://pcp.ctl.io/](http://pcp.ctl.io/)
### [EUREKA: http://pcp.ctl.io:8081/](http://pcp.ctl.io:8081/)

## FEATURES:
* Build and testing process integrated with maven
* Spring cloud microservices with service discovery
* Spring security Oauth2 integration
* Spring Boot application in development mode use resources from webpack dev server
* Docker integration (optional)
* Webpack2 integration
* Scss support in angular components
* Angular material integration
* Font-awesome integration
* Lazy loaded routes
* Spring Boot admin support
* Spring REST Docs support

## MICROSERVICES:

![docs/diagram.png](docs/diagram.png)

## USAGE WITH DOCKER (RECOMMENDED)

### DOCKER BUILD (PRODUCTION MODE):

Build the docker image for all services with default maven profile

```
mvn install
```

### DOCKER BUILD (DEVELOPMENT MODE):

Build the docker image for all services with dev maven profile
To use development mode you need also webpack development server running in background

```
mvn install -P dev
```

### RUNNING CONTAINERS:

After building applications run all containers with docker-compose

```
docker-compose up
```

## STANDALONE USAGE WITHOUT DOCKER (NO LONGER RECOMMENDED)

### RUNNING IN PRODUCTION MODE:

If you want to work without docker you need to use prod-standalone maven profile

Compile and package project:
```
mvn clean package -P prod-standalone
```

Then run config server:
```
cd ctl-config/
java -jar ./target/ctl-config-2.2.0.jar
```

Then run discovery server:
```
cd ctl-discovery/
java -jar ./target/ctl-discovery-2.2.0.jar
```

Then run gateway server:
```
cd ctl-gateway/
java -jar ./target/ctl-gateway-2.2.0.jar
```

Then run api server:
```
cd ctl-api/
java -jar ./target/ctl-api-2.2.0.jar
```

Then run auth server:
```
cd ctl-auth/
java -jar ./target/ctl-auth-2.2.0.jar
```

Then run ui server:
```
cd ctl-api/
java -jar ./target/ctl-ui-2.2.0.jar
```


Then run admin server (optional):
```
cd ctl-admin/
java -jar ./target/ctl-admin-1.1.0.jar
```


### RUNNING IN DEVELOPMENT MODE:

If you want to work without docker you need to use dev-standalone maven profile
To use development mode you need also webpack development server running in background

Install all dependencies at first:
```
mvn clean install -P dev-standalone
```

Run config server in development mode:
```
cd ctl-config
mvn spring-boot:run -P dev-standalone
```

Run discovery server in development mode:
```
cd ctl-discovery
mvn spring-boot:run -P dev-standalone
```

Run gateway server in development mode:
```
cd ctl-gateway
mvn spring-boot:run -P dev-standalone
```

Run api server in development mode:
```
cd ctl-api
mvn spring-boot:run -P dev-standalone
```

Run auth server in development mode:
```
cd ctl-auth
mvn spring-boot:run -P dev-standalone
```

Run ui server in development mode:
```
cd ctl-ui
mvn spring-boot:run -P dev-standalone
```

Run admin server (optional) in development mode:
```
cd ctl-admin
mvn spring-boot:run -P dev-standalone
```

## RUNNING WEBPACK DEV SERVER FOR DEVELOPMENT MODE:

Run webpack development server:
```
cd ctl-ui
npm run server
```

## TESTING ANGULAR FRONTEND

Running unit tests:
```
cd ctl-ui
npm run test
```

Running e2e tests:
```
cd ctl-ui
npm run e2e
```


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
* Added docker support (thanks to Tarun Sukhu)
* Disabled Eureka client in unit tests
* Docker and standalone profiles
* Spring Boot admin support
* Added gateway service
* Updated Angular to rc.5
* Updated angular2-material to 2.0.0-alpha.7-2
* Added live demo


[show full changelog](docs/CHANGELOG.md)
