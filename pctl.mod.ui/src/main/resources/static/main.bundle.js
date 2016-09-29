webpackJsonp([4],{

/***/ 1047:
/***/ function(module, exports, __webpack_require__) {

"use strict";
/* WEBPACK VAR INJECTION */(function(module) {"use strict";
/*
 * Providers provided by Angular
 */
var platform_browser_dynamic_1 = __webpack_require__(216);
var app_module_1 = __webpack_require__(528);
/*
 * App Component
 * our top level component that holds all of our components
 */
/*
 * Bootstrap our Angular app with a top level component `App` and inject
 * our Services and Providers into Angular's dependency injection
 */
function main() {
    platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(app_module_1.AppModule);
}
exports.main = main;
/*
 * Hot Module Reload
 * experimental version by @gdi2290
 */
function bootstrapDomReady() {
    // bootstrap after document is ready
    return document.addEventListener('DOMContentLoaded', main);
}
if (true) {
    // activate hot module reload
    if (true) {
        if (document.readyState === 'complete') {
            main();
        }
        else {
            bootstrapDomReady();
        }
        module.hot.accept();
    }
    else {
        bootstrapDomReady();
    }
}
else {
    bootstrapDomReady();
}

/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(339)(module)))

/***/ },

/***/ 136:
/***/ function(module, exports) {

"use strict";
"use strict";
(function (STORAGE) {
    STORAGE[STORAGE["local"] = 0] = "local";
    STORAGE[STORAGE["session"] = 1] = "session";
})(exports.STORAGE || (exports.STORAGE = {}));
var STORAGE = exports.STORAGE;
//# sourceMappingURL=storage.js.map

/***/ },

/***/ 193:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(340));


/***/ },

/***/ 194:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(664));
__export(__webpack_require__(193));
__export(__webpack_require__(462));


/***/ },

/***/ 300:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var index_1 = __webpack_require__(301);
var index_2 = __webpack_require__(301);
function WebStorage(webSKey, sType) {
    return function (targetedClass, raw) {
        var key = webSKey || raw, sKey = index_1.KeyStorageHelper.genKey(key);
        Object.defineProperty(targetedClass, raw, {
            get: function () {
                return index_2.WebStorageHelper.retrieve(sType, sKey);
            },
            set: function (value) {
                this[sKey] = value;
                index_2.WebStorageHelper.store(sType, sKey, value);
            }
        });
    };
}
exports.WebStorage = WebStorage;
//# sourceMappingURL=webStorage.js.map

/***/ },

/***/ 301:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(302));
__export(__webpack_require__(464));
__export(__webpack_require__(686));
//# sourceMappingURL=index.js.map

/***/ },

/***/ 302:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var lib_1 = __webpack_require__(682);
var CUSTOM_LIB_KEY = lib_1.LIB_KEY;
var KeyStorageHelper = (function () {
    function KeyStorageHelper() {
    }
    KeyStorageHelper.retrieveKeysFromStorage = function (storage) {
        return Object.keys(storage).filter(function (key) { return key.indexOf(CUSTOM_LIB_KEY) === 0; });
    };
    KeyStorageHelper.genKey = function (raw) {
        if (typeof raw !== 'string')
            throw Error('attempt to generate a storage key with a non string value');
        return CUSTOM_LIB_KEY + "|" + raw.toString().toLowerCase();
    };
    KeyStorageHelper.setStorageKeyPrefix = function (key) {
        if (key === void 0) { key = lib_1.LIB_KEY; }
        CUSTOM_LIB_KEY = key;
    };
    return KeyStorageHelper;
}());
exports.KeyStorageHelper = KeyStorageHelper;
//# sourceMappingURL=keyStorage.js.map

/***/ },

/***/ 303:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var index_1 = __webpack_require__(301);
var WebStorageService = (function () {
    function WebStorageService(sType) {
        this.sType = null;
        this.sType = sType;
    }
    WebStorageService.prototype.store = function (raw, value) {
        var sKey = index_1.KeyStorageHelper.genKey(raw);
        index_1.WebStorageHelper.store(this.sType, sKey, value);
    };
    WebStorageService.prototype.retrieve = function (raw) {
        var sKey = index_1.KeyStorageHelper.genKey(raw);
        return index_1.WebStorageHelper.retrieve(this.sType, sKey);
    };
    WebStorageService.prototype.clear = function (raw) {
        if (raw)
            index_1.WebStorageHelper.clear(this.sType, index_1.KeyStorageHelper.genKey(raw));
        else
            index_1.WebStorageHelper.clearAll(this.sType);
    };
    WebStorageService.prototype.observe = function (raw) {
        var sKey = index_1.KeyStorageHelper.genKey(raw);
        return index_1.StorageObserverHelper.observe(this.sType, sKey);
    };
    return WebStorageService;
}());
exports.WebStorageService = WebStorageService;
//# sourceMappingURL=webStorage.js.map

/***/ },

