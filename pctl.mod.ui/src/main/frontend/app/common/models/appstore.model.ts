import { User } from './user.model';
import { Product } from './product.model';
import { Pricing } from './pricing.model';
import { ActiveStatus } from './pricing.model';
import { ShoppingCart } from './cart.model';

export interface AppStore {
  user: User;
  cart: ShoppingCart;
  product: Product;
  prices: Pricing;
  status?: ActiveStatus;
};
