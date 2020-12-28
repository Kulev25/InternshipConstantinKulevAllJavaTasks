package com.endava.java8Task;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class FlightDuration {
    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");

        LocalDateTime leaving = LocalDateTime.of(2020, Month.NOVEMBER, 10, 11, 15);
        ZoneId leavingZone = ZoneId.of("Australia/Sydney");
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

        try {
            String out1 = departure.format(format);
            System.out.printf("LEAVING:  %s (%s)%n", out1, leavingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", departure);
            throw exc;
        }

        LocalDateTime arriving = LocalDateTime.of(2020, Month.NOVEMBER, 10, 6, 0);
        ZoneId arrivingZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime arrival = ZonedDateTime.of(arriving, arrivingZone);

        try {
            String out1 = arrival.format(format);
            System.out.printf("ARRIVING:  %s (%s)%n", out1, arrivingZone);
        } catch (DateTimeException exc) {
            System.out.printf("%s can't be formatted!%n", arrival);
            throw exc;
        }

        long duration = Duration.between(departure, arrival).toMinutes();

        System.out.println("Flight duration from Sydney to Los-Angeles is " + TimeUnit.MINUTES.toHours(duration) + " hours " + duration % 60 + " minutes");

    }
}