/***/ 340:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var http_1 = __webpack_require__(109);
var index_1 = __webpack_require__(466);
var AuthService = (function () {
    function AuthService(http) {
        this.http = http;
        this.authenticated = false;
        this.tokenExpirationDate = null;
        this.userData = null;
        if (this.tokenData && this.tokenData.access_token) {
            this.authenticated = true;
            this.userData = AuthService.decodeAccessToken(this.tokenData.access_token);
            this.tokenExpirationDate = new Date(this.userData.exp * 1000);
            if (this.authenticated && this.tokenExpirationDate < new Date()) {
                console.log('Session timeout');
                this.logout();
            }
        }
    }
    AuthService.decodeAccessToken = function (access_token) {
        return JSON.parse(window.atob(access_token.split('.')[1]));
    };
    AuthService.prototype.isAuthenticated = function () {
        this.checkTokenExpirationDate();
        return this.authenticated;
    };
    AuthService.prototype.authenticate = function (username, password) {
        var _this = this;
        console.log('Authentication pending...');
        return new Promise(function (resolve, reject) {
            if (!username.trim()) {
                reject('Username cannot be blank');
            }
            if (!password.trim()) {
                reject('Password cannot be blank');
            }
            var basicAuthHeader = btoa("acme:acmesecret");
            var headers = new http_1.Headers();
            headers.append('Authorization', "Basic  " + basicAuthHeader);
            headers.append('Accept', "application/json");
            headers.append('Content-Type', "application/x-www-form-urlencoded");
            var data = 'username=' + encodeURIComponent(username) + '&password='
                + encodeURIComponent(password) + '&grant_type=password';
            _this.http
                .post('/api/oauth/token', data, { headers: headers })
                .subscribe(function (data) {
                _this.tokenData = data.json();
                _this.authenticated = true;
                _this.userData = AuthService.decodeAccessToken(_this.tokenData.access_token);
                _this.tokenExpirationDate = new Date(_this.userData.exp * 1000);
                resolve('OK');
            }, function (err) {
                console.log(err);
                reject('Username and password doesn\'t match');
            });
        });
    };
    AuthService.prototype.refreshToken = function () {
        var _this = this;
        if (this.isAuthenticated()) {
            var basicAuthHeader = btoa("acme:acmesecret");
            var headers = new http_1.Headers();
            headers.append('Authorization', "Basic  " + basicAuthHeader);
            headers.append('Accept', "application/json");
            headers.append('Content-Type', "application/x-www-form-urlencoded");
            var data = 'grant_type=refresh_token&refresh_token=' + encodeURIComponent(this.tokenData.refresh_token);
            this.http
                .post('/api/oauth/token', data, { headers: headers })
                .subscribe(function (data) {
                _this.tokenData = data.json();
                _this.authenticated = true;
                _this.userData = AuthService.decodeAccessToken(_this.tokenData.access_token);
                _this.tokenExpirationDate = new Date(_this.userData.exp * 1000);
            }, function (err) {
                console.log(err);
            });
        }
    };
    AuthService.prototype.logout = function () {
        this.tokenData = new Oauth2TokenData();
        this.userData = null;
        this.authenticated = false;
        this.tokenExpirationDate = null;
    };
    AuthService.prototype.getUserData = function () {
        return this.userData;
    };
    AuthService.prototype.getTokenExpirationDate = function () {
        return this.tokenExpirationDate;
    };
    AuthService.prototype.hasRole = function (role) {
        if (this.isAuthenticated()) {
            return this.getUserData()['authorities'].indexOf(role) >= 0;
        }
        return false;
    };
    AuthService.prototype.hasAnyRole = function (roles) {
        var _this = this;
        var ok = false;
        roles.forEach(function (role) {
            if (_this.hasRole(role)) {
                ok = true;
            }
        });
        return ok;
    };
    AuthService.prototype.canView = function (view) {
        var ok = false;
        if (!view.roles) {
            ok = true;
        }
        else {
            ok = this.hasAnyRole(view.roles);
        }
        return ok;
    };
    AuthService.prototype.getAuthorizationHeaders = function () {
        var authorizationHeaders = new http_1.Headers();
        if (this.authenticated) {
            authorizationHeaders.append('Authorization', "Bearer " + this.tokenData.access_token);
        }
        return authorizationHeaders;
    };
    AuthService.prototype.checkTokenExpirationDate = function () {
        if (this.authenticated && this.tokenExpirationDate < new Date()) {
            console.log('Session timeout');
            this.logout();
        }
    };
    AuthService.prototype.fetchUserData = function () {
        var _this = this;
        this.http.get('/api/user', { headers: this.getAuthorizationHeaders() })
            .subscribe(function (data) {
            _this.userData = data.json();
        }, function (err) { return _this.authenticated = false; });
    };
    __decorate([
        index_1.LocalStorage(), 
        __metadata('design:type', Oauth2TokenData)
    ], AuthService.prototype, "tokenData", void 0);
    AuthService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [(typeof (_a = typeof http_1.Http !== 'undefined' && http_1.Http) === 'function' && _a) || Object])
    ], AuthService);
    return AuthService;
    var _a;
}());
exports.AuthService = AuthService;
var Oauth2TokenData = (function () {
    function Oauth2TokenData() {
        this.access_token = null;
        this.token_type = null;
        this.expires_in = null;
        this.scope = null;
        this.jti = null;
        this.refresh_token = null;
    }
    return Oauth2TokenData;
}());


/***/ },

/***/ 457:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var AccessDenied = (function () {
    function AccessDenied() {
    }
    AccessDenied.prototype.ngOnInit = function () {
        console.log('access denied');
    };
    AccessDenied = __decorate([
        core_1.Component({
            selector: 'access-denied',
            styles: [__webpack_require__(689)],
            template: __webpack_require__(676)
        }), 
        __metadata('design:paramtypes', [])
    ], AccessDenied);
    return AccessDenied;
}());
exports.AccessDenied = AccessDenied;


/***/ },

