package com.bento909.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.text.ParseException;

public class DateMaker {
    // Generates a date at random
    public Date dateMaker() {
        //ArrayList<> month31Days = new List<1,3,5,7,8,10,12>;
        Date date;
        Random rand = new Random();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = df.parse(dateString(rand));
            return date;
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }

    private String dateString(Random rand) {
        List<Integer> month30Days = new List<Integer>;
        month30Days.add(4);
        month30Days.add(6);
        month30Days.add(9);
        month30Days.add(11);
        int year = rand.nextInt(16) + 2001;
        int month = rand.nextInt(12);
        int days = 0;
        int day;
        if (month30Days.contains(month)) {
            days = 30;
        } else {
            if (month == 2) {
                if (isLeapYear(year)) {
                    days = 29;
                }
                else{
                    days = 28;
                }
            }
        }

        {
            days = 31;
        }
        day = rand.nextInt(days) + 1;
        return day + "-" + month + "-" + year;
    }

    public boolean isLeapYear(int year){
        if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0)){
            return true;
        }
        else {
            return false;
        }
    }
}

