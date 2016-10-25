export interface Product {
    productId: string;
    name: string;
    descriptionHtml: string;
    productType: string;
    createdAt: string;
    updatedAt: string;
    productVariants: Variant[];
}

export interface Variant {
    variantId: string;
    productId: number;
    name: string;
    descriptionHtml: string;
    sku: string;
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
}

export interface Terms {
    name: string;
    frequency: string;
    shortCode: string;
}
