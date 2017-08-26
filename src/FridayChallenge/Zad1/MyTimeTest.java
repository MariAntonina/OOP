package FridayChallenge.Zad1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 25.08.2017.
 */
public class MyTimeTest {


    @Test
    public void MyTimeDefaultGetHourGetMinuteGetSecoundTest(){

        MyTime czas = new MyTime();

        Assert.assertEquals(0, czas.getHour());
        Assert.assertEquals(0, czas.getMinute());
        Assert.assertEquals(0, czas.getSecond());}

    @Test
    public void MyTimeGetHourGetMinuteGetSecoundTest(){

        MyTime czas = new MyTime(3,56,10);

        Assert.assertEquals(3, czas.getHour());
        Assert.assertEquals(56, czas.getMinute());
        Assert.assertEquals(10, czas.getSecond());}

    @Test
    public void MyTimeGetHourGetMinutGetSecondNotAllowTest(){

        MyTime czas = new MyTime(24,67,-10);

        Assert.assertNotEquals(24, czas.getHour());
        Assert.assertNotEquals(67, czas.getMinute());
        Assert.assertNotEquals(-10, czas.getSecond());}

    @Test
    public void MyTimeSetHourSetMinuteSetSecoundTest(){

        MyTime czas = new MyTime(22,6,10);

        czas.setHour(8);
        Assert.assertEquals(8, czas.getHour());

        czas.setMinute(12);
        Assert.assertEquals(12, czas.getMinute());

        czas.setSecond(43);
        Assert.assertEquals(43, czas.getSecond());}

    @Test
    public void MyTimeToStringTest(){

        MyTime czas = new MyTime(22,46,10);

        Assert.assertEquals("22:46:10", czas.toString());}

    @Test
    public void MyTimeZeroToStringTest(){

        MyTime czas = new MyTime(02,06,05);

        Assert.assertEquals("02:06:05", czas.toString());}

    @Test
    public void MyTimeNextSecoundTest(){

        MyTime czas = new MyTime(22,46,10);
        czas.nextSecond();
        Assert.assertEquals(11, czas.getSecond());}

    @Test
    public void MyTimePreviousSecoundTest(){

        MyTime czas = new MyTime(22,46,10);
        czas.previousSecond();
        Assert.assertEquals(9, czas.getSecond());}


    @Test
    public void MyTimeNextMinuteTest(){

        MyTime czas = new MyTime(22,46,10);
        czas.nextMinute();
        Assert.assertEquals(47, czas.getMinute());}

    @Test
    public void MyTimePreviousMinuteTest(){

        MyTime czas = new MyTime(22,46,10);
        czas.previousMinute();
        Assert.assertEquals(45, czas.getMinute());}

    @Test
    public void MyTimeNextHourTest(){

        MyTime czas = new MyTime(22,46,10);
        czas.nextHour();
        Assert.assertEquals(23, czas.getHour());}


    @Test
    public void MyTimeNext2HourTest(){

        MyTime czas = new MyTime(27,46,10);
        czas.nextHour();
        Assert.assertEquals(1, czas.getHour());}

    @Test
    public void MyTimeNext3HourTest(){

        MyTime czas = new MyTime(23,46,10);
        czas.nextHour();
        Assert.assertEquals(0, czas.getHour());}

    @Test
    public void MyTimePreviousHourTest(){

        MyTime czas = new MyTime(22,46,10);
        czas.previousHour();
        Assert.assertEquals(21, czas.getHour());}

    @Test
    public void MyTimePrevious2HourTest(){

        MyTime czas = new MyTime(22,00,00);
        czas.previousSecond();
        Assert.assertEquals(21, czas.getHour());
        Assert.assertEquals(59, czas.getMinute());
        Assert.assertEquals(59, czas.getSecond());}

    @Test
    public void MyTimePrevious3HourTest(){

        MyTime czas = new MyTime(23,46,00);
        czas.previousSecond();
        Assert.assertEquals(23, czas.getHour());
        Assert.assertEquals(45, czas.getMinute());
        Assert.assertEquals(59, czas.getSecond());
    }

    @Test
    public void MyTimeToString(){

        MyTime czas = new MyTime(23,46,10);
        Assert.assertEquals("23:46:10", czas.toString());}

    @Test
    public void MyTimeNextSecound(){
        MyTime czas = new MyTime(23,59,59);
        czas.nextSecond();
        Assert.assertEquals("00:00:00", czas.toString());}

    @Test
    public void MyTimeNextSecound2(){
        MyTime czas = new MyTime(23,59,60);
        czas.nextSecond();
        Assert.assertEquals("23:59:01", czas.toString());}

    @Test
    public void TimeToStringTest(){

        MyTime czas = new MyTime(1,4,5);

        Assert.assertEquals("01:04:05", czas.toString());}

    @Test
    public void TimeToString2Test(){

        MyTime czas = new MyTime(13,42,54);

        Assert.assertEquals("13:42:54", czas.toString());}
}
