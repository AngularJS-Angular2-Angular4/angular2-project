import { Cart } from './cart.model';

export interface Order {
    orderName: string;
    orderDate: string;
    orderValue: number;
    shoppingCart: Cart;
} 