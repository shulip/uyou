package com.uyou.utils;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @description 日期和时间的辅助计算类
 **/
public class DateTimeUtil {
    private DateTimeUtil(){}
    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static LocalDateTime string2LocalDateTime(String s) {
        return LocalDateTime.parse(s, DF);
    }

    public static long calculateHourTime(LocalDateTime start, LocalDateTime end){
        return Duration.between(start, end).toHours();
    }

    public static boolean checkIfCanReset(LocalDateTime lastSubmittedAt, int daysBeforeReset) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(lastSubmittedAt, now);
        return duration.toDays() >= daysBeforeReset;
    }

    /**
     * @Author zxwang
     * @Description 将LocalDate转换为LocalDateTime
     * @Param [LocalDate]
     * @Return java.time.LocalDateTime
     */
    public static LocalDateTime toLocalDateTime(LocalDate localDate) {
        long timestamp = localDate.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();
        return Instant.ofEpochMilli(timestamp).atZone(ZoneOffset.ofHours(8)).toLocalDateTime();
    }

    /**
     * @Author zxwang
     * @Description 计算间隔日数
     * @Param [LocalDateTime，LocalDateTime]
     * @Return int
     */
    public static int calculateDayTime(LocalDateTime beginTime, LocalDateTime endTime) {
        return (int) Duration.between(beginTime, endTime).toDays();
    }

    /**
     * @Author zxwang
     * @Description 计算间隔日数
     * @Param [LocalDate，LocalDate]
     * @Return int
     */
    public static int calculateDayTime(LocalDate beginTime, LocalDate endTime) {
        return (int) (endTime.toEpochDay() - beginTime.toEpochDay());
    }

    /**
     * @Author zxwang
     * @Description 计算间隔月数
     * @Param [LocalDate，LocalDate]
     * @Return int
     */
    public static int calculateMonthTime(LocalDate beginTime,LocalDate endTime){
        return (int) (endTime.toEpochDay() - beginTime.toEpochDay())/30;
    }

    public static LocalDate string2LocalDate(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

}
