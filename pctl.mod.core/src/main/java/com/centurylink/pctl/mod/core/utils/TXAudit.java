package com.centurylink.pctl.mod.core.utils;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TXAudit {

    public static final SimpleDateFormat TX_ID_FORMAT = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static final String TX_ID = "_TX_ID";

    public static final String CLIENT_ID = "_CLIENT_ID";

    public static final String SCHEDULING_ORDER_ID = "_SCHEDULING_ORDER_ID";

    public static final String UPSTREAM_PRODUCTION_TIME = "_UPSTREAM_PRODUCTION_TIME";

    public static final String CONSUMPTION_START_TIME = "_CONSUMPTION_START_TIME";

    public static final String EVENT = "_EVENT";

    private static final ThreadLocal<Map<String, Object>> auditMap = new ThreadLocal<Map<String, Object>>() {
        @Override
        protected Map<String, Object> initialValue() {
            return new HashMap<>();
        }
    };

    public static Object getAuditData(String fieldName) {
        return auditMap.get().get(fieldName);
    }

    public static void init(Map<String, Object> map) {
        auditMap.set(map);
    }

    public static void remove() {
        auditMap.remove();
    }

    public static String getClientId() {
        return (String) getAuditData(TXAudit.CLIENT_ID);
    }

    public static String getTXId() {
        return (String) getAuditData(TXAudit.TX_ID);
    }

    public static String getSchedulingOrderId() {
        return (String) getAuditData(TXAudit.SCHEDULING_ORDER_ID);
    }

    public static long getUpstreamProductionTime() {
        return (Long) getAuditData(TXAudit.UPSTREAM_PRODUCTION_TIME);
    }

    public static long getMessageLatency(){
        return getConsumptionStartTime() - getUpstreamProductionTime();
    }

    public static long getConsumptionStartTime() {
        return (Long) getAuditData(TXAudit.CONSUMPTION_START_TIME);
    }

    public static String getSchedulingEventName() {
        return (String) getAuditData(TXAudit.EVENT);
    }
}
