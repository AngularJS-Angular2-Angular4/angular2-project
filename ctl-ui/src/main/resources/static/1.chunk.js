webpackJsonp([1],{

/***/ 1052:
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
var order_component_1 = __webpack_require__(1055);
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
exports.ROUTER_CONFIG = [
    { path: '', component: order_component_1.OrderComponent, pathMatch: 'full' }
];
var OrderModule = (function () {
    function OrderModule() {
    }
    OrderModule.routes = exports.ROUTER_CONFIG;
    OrderModule = __decorate([
        core_1.NgModule({
            imports: [
                router_1.RouterModule.forChild(exports.ROUTER_CONFIG),
                forms_1.FormsModule,
                platform_browser_1.BrowserModule,
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
                core_2.MdCoreModule
            ],
            declarations: [order_component_1.OrderComponent],
            bootstrap: [order_component_1.OrderComponent]
        }), 
        __metadata('design:paramtypes', [])
    ], OrderModule);
    return OrderModule;
}());
exports.OrderModule = OrderModule;


/***/ },

/***/ 1055:
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
var auth_service_1 = __webpack_require__(340);
var http_1 = __webpack_require__(109);
console.log('`Order` component loaded asynchronously');
var OrderComponent = (function () {
    function OrderComponent(http, authService) {
        this.http = http;
        this.authService = authService;
        this.orders = [];
        this.editing = false;
        this.editedOrder = null;
    }
    OrderComponent.prototype.ngOnInit = function () {
        console.log('Order Management');
        this.fetchOrders();
    };
    OrderComponent.prototype.editPost = function (order) {
        this.editing = true;
        this.editedOrder = JSON.parse(JSON.stringify(order));
        this.scrollToTop();
    };
    OrderComponent.prototype.newPost = function () {
        this.editing = true;
        this.editedOrder = {
            id: null,
            title: '',
            content: '',
            createdDate: null,
            updatedDate: null,
            version: null,
            createdBy: null,
            updatedBy: null,
        };
    };
    OrderComponent.prototype.removeOrder = function (order) {
        this.deleteOrder(order);
    };
    OrderComponent.prototype.cancelEdit = function () {
        this.editing = false;
        this.editedOrder = null;
        this.scrollToTop();
    };
    OrderComponent.prototype.refresh = function () {
        this.cancelEdit();
        this.fetchOrders();
    };
    OrderComponent.prototype.fetchOrders = function () {
        var _this = this;
        this.http.get('/orders/', { headers: this.authService.getAuthorizationHeaders() })
            .subscribe(function (data) {
            console.log(" i am here");
            console.log(data.json());
            _this.orders = data.json();
        }, function (err) { return console.log('Something went wrong'); });
    };
    OrderComponent.prototype.saveOrder = function (order) {
        var _this = this;
        this.http.post("/orders/", order, { headers: this.authService.getAuthorizationHeaders() })
            .subscribe(function (data) {
            console.log('Saved', data.json());
            _this.updateOrAddOrderToList(data.json());
        }, function (err) { return console.log('Something went wrong'); });
    };
    OrderComponent.prototype.deleteOrder = function (order) {
        var _this = this;
        this.http.delete("/orders/" + order.id, { headers: this.authService.getAuthorizationHeaders() })
            .subscribe(function (data) {
            console.log('Removed', data.json());
            _this.removeOrderFromList(order);
        }, function (err) { return console.log('Something went wrong'); });
    };
    OrderComponent.prototype.removeOrderFromList = function (order) {
        this.orders = this.orders.filter(function (x, idx, obs) { return x.id !== order.id; });
        this.cancelEdit();
    };
    OrderComponent.prototype.updateOrAddOrderToList = function (order) {
        var _this = this;
        var changedList = this.orders.filter(function (x, idx, obs) { return x.id === order.id; });
        if (changedList.length === 0) {
            this.orders.push(order);
        }
        else {
            changedList.forEach(function (x) {
                var index = _this.orders.indexOf(x);
                _this.orders[index] = order;
            });
        }
        this.cancelEdit();
    };
    OrderComponent.prototype.scrollToTop = function () {
        var contentEl = document.querySelector('md-sidenav-layout > md-content');
        if (contentEl) {
            this.scrollTo(contentEl, 0, 100);
        }
    };
    OrderComponent.prototype.scrollTo = function (element, to, duration) {
        var _this = this;
        if (duration <= 0)
            return;
        var difference = to - element.scrollTop;
        var perTick = difference / duration * 10;
        setTimeout(function () {
            element.scrollTop = element.scrollTop + perTick;
            if (element.scrollTop === to)
                return;
            _this.scrollTo(element, to, duration - 10);
        }, 10);
    };
    OrderComponent = __decorate([
        core_1.Component({
            selector: 'orders',
            styles: [__webpack_require__(1064)],
            template: __webpack_require__(1062)
        }), 
        __metadata('design:paramtypes', [(typeof (_a = typeof http_1.Http !== 'undefined' && http_1.Http) === 'function' && _a) || Object, (typeof (_b = typeof auth_service_1.AuthService !== 'undefined' && auth_service_1.AuthService) === 'function' && _b) || Object])
    ], OrderComponent);
    return OrderComponent;
    var _a, _b;
}());
exports.OrderComponent = OrderComponent;


/***/ },