/***/ 458:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var home_1 = __webpack_require__(656);
var login_1 = __webpack_require__(659);
var not_found_1 = __webpack_require__(660);
var access_denied_component_1 = __webpack_require__(457);
var guards_1 = __webpack_require__(462);
var auth_service_1 = __webpack_require__(340);
var async_ng_module_loader_1 = __webpack_require__(463);
exports.routes = [
    {
        path: '',
        pathMatch: 'prefix',
        redirectTo: 'order'
    },
    {
        path: 'home',
        pathMatch: 'prefix',
        component: home_1.Home
    },
    {
        path: 'about',
        pathMatch: 'prefix',
        loadChildren: async_ng_module_loader_1.load(function () { return new Promise(function (resolve) {
            __webpack_require__.e/* nsure */(2).catch(function(err) { __webpack_require__.oe(err); }).then((function (require) {
                resolve(__webpack_require__(1051).AboutModule);
            }).bind(null, __webpack_require__));
        }); })
    },
    {
        path: 'order',
        pathMatch: 'prefix',
        loadChildren: async_ng_module_loader_1.load(function () { return new Promise(function (resolve) {
            __webpack_require__.e/* nsure */(1).catch(function(err) { __webpack_require__.oe(err); }).then((function (require) {
                resolve(__webpack_require__(1052).OrderModule);
            }).bind(null, __webpack_require__));
        }); }),
    },
    {
        path: 'playground',
        pathMatch: 'prefix',
        loadChildren: async_ng_module_loader_1.load(function () { return new Promise(function (resolve) {
            __webpack_require__.e/* nsure */(0).catch(function(err) { __webpack_require__.oe(err); }).then((function (require) {
                resolve(__webpack_require__(1053).PlaygroundModule);
            }).bind(null, __webpack_require__));
        }); }),
    },
    {
        path: 'login',
        pathMatch: 'prefix',
        component: login_1.Login,
        canActivate: [guards_1.UnauthenticatedGuard]
    },
    {
        path: 'accessDenied',
        pathMatch: 'prefix',
        component: access_denied_component_1.AccessDenied
    },
    {
        path: '404',
        pathMatch: 'prefix',
        component: not_found_1.NotFound
    },
    {
        path: '**',
        pathMatch: 'prefix',
        redirectTo: '404',
        terminal: true
    },
];
exports.AUTH_PROVIDERS = [auth_service_1.AuthService, guards_1.AdminGuard, guards_1.AuthenticatedGuard, guards_1.UnauthenticatedGuard];


/***/ },

/***/ 459:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var shared_1 = __webpack_require__(657);
var shared_2 = __webpack_require__(194);
var Home = (function () {
    function Home(title, authService) {
        this.title = title;
        this.authService = authService;
        this.angularLogo = 'assets/img/angular-logo.png';
        this.data = { value: '' };
    }
    Home.prototype.ngOnInit = function () {
        var _this = this;
        console.log('hello `Home` component');
        this.title.getData().subscribe(function (data) { return _this.data = data; });
    };
    Home = __decorate([
        core_1.Component({
            selector: 'home',
            providers: [
                shared_1.Title
            ],
            directives: [shared_2.XLarge],
            pipes: [],
            styles: [__webpack_require__(691)],
            template: __webpack_require__(678)
        }), 
        __metadata('design:paramtypes', [(typeof (_a = typeof shared_1.Title !== 'undefined' && shared_1.Title) === 'function' && _a) || Object, (typeof (_b = typeof shared_2.AuthService !== 'undefined' && shared_2.AuthService) === 'function' && _b) || Object])
    ], Home);
    return Home;
    var _a, _b;
}());
exports.Home = Home;


/***/ },

/***/ 460:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var router_1 = __webpack_require__(69);
var shared_1 = __webpack_require__(194);
console.log('`Login` component loaded asynchronously');
var Login = (function () {
    function Login(authService, router) {
        this.authService = authService;
        this.router = router;
        this.username = 'admin';
        this.password = 'xxxxxx';
        this.message = '';
    }
    Login.prototype.logMeIn = function () {
        var _this = this;
        console.log('LogMeIn');
        this.authService
            .authenticate(this.username, this.password)
            .catch(function (errorMessage) { return _this.message = errorMessage; })
            .then(function () {
            if (_this.authService.isAuthenticated()) {
                _this.router.navigate(['']);
            }
        });
    };
    Login.prototype.ngOnInit = function () {
        console.log('hello `Login` component');
    };
    Login = __decorate([
        core_1.Component({
            selector: 'login',
            styles: [__webpack_require__(692)],
            template: __webpack_require__(679)
        }), 
        __metadata('design:paramtypes', [(typeof (_a = typeof shared_1.AuthService !== 'undefined' && shared_1.AuthService) === 'function' && _a) || Object, (typeof (_b = typeof router_1.Router !== 'undefined' && router_1.Router) === 'function' && _b) || Object])
    ], Login);
    return Login;
    var _a, _b;
}());
exports.Login = Login;


/***/ },

/***/ 461:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
console.log('`About` component loaded asynchronously');
var NotFound = (function () {
    function NotFound() {
    }
    NotFound.prototype.ngOnInit = function () {
        console.log('route not found');
    };
    NotFound = __decorate([
        core_1.Component({
            selector: 'not-found',
            styles: [__webpack_require__(693)],
            template: __webpack_require__(680)
        }), 
        __metadata('design:paramtypes', [])
    ], NotFound);
    return NotFound;
}());
exports.NotFound = NotFound;


/***/ },

/***/ 462:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(661));
__export(__webpack_require__(662));
__export(__webpack_require__(663));


/***/ },

/***/ 463:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var LoaderCallback = (function () {
    function LoaderCallback(callback) {
        this.callback = callback;
    }
    return LoaderCallback;
}());
exports.load = function (callback) {
    return new LoaderCallback(callback);
};
/**
 * NgModuleFactoryLoader that uses Promise to load NgModule type and then compiles them.
 * @experimental
 */
