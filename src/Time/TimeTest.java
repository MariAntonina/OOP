package Time;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 21.08.2017.
 */
public class TimeTest {

    @Test
    public void TimeDefaultGetHourGetMinuteGetSecoundTest(){

        Time czas = new Time(21,34,45);

        Assert.assertEquals(21, czas.getHour());
        Assert.assertEquals(34, czas.getMinute());
        Assert.assertEquals(45, czas.getSecond());}

    @Test
    public void timeDefaultGetHourGetMinutGetSecondNotAllowTest(){
        Time czas = new Time(25, -87, 72);

        Assert.assertNotEquals(25, czas.getHour());
        Assert.assertNotEquals(-87, czas.getMinute());
        Assert.assertNotEquals(72, czas.getSecond());}

    @Test
    public void TimeSetHourSetMinuteSetSecoundTest(){

        Time czas = new Time(21,34,45);

        czas.setHour(2);
        Assert.assertEquals(2, czas.getHour());

        czas.setMinute(32);
        Assert.assertEquals(32, czas.getMinute());

        czas.setSecond(59);
        Assert.assertEquals(59, czas.getSecond());}

    @Test
    public void TimeToStringTest(){

        Time czas = new Time(1,4,5);

        Assert.assertEquals("01:04:05", czas.toString());}

    @Test
    public void TimeToString2Test(){

        Time czas = new Time(11,42,53);

        Assert.assertEquals("11:42:53", czas.toString());}

    @Test
    public void TimeNextSecoundTest(){

        Time czas = new Time(1,34,45);
        czas.nextSecond();
        Assert.assertEquals(46, czas.getSecond());}

    @Test
    public void TimePreviousSecoundTest(){

        Time czas = new Time(1,34,45);
        czas.previousSecond();
        Assert.assertEquals(44, czas.getSecond());}
}
