package com.rakovets.course.java.core.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public abstract class DateUtil {
    public static LocalDateTime convertFromEpochMilli(long epochMilli) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), TimeZone.getDefault().toZoneId());
    }
}
