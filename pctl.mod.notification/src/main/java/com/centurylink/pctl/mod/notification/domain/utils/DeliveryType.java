package com.centurylink.pctl.mod.notification.domain.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pulapakas on 18-10-2016.
 */
public enum DeliveryType {
    EMAIL, MESSAGE;

    private final static List<String> deliveryTypes = new ArrayList<>();

    static {
        for (DeliveryType type : DeliveryType.values()) {
            deliveryTypes.add(type.name());
        }
    }

    public static DeliveryType getValueOf(String name) {
        if (name != null) {
            for (DeliveryType type : DeliveryType.values()) {
                if (type.name().equalsIgnoreCase(name))
                    return type;
            }
        }
        return null;
    }

    public static String getSupportedValues() {
        return deliveryTypes.toString();
    }
}

