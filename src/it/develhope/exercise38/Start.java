package it.develhope.exercise38;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        ZonedDateTime today1 = ZonedDateTime.now();

        System.out.println("Date and time Not Formatted : " + today);


        System.out.println("Date and time Formatted : " + today.format(DateTimeFormatter.ofPattern("dd-MMMM-YY HH:mm")));

        System.out.println("Date and time in ISO : " + today1.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
