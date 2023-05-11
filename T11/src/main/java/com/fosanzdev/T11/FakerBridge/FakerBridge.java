package com.fosanzdev.T11.FakerBridge;

import com.github.javafaker.Faker;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FakerBridge {

    private static Faker faker = new Faker();

    public static String genName(){
        return faker.name().firstName();
    }

    public static String genFullName(){
        return faker.name().fullName();
    }

    /**
     * Generates a random birthdate between min and max years ago
     * @param min years ago
     * @param max years ago
     * @return a random birthdate in GregorianCalendar format
     */
    public static GregorianCalendar genGregorianBirthDay(int min, int max){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(faker.date().birthday(min, max));
        return gCalendar;
    }

    /**
     * Generates a random birthdate between min and max years ago
     * @param min years ago
     * @param max years ago
     * @return a random birthdate in Date format
     */
    public static Date genDateBirthDay(int min, int max){
        return faker.date().birthday(min, max);
    }
}
