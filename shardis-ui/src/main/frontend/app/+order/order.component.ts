import {Component, OnInit} from '@angular/core';
import {AuthService} from '../shared/auth/auth.service';
import {Http} from '@angular/http';

console.log('`Order` component loaded asynchronously');

@Component({
  selector: 'orders',
  styles: [require('./order.component.scss')],
  template: require('./order.component.html')
})
export class OrderComponent implements OnInit {

  orders:Order[] = [];

  editing:boolean = false;
  editedOrder:Order = null;

  constructor(public http:Http, public authService:AuthService) {
  }


  ngOnInit():any {
    console.log('Order Management');
    this.fetchOrders();
  }

  public editOrder(order:Order) {
    this.editing = true;
    this.editedOrder = JSON.parse(JSON.stringify(order));
    this.scrollToTop();
  }

  public newOrder() {
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
  }

  public removeOrder(order:Order) {
    this.deleteOrder(order);
  }

  public cancelEdit() {
    this.editing = false;
    this.editedOrder = null;
    this.scrollToTop();
  }

  public refresh() {
    this.cancelEdit();
    this.fetchOrders();
  }

  private fetchOrders() {
    this.http.get('/orders/', {headers: this.authService.getAuthorizationHeaders()})
      .subscribe(
        data => {
          console.log(" i am here");
          console.log(data.json());
          this.orders = data.json();
        },
        err => console.log('Something went wrong')
      );
  }

  private saveOrder(order:Order) {
    this.http.post(`/orders/`, order, {headers: this.authService.getAuthorizationHeaders()})
      .subscribe(
        data => {
          console.log('Saved', data.json());
          this.updateOrAddOrderToList(data.json());
        },
        err => console.log('Something went wrong')
      );
  }

  private deleteOrder(order:Order) {
    this.http.delete(`/orders/${order.id}`, {headers: this.authService.getAuthorizationHeaders()})
      .subscribe(
        data => {
          console.log('Removed', data.json());
          this.removeOrderFromList(order);
        },
        err => console.log('Something went wrong')
      );
  }

  private removeOrderFromList(order:Order) {
    this.orders = this.orders.filter((x, idx, obs) => x.id !== order.id);
    this.cancelEdit();
  }

  private updateOrAddOrderToList(order:Order) {
    var changedList:Order[] = this.orders.filter((x, idx, obs) => x.id === order.id);
    if (changedList.length === 0) {
      this.orders.push(order);
    } else {
      changedList.forEach((x) => {
        var index = this.orders.indexOf(x);
        this.orders[index] = order;
      });
    }
    this.cancelEdit();
  }

  private scrollToTop() {
    var contentEl = document.querySelector('md-sidenav-layout > md-content');
    if (contentEl) {
      this.scrollTo(contentEl, 0, 100);
    }
  }

  private scrollTo(element, to, duration) {
    if (duration <= 0) return;
    var difference = to - element.scrollTop;
    var perTick = difference / duration * 10;

    setTimeout(() => {
      element.scrollTop = element.scrollTop + perTick;
      if (element.scrollTop === to) return;
      this.scrollTo(element, to, duration - 10);
    }, 10);
  }

}

interface Order {
  id:number;
  uuid?:string;
  title:string;
  content:string;
  createdDate:Date;
  updatedDate:Date;
  version:number;
  createdBy:any;
  updatedBy:any;
}