var AsyncNgModuleLoader = (function () {
    function AsyncNgModuleLoader(compiler) {
        this.compiler = compiler;
    }
    AsyncNgModuleLoader.prototype.load = function (modulePath) {
        var _this = this;
        if (modulePath instanceof LoaderCallback) {
            var loader = modulePath.callback();
            return Promise
                .resolve(loader)
                .then(function (type) { return checkNotEmpty(type, '', ''); })
                .then(function (type) { return _this.compiler.compileModuleAsync(type); });
        }
        return Promise.resolve(null);
    };
    AsyncNgModuleLoader = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [(typeof (_a = typeof core_1.Compiler !== 'undefined' && core_1.Compiler) === 'function' && _a) || Object])
    ], AsyncNgModuleLoader);
    return AsyncNgModuleLoader;
    var _a;
}());
exports.AsyncNgModuleLoader = AsyncNgModuleLoader;
function checkNotEmpty(value, modulePath, exportName) {
    if (!value) {
        throw new Error("Cannot find '" + exportName + "' in '" + modulePath + "'");
    }
    return value;
}


/***/ },

/***/ 464:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var core_1 = __webpack_require__(0);
var StorageObserverHelper = (function () {
    function StorageObserverHelper() {
    }
    StorageObserverHelper.observe = function (sType, sKey) {
        var oKey = this.genObserverKey(sType, sKey);
        if (oKey in this.observers)
            return this.observers[oKey];
        return this.observers[oKey] = new core_1.EventEmitter();
    };
    StorageObserverHelper.emit = function (sType, sKey, value) {
        var oKey = this.genObserverKey(sType, sKey);
        if (oKey in this.observers)
            this.observers[oKey].emit(value);
    };
    StorageObserverHelper.genObserverKey = function (sType, sKey) {
        return sType + "|" + sKey;
    };
    StorageObserverHelper.observers = {};
    return StorageObserverHelper;
}());
exports.StorageObserverHelper = StorageObserverHelper;
//# sourceMappingURL=storageObserver.js.map

/***/ },

/***/ 465:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(303));
__export(__webpack_require__(687));
__export(__webpack_require__(688));
//# sourceMappingURL=index.js.map

/***/ },

/***/ 466:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(681));


/***/ },

/***/ 528:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var router_1 = __webpack_require__(69);
var forms_1 = __webpack_require__(86);
var platform_browser_1 = __webpack_require__(48);
var app_component_1 = __webpack_require__(654);
var app_routes_1 = __webpack_require__(458);
var platform_1 = __webpack_require__(670);
var home_component_1 = __webpack_require__(459);
var login_component_1 = __webpack_require__(460);
var access_denied_component_1 = __webpack_require__(457);
var not_found_component_1 = __webpack_require__(461);
var button_1 = __webpack_require__(217);
var card_1 = __webpack_require__(218);
var checkbox_1 = __webpack_require__(219);
var grid_list_1 = __webpack_require__(220);
var icon_1 = __webpack_require__(221);
var input_1 = __webpack_require__(222);
var list_1 = __webpack_require__(223);
var progress_bar_1 = __webpack_require__(224);
var progress_circle_1 = __webpack_require__(225);
var radio_1 = __webpack_require__(226);
var sidenav_1 = __webpack_require__(227);
var slide_toggle_1 = __webpack_require__(228);
var tabs_1 = __webpack_require__(229);
var toolbar_1 = __webpack_require__(230);
var core_2 = __webpack_require__(145);
var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        core_1.NgModule({
            declarations: [app_component_1.App, home_component_1.Home, login_component_1.Login, access_denied_component_1.AccessDenied, not_found_component_1.NotFound],
            imports: [
                platform_browser_1.BrowserModule,
                forms_1.FormsModule,
                button_1.MdButtonModule,
                card_1.MdCardModule,
                checkbox_1.MdCheckboxModule,
                grid_list_1.MdGridListModule,
                icon_1.MdIconModule,
                input_1.MdInputModule,
                list_1.MdListModule,
                progress_bar_1.MdProgressBarModule,
                progress_circle_1.MdProgressCircleModule,
                radio_1.MdRadioModule,
                sidenav_1.MdSidenavModule,
                slide_toggle_1.MdSlideToggleModule,
                tabs_1.MdTabsModule,
                toolbar_1.MdToolbarModule,
                core_2.MdCoreModule,
                router_1.RouterModule.forRoot(app_routes_1.routes)
            ],
            providers: platform_1.PROVIDERS.concat(platform_1.ENV_PROVIDERS),
            bootstrap: [app_component_1.App],
        }), 
        __metadata('design:paramtypes', [])
    ], AppModule);
    return AppModule;
}());
exports.AppModule = AppModule;


/***/ },

/***/ 654:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var router_1 = __webpack_require__(69);
var shared_1 = __webpack_require__(194);
var app_menu_1 = __webpack_require__(655);
var App = (function () {
    function App(authService, router) {
        this.authService = authService;
        this.router = router;
        this.name = 'Platoform CenturyLink Portal';
        this.url = 'https://github.com/kucharzyk';
        this.loading = false;
        this.views = app_menu_1.APP_MENU;
    }
    App.prototype.logMeOut = function () {
        this.authService.logout();
        this.router.navigate(['']);
    };
    App.prototype.ngOnInit = function () {
        console.log('app on init');
    };
    App = __decorate([
        core_1.Component({
            selector: 'app',
            styles: [__webpack_require__(690)],
            template: __webpack_require__(677)
        }), 
        __metadata('design:paramtypes', [(typeof (_a = typeof shared_1.AuthService !== 'undefined' && shared_1.AuthService) === 'function' && _a) || Object, (typeof (_b = typeof router_1.Router !== 'undefined' && router_1.Router) === 'function' && _b) || Object])
    ], App);
    return App;
    var _a, _b;
}());
exports.App = App;


/***/ },

