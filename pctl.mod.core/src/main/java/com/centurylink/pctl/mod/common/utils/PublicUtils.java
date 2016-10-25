package com.centurylink.pctl.mod.core.utils;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;

public class PublicUtils {

    public static final SimpleDateFormat DATE_TIME_FORMAT_ID = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    public static final String LIVE_STREAM = "Live Stream";

    public static final String NEAR_LIVE = "Near Live";

    public static final String EVER_GREEN = "Evergreen";

    public static final String PREVIEW_START_TIME = "PreviewStartTime";

    public static final String BUNDLE_ONLY = "Bundle Only";

    public static final String GENRE_1 = "Genre1";

    public static final String GENRE_2 = "Genre2";

    public static final String GENRE_3 = "Genre3";

    public static final String SOURCE = "MIND";

    public static final String ACTION_ADD = "ADD";

    public static final String ACTION_UPDATE = "UPDATE";

    public static final String ACTION_REMOVE = "REMOVE";

    public static final String OFFERING_LINK = "OfferingLink";

    public static final String VISIBILITY_DATE = "VisibilityDate";

    public static final String VISIBILITY_DATE_FORMAT_SRC = "MM/dd/yyyy hh:mm:ss a";

    public static final String VISIBILITY_DATE_DEFAULT_TIMEZONE = "America/New_York";

    public static final String LIVE_EXPERIENCE = "LiveExperience";

    public static final String LIVE__EXPERIENCE = "Live Experience";

    public static final String AFFILIATE_IMG_TYPE = "affiliateimgtype";

    public static final String SUPPLEMENT_KEY = "supplementkey";

    public static final String ROLE = "role";

    public static final String FILE_NAME = "filename";

    public static final String DIGITAL_ID = "did";


}
