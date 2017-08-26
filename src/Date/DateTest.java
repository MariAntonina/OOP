package Date;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 21.08.2017.
 */
public class DateTest {

    @Test
    public void DateGetDayMonthYearTest() {

        Date data = new Date(24, 8, 2014);

        Assert.assertEquals(24, data.getDay());
        Assert.assertEquals(8, data.getMonth());
        Assert.assertEquals(2014, data.getYear());
    }

    @Test
    public void DateSetDayMonthYearTest() {

        Date data = new Date(24, 8, 2014);
        data.setDate(23,7,1999);

        Assert.assertEquals(23, data.getDay());
        Assert.assertEquals(7, data.getMonth());
        Assert.assertEquals(1999, data.getYear());
    }

    @Test
    public void DateToStringTest(){

        Date data = new Date(24, 8, 2014);

        Assert.assertEquals("24/8/2014", data.toString());
    }
}
