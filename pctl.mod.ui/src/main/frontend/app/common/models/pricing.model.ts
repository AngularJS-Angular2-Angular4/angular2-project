/*export interface Pricing {
    id: number;
    product_id: number;
    urnId: string;
    name: string;
    productType: string;
    currency: string;
    productVariants: ProductVariant[];
}
*/
export interface Pricing {
    variantId: string;
    productId: string;
    name: string;
    sku: string;
    descriptionHtml: string;
    displayImage: string;
    displayPosition: number;
    servicePlan: string;
    serviceVendor: string;
    serviceTransport: string;
    securityPkg: string;
    standardCpe: string;
    haServicePlan: string;
    haServiceVendor: string;
    haServiceTransport: string;
    haSecurityPkg: string;
    haCpe: string;
    tier1Support: string;
    currency: string;
    priceList: TermPrice[];
}
/*
export interface PriceInfo {
    term_12: TermPrice;
    term_24: TermPrice;
    term_36: TermPrice;
}
*/
export interface TermPrice {
    term: string;
    own: number;
    ctl: number;
}

export interface ActiveStatus {
    mode: string;
    sku: string;
    term?: string;
    name?: string;
    productVariant?: Pricing;
    transport?: string;
}
