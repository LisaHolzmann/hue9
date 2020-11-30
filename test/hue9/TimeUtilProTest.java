/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author holzm
 */
public class TimeUtilProTest {

    public TimeUtilProTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of intToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDate() {
        System.out.println("intToLocalDate");
        int date = 20030201;
        LocalDate expResult = LocalDate.of(2003, 02, 01);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);

    }

    // Monat falsch
    @Test
    public void testIntToLocalDate2() {
        System.out.println("intToLocalDate");
        int date = 20031501;
        LocalDate expResult = LocalDate.of(2003, 15, 01);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);

    }

    //Tag falsch
    @Test
    public void testIntToLocalDate3() {
        System.out.println("intToLocalDate");
        int date = 20031234;
        LocalDate expResult = LocalDate.of(2003, 12, 34);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);

    }

    //beides falsch
    @Test
    public void testIntToLocalDate4() {
        System.out.println("intToLocalDate");
        int date = 20031534;
        LocalDate expResult = LocalDate.of(2003, 15, 34);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of longToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDate() {
        System.out.println("longToLocalDate");
        long dateTime = 200302011234L;
        LocalDate expResult = LocalDate.of(2003, 02, 01).atTime(12, 34).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Monat falsch
    @Test
    public void testLongToLocalDate2() {
        System.out.println("longToLocalDate");
        long dateTime = 200302201234L;
        LocalDate expResult = LocalDate.of(2003, 16, 01).atTime(12, 34).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Tag falsch
    @Test
    public void testLongToLocalDate3() {
        System.out.println("longToLocalDate");
        long dateTime = 200302201234L;
        LocalDate expResult = LocalDate.of(2003, 02, 36).atTime(12, 34).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Beides falsch
    @Test
    public void testLongToLocalDate4() {
        System.out.println("longToLocalDate");
        long dateTime = 200302201234L;
        LocalDate expResult = LocalDate.of(2003, 16, 36).atTime(12, 34).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Stunden falsch
    @Test
    public void testLongToLocalDate5() {
        System.out.println("longToLocalDate");
        long dateTime = 200302011234L;
        LocalDate expResult = LocalDate.of(2003, 02, 01).atTime(34, 34).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Minuten falsch
    @Test
    public void testLongToLocalDate6() {
        System.out.println("longToLocalDate");
        long dateTime = 200302011234L;
        LocalDate expResult = LocalDate.of(2003, 02, 01).atTime(12, 70).toLocalDate();
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of dateToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDate() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(103, 2, 23);
        LocalDate expResult = LocalDate.of(2003, 03, 23);
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Falsches Monat
    @Test
    public void testDateToLocalDate2() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(103, 16, 23);
        LocalDate expResult = LocalDate.of(2003, 17, 23);
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Falscher Tag
    @Test
    public void testDateToLocalDate3() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(103, 2, 40);
        LocalDate expResult = LocalDate.of(2003, 03, 40);
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Beides falsch
    @Test
    public void testDateToLocalDate4() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(103, 16, 40);
        LocalDate expResult = LocalDate.of(2003, 17, 40);
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of calendarToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDate() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = new GregorianCalendar(2003, 2, 13);
        LocalDate expResult = LocalDate.of(2003, 3, 13);
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Falsches Monat
    @Test
    public void testCalendarToLocalDate2() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = new GregorianCalendar(2003, 15, 13);
        LocalDate expResult = LocalDate.of(2003, 16, 13);
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Falscher Tag
    @Test
    public void testCalendarToLocalDate3() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = new GregorianCalendar(2003, 2, 36);
        LocalDate expResult = LocalDate.of(2003, 3, 36);
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    //Beides falsch
    @Test
    public void testCalendarToLocalDate4() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = new GregorianCalendar(2003, 20, 36);
        LocalDate expResult = LocalDate.of(2003, 21, 36);
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of intToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDateTime() {
        System.out.println("intToLocalDateTime");
        int date = 0;
        LocalDateTime expResult = null;
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDateTime() {
        System.out.println("longToLocalDateTime");
        long dateTime = 0L;
        LocalDateTime expResult = null;
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date dateTime = null;
        LocalDateTime expResult = null;
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calendarToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDateTime() {
        System.out.println("calendarToLocalDateTime");
        Calendar dateTime = null;
        LocalDateTime expResult = null;
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToInt() {
        System.out.println("localDateToInt");
        LocalDate date = null;
        int expResult = 0;
        int result = TimeUtilPro.localDateToInt(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToInt() {
        System.out.println("localDateTimeToInt");
        LocalDateTime dateTime = null;
        int expResult = 0;
        int result = TimeUtilPro.localDateTimeToInt(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong() {
        System.out.println("localDateToLong");
        LocalDate date = null;
        long expResult = 0L;
        long result = TimeUtilPro.localDateToLong(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong() {
        System.out.println("localDateTimeToLong");
        LocalDateTime dateTime = null;
        long expResult = 0L;
        long result = TimeUtilPro.localDateTimeToLong(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate() {
        System.out.println("localDateToDate");
        LocalDate date = null;
        Date expResult = null;
        Date result = TimeUtilPro.localDateToDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        LocalDateTime dateTime = null;
        Date expResult = null;
        Date result = TimeUtilPro.localDateTimeToDate(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToCalendar() {
        System.out.println("localDateToCalendar");
        LocalDate date = null;
        Calendar expResult = null;
        Calendar result = TimeUtilPro.localDateToCalendar(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToCalendar() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime dateTime = null;
        Calendar expResult = null;
        Calendar result = TimeUtilPro.localDateTimeToCalendar(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