/***/ 655:
/***/ function(module, exports) {

"use strict";
"use strict";
exports.APP_MENU = [
    {
        name: 'Home',
        description: 'Home page',
        icon: 'public',
        link: ['home']
    },
    {
        name: 'Order',
        description: 'Place an Order',
        icon: 'edit',
        link: ['order']
    },
    {
        name: 'About',
        description: 'About page',
        icon: 'person',
        link: ['about']
    }
];


/***/ },

/***/ 656:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(459));


/***/ },

/***/ 657:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(658));


/***/ },

/***/ 658:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var http_1 = __webpack_require__(109);
var shared_1 = __webpack_require__(194);
__webpack_require__(338);
var Title = (function () {
    function Title(http, authService) {
        this.http = http;
        this.authService = authService;
        this.value = 'Angular 2';
    }
    Title.prototype.getData = function () {
        console.log('Title.getData()');
        return this
            .http
            .get('/api/title', { headers: this.authService.getAuthorizationHeaders() })
            .map(function (res) { return res.json(); });
    };
    Title = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [(typeof (_a = typeof http_1.Http !== 'undefined' && http_1.Http) === 'function' && _a) || Object, (typeof (_b = typeof shared_1.AuthService !== 'undefined' && shared_1.AuthService) === 'function' && _b) || Object])
    ], Title);
    return Title;
    var _a, _b;
}());
exports.Title = Title;


/***/ },

/***/ 659:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(460));


/***/ },

/***/ 660:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(461));


/***/ },

/***/ 661:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var router_1 = __webpack_require__(69);
var auth_1 = __webpack_require__(193);
var AdminGuard = (function () {
    function AdminGuard(authService, router) {
        this.authService = authService;
        this.router = router;
    }
    AdminGuard.prototype.canActivate = function (next, state) {
        if (this.authService.hasRole('ROLE_ADMIN')) {
            return true;
        }
        this.router.navigate(['accessDenied']);
        return false;
    };
    AdminGuard = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [(typeof (_a = typeof auth_1.AuthService !== 'undefined' && auth_1.AuthService) === 'function' && _a) || Object, (typeof (_b = typeof router_1.Router !== 'undefined' && router_1.Router) === 'function' && _b) || Object])
    ], AdminGuard);
    return AdminGuard;
    var _a, _b;
}());
exports.AdminGuard = AdminGuard;


/***/ },

/***/ 662:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var router_1 = __webpack_require__(69);
var auth_1 = __webpack_require__(193);
var AuthenticatedGuard = (function () {
    function AuthenticatedGuard(authService, router) {
        this.authService = authService;
        this.router = router;
    }
    AuthenticatedGuard.prototype.canActivate = function (next, state) {
        if (this.authService.isAuthenticated()) {
            return true;
        }
        this.router.navigate(['login']);
        return false;
    };
    AuthenticatedGuard = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [(typeof (_a = typeof auth_1.AuthService !== 'undefined' && auth_1.AuthService) === 'function' && _a) || Object, (typeof (_b = typeof router_1.Router !== 'undefined' && router_1.Router) === 'function' && _b) || Object])
    ], AuthenticatedGuard);
    return AuthenticatedGuard;
    var _a, _b;
}());
exports.AuthenticatedGuard = AuthenticatedGuard;


/***/ },

/***/ 663:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var router_1 = __webpack_require__(69);
var auth_1 = __webpack_require__(193);
var UnauthenticatedGuard = (function () {
    function UnauthenticatedGuard(authService, router) {
        this.authService = authService;
        this.router = router;
    }
    UnauthenticatedGuard.prototype.canActivate = function (next, state) {
        if (!this.authService.isAuthenticated()) {
            return true;
        }
        this.router.navigate(['home']);
        return false;
    };
    UnauthenticatedGuard = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [(typeof (_a = typeof auth_1.AuthService !== 'undefined' && auth_1.AuthService) === 'function' && _a) || Object, (typeof (_b = typeof router_1.Router !== 'undefined' && router_1.Router) === 'function' && _b) || Object])
    ], UnauthenticatedGuard);
    return UnauthenticatedGuard;
    var _a, _b;
}());
exports.UnauthenticatedGuard = UnauthenticatedGuard;


/***/ },

/***/ 664:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(665));


/***/ },

/***/ 665:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
/*
 * Directive
 * XLarge is a simple directive to show how one is made
 */
var XLarge = (function () {
    function XLarge(element, renderer) {
        // simple DOM manipulation to set font size to x-large
        // `nativeElement` is the direct reference to the DOM element
        // element.nativeElement.style.fontSize = 'x-large';
        // for server/webworker support use the renderer
        renderer.setElementStyle(element.nativeElement, 'fontSize', 'x-large');
        renderer.setElementStyle(element.nativeElement, 'color', 'red');
        renderer.setElementStyle(element.nativeElement, 'font-weight', 'bold');
    }
    XLarge = __decorate([
        core_1.Directive({
            selector: '[x-large]' // using [ ] means selecting attributes
        }), 
        __metadata('design:paramtypes', [(typeof (_a = typeof core_1.ElementRef !== 'undefined' && core_1.ElementRef) === 'function' && _a) || Object, (typeof (_b = typeof core_1.Renderer !== 'undefined' && core_1.Renderer) === 'function' && _b) || Object])
    ], XLarge);
    return XLarge;
    var _a, _b;
}());
exports.XLarge = XLarge;


/***/ },

/***/ 666:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(667));


/***/ },

/***/ 667:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var common_1 = __webpack_require__(26);
var core_1 = __webpack_require__(0);
var ng2_webstorage_1 = __webpack_require__(466);
var app_routes_1 = __webpack_require__(458);
var webpack_1 = __webpack_require__(668);
/*
 * Application Providers/Directives/Pipes
 * providers/directives/pipes that only live in our browser environment
 */
