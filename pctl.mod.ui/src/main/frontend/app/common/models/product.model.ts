export interface Product {
    id: number;
    urnid: string;
    name: string;
    description: string;
    product_type: string;
    created_at: string;
    updated_at: string;
    display_scope: string[];
    variants: Variant[];
}

export interface Variant {
    id: number;
    product_id: number;
    name: string;
    sku: string;
    created_at: string;
    updated_at: string;
    display_position: number;
    service_plan: string;
    service_vendor: string;
    service_transport: string;
    security_pkg: string;
    standard_cpe: string;
    ha_service_plan: string;
    ha_service_vendor: string;
    ha_service_transport: string;
    ha_security_pkg: string;
    ha_cpe: string;
    tier1_support: string;
}
