package com.centurylink.pctl.mod.core.utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.joda.time.DateTime;

public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        JodaModule simpleModule = new JodaModule();
        simpleModule.addSerializer(DateTime.class, CustomDateTimeSerializer.INSTANCE);

        mapper.registerModule(simpleModule);
    }

	public static String convertObjectToJsonString(final Object obj) {
		String jsonInString = null;
		if (obj != null){
			try {

                jsonInString  =  mapper.writeValueAsString(obj);
			} catch (Exception ex) {
				//log.error("Error occured when converting " + obj.getClass().getCanonicalName() + " to Json String " + ex);
				ex.printStackTrace();
			}
		}
		return jsonInString;

	}

	public static Object convertTextJsontoObject(String textMessage, Class<?> valueType) {
		Object obj = null;
		try {
             // mapper.getSerializationConfig().setDateFormat(PublicUtils.DATE_TIME_FORMAT);
			obj =  mapper.readValue(textMessage, valueType);
		} catch (Exception ex) {
			//log.error("Error occured when converting JsonString to object of type " + valueType.getCanonicalName() + ex);
			ex.printStackTrace();
		}
		return obj;

	}





}