/***/ 1062:
/***/ function(module, exports) {

module.exports = "<md-toolbar align=\"end\">\n  <button md-raised-button color=\"primary\" (click)=\"newOrder()\">new Order</button>\n  <button md-raised-button color=\"secondary\" (click)=\"refresh()\">refresh</button>\n</md-toolbar>\n<md-card *ngIf=\"editing\">\n  <md-card-title>Editing Order</md-card-title>\n  <md-card-content>\n    <form #editPostForm=\"ngForm\">\n      <md-input placeholder=\"Title\" [(ngModel)]=\"editedOrder.title\" name=\"title\" maxLength=\"100\" required=\"required\"\n                #titleField>\n        <md-hint align=\"end\">{{titleField.characterCount}} / 100</md-hint>\n      </md-input>\n      <md-input rows=\"3\" type=\"Content\" placeholder=\"Content\" [(ngModel)]=\"editedOrder.content\" name=\"content\"\n                maxLength=\"255\" required=\"required\" #contentField>\n        <md-hint align=\"end\">{{contentField.characterCount}} / 255</md-hint>\n      </md-input>\n    </form>\n  </md-card-content>\n  <md-card-actions align=\"end\">\n    <button md-raised-button color=\"accent\" (click)=\"saveOrder(editedOrder)\">save</button>\n    <button md-raised-button color=\"primary\" (click)=\"cancelEdit()\">cancel</button>\n  </md-card-actions>\n</md-card>\n<md-card *ngFor=\"let order of orders\" class=\"ordercard\">\n  <md-card-title>{{order.title}}</md-card-title>\n  <md-card-content>\n    <p>{{order.content}}</p>\n    <md-list>\n      <md-list-item>\n        <p md-line>id: {{order.id}}</p>\n        <p md-line>createdDate: {{order.createdDate | date:\"dd.MM.yyyy HH:mm\"}}</p>\n        <p md-line>updatedDate: {{order.createdDate | date:\"dd.MM.yyyy HH:mm\"}}</p>\n        <p md-line>version: {{order.version}}</p>\n      </md-list-item>\n    </md-list>\n  </md-card-content>\n  <md-card-actions align=\"end\">\n    <button md-raised-button color=\"primary\" (click)=\"editOrder(order)\">edit</button>\n    <button md-raised-button color=\"accent\" (click)=\"removeOrder(order)\">remove</button>\n  </md-card-actions>\n</md-card>\n";

/***/ },

/***/ 1064:
/***/ function(module, exports) {

module.exports = ".ordercard {\n  margin: 10px 10px; }\n\nform > md-input {\n  width: 100%; }\n\n.md-hint {\n  height: 1.5em; }\n"

/***/ }

});
//# sourceMappingURL=1.map