package com.endava.java8Task;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class StarWars {
    public static void main(String[] args) {

        long times = 0;
        long minutes = 0;
        long hours = 0;
        long days = 0;
        long leftover = 0;

        LocalDate releaseDate = LocalDate.of(1977, Month.MAY, 25);
        LocalDate twoYearsAfterRelease = releaseDate.plusYears(2);
        LocalDate oneYearAfterRelease = releaseDate.plusYears(1);

        DayOfWeek dayOfWeek = DayOfWeek.from(releaseDate);
        System.out.println("The release date of Start Wars Episode 6 - " + releaseDate + ", " + dayOfWeek.name());

        LocalDate firstSat = releaseDate.with(TemporalAdjusters.nextOrSame(SATURDAY));
        LocalDate lastSat2 = twoYearsAfterRelease.with(TemporalAdjusters.previous(SATURDAY));
        LocalDate firstSun = releaseDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate lastSun2 = twoYearsAfterRelease.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
        long twoYearsNum = ChronoUnit.WEEKS.between(firstSat, lastSat2) + ChronoUnit.WEEKS.between(firstSun, lastSun2);

        if (dayOfWeek != SATURDAY) {
            if (dayOfWeek != SUNDAY) {
                System.out.println("In the first 2 years the movie was played " + (twoYearsNum + 1) + " times");
            } else System.out.println("In the first 2 years the movie was played " + twoYearsNum + " times");
        }

        LocalDate lastSat1 = oneYearAfterRelease.with(TemporalAdjusters.previous(SATURDAY));
        LocalDate lastSun1 = oneYearAfterRelease.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
        long oneYearNum = ChronoUnit.WEEKS.between(firstSat, lastSat1) + ChronoUnit.WEEKS.between(firstSun, lastSun1);

        if (dayOfWeek != SATURDAY) {
            if (dayOfWeek != SUNDAY) {
                times = oneYearNum + 1;
            } else times = oneYearNum;
        }

        minutes = times * 120;
        hours = times * 2;
        days = hours / 24;
        leftover = hours % 24;

        System.out.println("In the first year the movie was played: ");
        System.out.println("Times " + times);
        System.out.println("Minutes " + minutes);
        System.out.println("Hours " + hours);
        System.out.println(days + " Days " + leftover + " hours");

    }
}