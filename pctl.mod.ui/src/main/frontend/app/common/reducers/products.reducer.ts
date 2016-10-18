import { ActionReducer, Action } from '@ngrx/store';
import { Product } from '../models/product.model';

export const productsReducer: ActionReducer<Product>
              = (state: any = [], action: Action) => {
  switch (action.type) {
    case 'ADD_PRODUCTS':
      return action.payload;
    default:
      return state;
  }
};
