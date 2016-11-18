package com.bento909.model;

import com.google.common.collect.ImmutableList;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class DateMaker {

    private static final List<Integer> MONTHS_30_DAYS = ImmutableList.of(3, 5, 8, 10);
    private static final Random RANDOM = new Random();
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");

    public static Date generateRandomDate() {
        try {
            return DATE_FORMAT.parse(generateDateString());
        } catch (ParseException ex) {
            System.out.println("couldn't parse date, returning Now");
            return new Date();
        }
    }

    private static String generateDateString() {
        int year = RANDOM.nextInt(16) + 2001;
        int month = RANDOM.nextInt(12);
        int day = getADayInMonth(getDaysInMonth(month, year));
        return day + "-" + month + "-" + year;
    }

    private static int getDaysInMonth(int month, int year){
        if (MONTHS_30_DAYS.contains(month)) {
            return 30;
        } else {
            if (month == 1) {
                return isLeapYear(year) ? 29 : 28;
            }
            return 31;
        }
    }

    private static int getADayInMonth(int daysInMonth){
        return RANDOM.nextInt(daysInMonth) + 1;
    }

    private static boolean isLeapYear(int year){
        return (year % 100 == 0 && year % 400 == 0) || (year % 4 == 0);
    }
}
