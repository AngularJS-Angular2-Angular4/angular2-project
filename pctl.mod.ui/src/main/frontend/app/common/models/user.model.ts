import { CartState, ShoppingCart } from './cart.model';
import { ActiveStatus } from './pricing.model';
import { Breadcrumb } from './breadcrumb.model';

export interface User {
    id: number;
    avatar?: string;
    email: string;
    enterpriseInfo?: EnterpriseInfo;
    fingerPrint?: string;
    cartInfo?: CartInfo;
    rememberMe?: boolean;
    token?: string;
    loggedIn: boolean;
    status?: ActiveStatus;
    breadcrumbs?: Breadcrumb[];
}

export interface EnterpriseInfo {
    ein: number;
    ownTransport: boolean;
}

export interface CartInfo {
    cartState: CartState;
    shoppingCartId: string;
}