exports.APPLICATION_PROVIDERS = ng2_webstorage_1.NG2_WEBSTORAGE.concat(app_routes_1.AUTH_PROVIDERS, [
    {
        provide: core_1.NgModuleFactoryLoader,
        useClass: webpack_1.AsyncNgModuleLoader,
    },
    {
        provide: common_1.LocationStrategy,
        useClass: common_1.PathLocationStrategy
    },
]);
exports.PROVIDERS = exports.APPLICATION_PROVIDERS.slice();


/***/ },

/***/ 668:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(463));


/***/ },

/***/ 669:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
// Angular 2
var core_1 = __webpack_require__(0);
var platform_browser_1 = __webpack_require__(48);
// Environment Providers
var PROVIDERS = [];
// Angular debug tools in the dev console
// https://github.com/angular/angular/blob/86405345b781a9dc2438c0fbe3e9409245647019/TOOLS_JS.md
var _decorateComponentRef = function identity(value) { return value; };
if (false) {
    // Production
    platform_browser_1.disableDebugTools();
    core_1.enableProdMode();
    PROVIDERS = PROVIDERS.slice();
}
else {
    _decorateComponentRef = function (cmpRef) { return platform_browser_1.enableDebugTools(cmpRef); };
    // Development
    PROVIDERS = PROVIDERS.slice();
}
exports.decorateComponentRef = _decorateComponentRef;
exports.ENV_PROVIDERS = PROVIDERS.slice();


/***/ },

/***/ 670:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(666));
__export(__webpack_require__(669));


/***/ },

/***/ 676:
/***/ function(module, exports) {

module.exports = "<md-card>\n  <md-card-title>Access Denied</md-card-title>\n  <md-card-content>Go away!!!</md-card-content>\n</md-card>\n";

/***/ },

/***/ 677:
/***/ function(module, exports) {

module.exports = "<md-sidenav-layout fullscreen class=\"sidenav-layout\">\n\n  <md-sidenav #sidenav>\n    <md-nav-list class=\"navigation\">\n      <template ngFor let-view [ngForOf]=\"views\">\n        <a md-list-item routerLinkActive=\"active\" [routerLink]=\"view.link\" (click)=\"sidenav.close()\">\n          <md-icon md-list-icon>{{view.icon}}</md-icon>\n          <span md-line>{{view.name}}</span>\n          <span md-line>{{view.description}}</span>\n        </a>\n      </template>\n    </md-nav-list>\n  </md-sidenav>\n\n  <div class=\"main-content\">\n    <md-toolbar color=\"primary\">\n      <button md-icon-button disableRipple=\"true\" (click)=\"sidenav.open()\">\n        <svg style=\"width:24px;height:24px\" viewBox=\"0 0 24 24\">\n          <path fill=\"currentColor\" d=\"M3,6H21V8H3V6M3,11H21V13H3V11M3,16H21V18H3V16Z\"/>\n        </svg>\n      </button>\n      <span>{{ name }}</span>\n      <span class=\"fill\"></span>\n      <span class=\"user-info\" *ngIf=\"authService.isAuthenticated()\">Current user: {{ authService.getUserData().user_name }}</span>\n      <a md-raised-button color=\"primary\" routerLinkActive=\"active\" [routerLink]=\"['login']\"\n         [hidden]=\"authService.isAuthenticated()\">Login</a>\n      <button md-raised-button color=\"primary\" (click)=\"logMeOut()\" [hidden]=\"!authService.isAuthenticated()\">Logout\n      </button>\n\n      <button md-raised-button color=\"primary\" (click)=\"authService.refreshToken()\" [hidden]=\"true\">Refresh token\n      </button>\n      \n    </md-toolbar>\n\n    <md-progress-bar mode=\"indeterminate\" color=\"primary\" *ngIf=\"loading\"></md-progress-bar>\n\n    <router-outlet></router-outlet>\n\n  </div>\n\n  <md-card class=\"footer\" color=\"primary\">\n    <md-card-header>\n    </md-card-header>\n  </md-card>\n\n</md-sidenav-layout>\n\n";

/***/ },

