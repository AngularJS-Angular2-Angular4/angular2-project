import { ActionReducer, Action } from '@ngrx/store';
import { Pricing } from '../models/pricing.model';


export const pricesReducer: ActionReducer<Pricing>
              = (state: any = [], action: Action) => {
  switch (action.type) {
    case 'ADD_PRICES':
      return action.payload;
    default:
      return state;
  }
};
