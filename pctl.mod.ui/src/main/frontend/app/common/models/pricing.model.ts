export interface Pricing {
    id: number;
    product_id: number;
    urnId: string;
    name: string;
    productType: string;
    currency: string;
    productVariants: ProductVariant[];
}

export interface ProductVariant {
    variantId: number;
    productId: string;
    name: string;
    sku: string;
    priceInfo: PriceInfo;
}

export interface PriceInfo {
    term_12: TermPrice;
    term_24: TermPrice;
    term_36: TermPrice;
}

export interface TermPrice {
    own: number;
    ctl: number;
}

export interface ActiveStatus {
    mode: string;
    sku: string;
    term?: string;
    name?: string;
    productVariant?: ProductVariant;
    transport?: string;
}
