package com.java8.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * Created by shijuan on 2019/4/24.
 */
public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);
        Instant instant = clock.instant();
        System.out.println(instant);
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);

        //输出所有区域标识符
        System.out.println("出所有区域标识符-----------------------");
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        ZoneId zoneId1 = ZoneId.of("Brazil/East");
        System.out.println(zoneId.getRules());
        System.out.println(zoneId1.getRules());

        System.out.println("----------------------");
        LocalTime now1 = LocalTime.now(zoneId);
        LocalTime now2 = LocalTime.now(zoneId1);
        System.out.println(now1.isBefore(now2));
        long hoursBetWeen = ChronoUnit.HOURS.between(now1,now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1,now2);
        System.out.println(hoursBetWeen);
        System.out.println(minutesBetween);


        System.out.println("=======================");
        LocalTime late = LocalTime.of(23,59,59);
        System.out.println(late);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        LocalTime localTime = LocalTime.parse("13:57",dateTimeFormatter);
        System.out.println(localTime);


        System.out.println("本地日期--------------");
        LocalDate today = LocalDate.now();//获取现在的日期
        System.out.println("今天的日期："+today);
        LocalDate tomorrow = today.plus(1,ChronoUnit.DAYS);
        System.out.println("明天的日期： "+tomorrow);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println("昨天的日期： "+yesterday);
        LocalDate independenceDay = LocalDate.of(2019,Month.MARCH,12);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println("今天是周几： "+dayOfWeek);

        DateTimeFormatter formatter =
        DateTimeFormatter
                .ofPattern("MMM dd, yyyy - HH:mm");
        LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13", formatter);
        String string = formatter.format(parsed);
        System.out.println(string);



    }



}
