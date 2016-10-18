import { User } from './user.model';
import { Product } from './product.model';
import { Pricing } from './pricing.model';

export interface AppStore {
  user: User;
  product: Product;
  prices: Pricing;
};
