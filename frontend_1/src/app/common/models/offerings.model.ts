export interface Offerings {
    serviceTkey: string;
    offeringTkey: string;
    title: string;
    date: string;
    offeringInfo: OfferingInfo;
    photos: Photos[];
    genres: Genres;
}

export interface OfferingInfo {
    internalId: string;
    service: string;
    mindOfferingId: string;
    offeringType: string;
    offeringId: string;
}

export interface Photos {
    did: string;
    role: string;
}

export interface Genres {
    genre1: string;
    genre2: string;
    genre3: string;
}