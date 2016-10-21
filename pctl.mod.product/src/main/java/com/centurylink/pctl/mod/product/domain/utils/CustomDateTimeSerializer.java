package com.centurylink.pctl.mod.product.domain.utils;

import java.io.IOException;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Custom Jackson serializer for transforming a Joda DateTime object to JSON.
 */
public class CustomDateTimeSerializer extends JsonSerializer<DateTime> {

    public static final CustomDateTimeSerializer INSTANCE = new CustomDateTimeSerializer();

    private CustomDateTimeSerializer() {
    }

    private static DateTimeFormatter formatter = ISODateTimeFormat.dateTime();

    @Override
    public void serialize(DateTime value, JsonGenerator generator,
                          SerializerProvider serializerProvider)
        throws IOException {

        generator.writeString(formatter.print(value));
        // This will work too
        //generator.writeString(value.toString());
    }

}