/***/ 678:
/***/ function(module, exports) {

module.exports = "<md-card>\n  <md-card-title-group>\n    <img md-card-sm-image [src]=\"angularLogo\" alt=\"angular logo\"/>\n    <md-card-title>Platform CenturyLink Portal</md-card-title>\n    <md-card-subtitle>Authenticated: {{authService.isAuthenticated()}}</md-card-subtitle>\n  </md-card-title-group>\n  <md-card-content>\n    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ex massa, efficitur eu sodales eget, malesuada sed\n      mauris. Maecenas feugiat quam ac elit ultrices, ac interdum lacus vulputate. Maecenas porttitor tempus metus sit\n      amet fermentum. Curabitur eleifend diam nulla, ac hendrerit turpis sagittis id. Nulla vulputate odio nec lorem\n      consequat, quis facilisis elit fermentum. Duis sed efficitur urna. Cras elementum ultrices est, in pulvinar\n      turpis. Quisque eu lobortis purus. Proin ornare, libero quis vestibulum dignissim, libero tellus molestie magna,\n      in blandit lectus turpis at lacus. Integer vitae tristique eros. Nulla convallis lectus at elit pretium\n      dictum.</p>\n\n    <p>Aenean consequat leo sed dolor convallis, quis mattis lorem semper. Curabitur mattis diam et magna malesuada\n      porta. Suspendisse potenti. Sed ornare sit amet erat quis sollicitudin. Pellentesque congue libero vitae efficitur\n      ultrices. Duis bibendum ultricies libero et ornare. Mauris efficitur interdum nibh, ac interdum nunc tempus ac. Ut\n      ultricies felis purus, ac laoreet purus tincidunt quis. Suspendisse potenti. Praesent dictum vulputate erat, sed\n      pulvinar augue. Vivamus fermentum mi sit amet suscipit scelerisque. Morbi quis orci non diam posuere maximus sed\n      et odio.</p>\n\n    <p>Quisque eu odio lobortis, posuere diam et, auctor nunc. Suspendisse nec porta libero. Class aptent taciti\n      sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Pellentesque habitant morbi tristique\n      senectus et netus et malesuada fames ac turpis egestas. Maecenas in quam eu nibh pellentesque placerat. Nunc\n      placerat sodales lorem nec porttitor. In commodo massa sit amet convallis eleifend. Etiam sit amet ex rhoncus\n      ligula tincidunt tristique. Duis metus urna, feugiat ac vulputate ac, sagittis sed justo. Quisque lobortis enim\n      sed enim tristique, ac tristique eros dignissim.</p>\n\n    <p>Aliquam lorem turpis, sodales ac felis vel, mollis molestie felis. Curabitur sed nisl risus. Donec convallis\n      sollicitudin lacus, ut pulvinar urna porta non. Mauris viverra quam tortor, sit amet sollicitudin diam semper nec.\n      Ut venenatis eros vitae tellus hendrerit viverra. Pellentesque porta nisl non est feugiat hendrerit. Phasellus\n      sapien magna, vestibulum nec ex ac, facilisis pretium purus. Quisque sed nisl quam. Aliquam vel felis risus.\n      Suspendisse molestie fringilla ultricies. Donec tincidunt, ex a aliquam ullamcorper, orci neque accumsan leo, id\n      semper sapien urna nec odio. Aliquam id libero sit amet nunc volutpat convallis. Phasellus vitae sem leo. Proin\n      suscipit ligula velit, eget ullamcorper nisl finibus ac.</p>\n\n    <p>In blandit, leo sed ultrices porttitor, neque nisi sollicitudin nisl, id suscipit est urna sed eros. Vivamus\n      vehicula nisi eros, non dignissim erat sagittis et. Suspendisse nec ipsum sed elit convallis posuere non eu\n      ligula. Morbi sit amet rhoncus neque, vitae mattis tellus. Nulla sit amet nunc quis enim auctor fringilla.\n      Pellentesque luctus tincidunt lorem ac mattis. Nunc fermentum dignissim dui quis blandit. In hac habitasse platea\n      dictumst. Nunc pharetra blandit orci, sit amet malesuada lacus euismod vehicula. Donec dapibus tempus dui,\n      convallis laoreet nibh accumsan porta. Vivamus ut laoreet lectus. Pellentesque sit amet elit ipsum. Fusce viverra,\n      justo nec lobortis laoreet, urna eros pulvinar erat, eu fermentum mauris mauris id nibh. Duis sollicitudin eros id\n      est sodales, eu accumsan orci pulvinar. Etiam mollis eget magna a rhoncus.</p>\n  </md-card-content>\n</md-card>\n\n<md-card *ngIf=\"authService.isAuthenticated()\">\n  <md-card-header>\n    <md-card-title><h1 style=\"text-align: center\">Token will expire {{authService.getTokenExpirationDate() |\n      date:'MM/dd/yy HH:mm:ss'}}</h1></md-card-title>\n    <md-card-subtitle>Authenticated: {{authService.isAuthenticated()}}</md-card-subtitle>\n  </md-card-header>\n  <md-card-content>\n    <div style=\"width: 100%\">\n  <pre>\n    {{ authService.getUserData() | json }}\n  </pre>\n\n      <span x-large>Content from server:</span>\n\n      <div>\n        <md-input [style.width]=\"'100%'\" [value]=\"data.value\" (input)=\"data.value = $event.target.value\"\n                  autofocus></md-input>\n      </div>\n\n      <pre>this.data = {{ data | json }}</pre>\n    </div>\n  </md-card-content>\n</md-card>";

/***/ },

/***/ 679:
/***/ function(module, exports) {

module.exports = "<md-card>\n  <md-card-title>Login Page</md-card-title>\n  <md-card-content>\n    <form #loginForm=\"ngForm\">\n      <h1 style=\"color: red\">{{message}}</h1>\n      <md-input placeholder=\"Login\" [(ngModel)]=\"username\" name=\"username\"></md-input>\n      <md-input type=\"password\" placeholder=\"Password\" [(ngModel)]=\"password\" name=\"password\"></md-input>\n    </form>\n  </md-card-content>\n  <md-card-actions align=\"end\">\n    <button md-raised-button color=\"accent\" (click)=\"logMeIn()\">Log me in</button>\n    <button md-raised-button color=\"primary\">Forgot my password</button>\n  </md-card-actions>\n</md-card>\n";

/***/ },

/***/ 680:
/***/ function(module, exports) {

module.exports = "<md-card>\n  <md-card-title>404</md-card-title>\n  <md-card-content>Page not found :(</md-card-content>\n</md-card>\n";

/***/ },

/***/ 681:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
var index_1 = __webpack_require__(465);
__export(__webpack_require__(683));
__export(__webpack_require__(465));
__export(__webpack_require__(302));
exports.NG2_WEBSTORAGE = [
    index_1.SessionStorageService,
    index_1.LocalStorageService
];
//# sourceMappingURL=app.js.map

/***/ },

/***/ 682:
/***/ function(module, exports) {

"use strict";
"use strict";
exports.LIB_KEY = 'ng2-webstorage';
//# sourceMappingURL=lib.js.map

/***/ },

