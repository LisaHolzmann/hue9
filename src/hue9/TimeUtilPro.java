package hue9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class TimeUtilPro {

    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    public static LocalDate intToLocalDate(int date) {
        String datum = Integer.toString(date);
        //Endindex immer um 1 mehr weil sonst nimmt es die letzte stelle nicht
        int year = Integer.parseInt(datum.substring(0, 4));
        int month = Integer.parseInt(datum.substring(4, 6));
        int day = Integer.parseInt(datum.substring(6, 8));

        if ((month > 0) && (month < 13) && (day > 0) && (day < 32)) {
            if ((month > 0) && (month < 13) && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && (day > 0) && (day <= 31)) {
                if ((month == 2) && (day < 28)) {
                    return LocalDate.of(year, month, day);
                }
                return LocalDate.of(year, month, day);
            }
            return LocalDate.of(year, month, day);
        } else {
            System.out.println("Ungültiges Datum");
            return null;
        }
        // return null;

    }

    public static LocalDate longToLocalDate(long dateTime) {
        String datum = Long.toString(dateTime);
        int year = Integer.parseInt(datum.substring(0, 4));
        int month = Integer.parseInt(datum.substring(4, 6));
        int day = Integer.parseInt(datum.substring(6, 8));
        int hours = Integer.parseInt(datum.substring(8, 10));
        int min = Integer.parseInt(datum.substring(6, 8));

        if ((hours > 0) && (hours <= 24) && (min > -1) && (min < 61)) {
            if ((month > 0) && (month < 13) && (day > 0) && (day < 32)) {
                if ((month > 0) && (month < 13) && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && (day > 0) && (day <= 31)) {
                    if ((month == 2) && (day < 28)) {
                        return LocalDate.of(year, month, day);
                    }
                    return LocalDate.of(year, month, day);
                }
                return LocalDate.of(year, month, day);
            } else {
                System.out.println("Ungültiges Datum");
                return null;
            }
        }
        return null;
    }

    public static LocalDate dateToLocalDate(Date dateTime) {
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    // ########## LOCALDATETIME METHODS ##########
    public static LocalDateTime intToLocalDateTime(int date) {
        return null;
    }

    public static LocalDateTime longToLocalDateTime(long dateTime) {
        return null;
    }

    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return null;
    }

    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return null;
    }

    // ########## INT METHODS ##########
    public static int localDateToInt(LocalDate date) {
        return -1;
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        return -1;
    }

    // ########## LONG METHODS ##########
    public static long localDateToLong(LocalDate date) {
        return -1L;
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        return -1L;
    }

    // ########## DATE METHODS ##########
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return null;
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return null;
    }

    // ########## CALENDAR METHODS ##########
    public static Calendar localDateToCalendar(LocalDate date) {
        return null;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        return null;
    }

}
