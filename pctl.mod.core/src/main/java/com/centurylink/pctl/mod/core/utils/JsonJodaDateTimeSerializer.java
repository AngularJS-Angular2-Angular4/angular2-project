
package com.centurylink.pctl.mod.core.utils;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


/**
 * Created by blaxmi on 2/14/2016.
 */

public class JsonJodaDateTimeSerializer extends JsonSerializer<DateTime> {
    private static final Logger log = LoggerFactory.getLogger(JsonJodaDateTimeSerializer.class);
    private static DateTimeFormatter formatter = ISODateTimeFormat.dateTime();

    @Override
    public void serialize(DateTime value, JsonGenerator gen, SerializerProvider arg2)
        throws IOException, JsonProcessingException {
        gen.writeString(formatter.print(value));
    }

}

