package PointAndMovablePoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 24.08.2017.
 */
public class PointTest {

    @Test
    public void PointDefaultGetXGetYGetXYTest(){

        Point pkt = new Point();

        Assert.assertEquals(0.0, pkt.getX(), 0.01);
        Assert.assertEquals(0.0, pkt.getY(), 0.01);
        Assert.assertArrayEquals(new float[]{0.0f, 0.0f}, pkt.getXY(), 0.0f );}

    @Test
    public void PointDefaultSetXSetYSetXYTest(){

        Point pkt = new Point();

        pkt.setX(51.8f);
        Assert.assertEquals(51.8, pkt.getX(), 0.01f);
        pkt.setY(5.8f);
        Assert.assertEquals(5.8, pkt.getY(), 0.01f);
        pkt.setXY(5.8f, 6.4f);
        Assert.assertArrayEquals(new float[]{5.8f, 6.4f}, pkt.getXY(), 0.0f );}

    @Test
    public void PointToStringTest(){

        Point pkt = new Point();

        Assert.assertEquals("(x = 0,000000 ,y = 0,000000 )", pkt.toString());}
}
