export interface Cart {
    inventoryItems: InventoryItems[];
}

export interface InventoryItems {
    lineItem: string;
    itemName: string;
    quantity: number;
}

export enum CartState {
    'LandingPage',
    'Locations',
    'Terms And Conditions'
}

export interface ShoppingCart {
    id?: string;
    state?: CartState;
    lineItems?: LineItem[];
}

export interface LineItem {
    id?: string;
    productName: string;
    productId: string;
    productTemplateName: string;
    productTemplateId: string;
    locations?: SDWANLocationInfo[];
}

export interface LocationInfo {
    productTemplateId: string;
    location: SDWANLocationInfo;
}

export interface ContactInfo {
    id?: string;
    email: string;
    firstName: string;
    lastName: string;
    phoneNumber: string;
}

export interface EnterpriseAddress {
    id?: string;
    locationName: string;
    addressLine: string;
    street: string;
    city: string;
    country: string;
    state: string;
    zipCode: string;
}

export interface SDWANLocationInfo {
    id?: string;
    serviceContact: ContactInfo;
    serviceAddress: EnterpriseAddress;
    shippingAddress: EnterpriseAddress;
}

export interface LocationDisplay {
    id?: string;
    name: string;
    contact: string;
    address: string;
}
