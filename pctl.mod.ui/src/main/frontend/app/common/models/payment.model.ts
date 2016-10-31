export interface Payment {
    cartTotal: number;
    cartTotalWithTax: number;
    currency: string;
    status: string;
    cartId: string;
    paymentType: string;
}