/***/ 683:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
__export(__webpack_require__(684));
__export(__webpack_require__(685));
__export(__webpack_require__(300));
//# sourceMappingURL=index.js.map

/***/ },

/***/ 684:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var webStorage_1 = __webpack_require__(300);
var storage_1 = __webpack_require__(136);
function LocalStorage(webstorageKey) {
    return webStorage_1.WebStorage(webstorageKey, storage_1.STORAGE.local);
}
exports.LocalStorage = LocalStorage;
//# sourceMappingURL=localStorage.js.map

/***/ },

/***/ 685:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var webStorage_1 = __webpack_require__(300);
var storage_1 = __webpack_require__(136);
function SessionStorage(webstorageKey) {
    return webStorage_1.WebStorage(webstorageKey, storage_1.STORAGE.session);
}
exports.SessionStorage = SessionStorage;
//# sourceMappingURL=sessionStorage.js.map

/***/ },

/***/ 686:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var storage_1 = __webpack_require__(136);
var storageObserver_1 = __webpack_require__(464);
var keyStorage_1 = __webpack_require__(302);
var WebStorageHelper = (function () {
    function WebStorageHelper() {
    }
    WebStorageHelper.store = function (sType, sKey, value) {
        this.getWStorage(sType).setItem(sKey, JSON.stringify(value));
        this.cached[sType][sKey] = value;
        storageObserver_1.StorageObserverHelper.emit(sType, sKey, value);
    };
    WebStorageHelper.retrieve = function (sType, sKey) {
        if (sKey in this.cached[sType])
            return this.cached[sType][sKey];
        var data = null;
        try {
            data = JSON.parse(this.getWStorage(sType).getItem(sKey));
        }
        catch (err) {
            console.error("invalid value for " + sKey);
        }
        return this.cached[sType][sKey] = data;
    };
    WebStorageHelper.clearAll = function (sType) {
        var _this = this;
        var storage = this.getWStorage(sType);
        keyStorage_1.KeyStorageHelper.retrieveKeysFromStorage(storage)
            .forEach(function (sKey) {
            storage.removeItem(sKey);
            delete _this.cached[sType][sKey];
            storageObserver_1.StorageObserverHelper.emit(sType, sKey, null);
        });
    };
    WebStorageHelper.clear = function (sType, sKey) {
        this.getWStorage(sType).removeItem(sKey);
        delete this.cached[sType][sKey];
        storageObserver_1.StorageObserverHelper.emit(sType, sKey, null);
    };
    WebStorageHelper.getWStorage = function (sType) {
        var storage;
        switch (sType) {
            case storage_1.STORAGE.local:
                storage = localStorage;
                break;
            case storage_1.STORAGE.session:
                storage = sessionStorage;
                break;
            default:
                throw Error('invalid storage type');
        }
        return storage;
    };
    WebStorageHelper.cached = (_a = {}, _a[storage_1.STORAGE.local] = {}, _a[storage_1.STORAGE.session] = {}, _a);
    return WebStorageHelper;
    var _a;
}());
exports.WebStorageHelper = WebStorageHelper;
//# sourceMappingURL=webStorage.js.map

/***/ },

/***/ 687:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var storage_1 = __webpack_require__(136);
var webStorage_1 = __webpack_require__(303);
var LocalStorageService = (function (_super) {
    __extends(LocalStorageService, _super);
    function LocalStorageService() {
        _super.call(this, storage_1.STORAGE.local);
    }
    LocalStorageService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [])
    ], LocalStorageService);
    return LocalStorageService;
}(webStorage_1.WebStorageService));
exports.LocalStorageService = LocalStorageService;
//# sourceMappingURL=localStorage.js.map

/***/ },

/***/ 688:
/***/ function(module, exports, __webpack_require__) {

"use strict";
"use strict";
var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = __webpack_require__(0);
var storage_1 = __webpack_require__(136);
var webStorage_1 = __webpack_require__(303);
var SessionStorageService = (function (_super) {
    __extends(SessionStorageService, _super);
    function SessionStorageService() {
        _super.call(this, storage_1.STORAGE.session);
    }
    SessionStorageService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [])
    ], SessionStorageService);
    return SessionStorageService;
}(webStorage_1.WebStorageService));
exports.SessionStorageService = SessionStorageService;
//# sourceMappingURL=sessionStorage.js.map

/***/ },

/***/ 689:
/***/ function(module, exports) {

module.exports = ""

/***/ },

/***/ 690:
/***/ function(module, exports) {

module.exports = "[hidden] {\n  display: none; }\n\n.fill {\n  -ms-flex: 1 1 auto;\n      flex: 1 1 auto; }\n\n.user-info {\n  margin-right: 10px;\n  font-size: 0.75em; }\n\n.footer {\n  -ms-flex-align: center;\n      align-items: center;\n  font-size: 1em;\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-direction: column;\n      flex-direction: column;\n  text-align: center;\n  margin: 25px auto; }\n  .footer a, .footer a:hover, .footer a:visited {\n    text-decoration: none;\n    color: black; }\n"

/***/ },

/***/ 691:
/***/ function(module, exports) {

module.exports = "md-card-content {\n  display: -ms-flexbox;\n  display: flex;\n  -ms-flex-direction: column;\n      flex-direction: column; }\n  md-card-content img {\n    width: 368px;\n    height: 400px;\n    -ms-flex-item-align: center;\n        align-self: center; }\n\nmd-card-header {\n  margin-bottom: 50px; }\n"

/***/ },

/***/ 692:
/***/ function(module, exports) {

module.exports = "md-input {\n  width: 100%; }\n"

/***/ },

/***/ 693:
/***/ function(module, exports) {

module.exports = ""

/***/ }

},[1047]);
//# sourceMappingURL=main.map