export interface Address {
    trackingId: string;
    overallDuration: string;
    result: string;
    censusMatchLevel: string;
    postalDirectoryMatchLevel: string;
    deliveryConfirmationCode: string;
    civicAddresses: CivicAddresses[];
    county: string;
    metropolitanStatisticalArea: string;
    geoPoint?: GeoPoint;
}

export interface CivicAddresses {
    streetAddress: string;
    streetNrFirst: string;
    streetName: string;
    streetType: string;
    locality: string[];
    stateOrProvince: string;
    postCode: string;
    source: string;
}

export interface GeoPoint {
    source: string;
    latitude: string;
    longitude: string;
    coordinateLevel: string;
    accuracy: string;
}

export interface ValidateAddress {
    isAddressValid: number;
    verificationType: string;
    message: string;
}