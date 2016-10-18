export const APP_MENU:AppMenuItem[] = [

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

export interface AppMenuItem {
  name:string;
  description:string;
  icon:string;
  link:string[];
  roles?:string[];
}
