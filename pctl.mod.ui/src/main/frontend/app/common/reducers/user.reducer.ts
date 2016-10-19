import { ActionReducer, Action } from '@ngrx/store';
import { User } from '../models/user.model';

const initialState: User = {
    id: 0,
    email: '',
    loggedIn: false
};

export const userReducer: ActionReducer<User>
              = (state: any = [], action: Action) => {
  switch (action.type) {
    case 'CREATE_USER':
      return action.payload;
    case 'UPDATE_USER':
      return action.payload;
    case 'DELETE_USER':
      return initialState;
    case 'INIT_USER':
      return initialState;
    case 'UPDATE_ENT_DETAILS':
      return Object.assign({}, state, action.payload);
    case 'UPDATE_ACTIVE_SELECTION':
      return Object.assign({}, state, { status : action.payload});
    case 'UPDATE_BREADCRUMB':
      return Object.assign({}, state, { breadcrumbs : action.payload});
    case 'UPDATE_CART_DETAILS':
      return Object.assign({}, state, action.payload);
    case 'ADD_FINGERPRINT':
      return Object.assign({}, state, action.payload);
    default:
      return state;
  }
};
