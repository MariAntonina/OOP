package Point2DAnd3D;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 23.08.2017.
 */
public class Point2DTest {

    @Test
    public void Point2DDefaultGetXGetYGetXYTest(){

        Point2D p2D = new Point2D();

        Assert.assertEquals(0.0, p2D.getX(), 0.01);
        Assert.assertEquals(0.0, p2D.getY(), 0.01);
        Assert.assertArrayEquals(new float[]{0.0f, 0.0f}, p2D.getXY(), 0.0f );}

    @Test
    public void Point2DDefaultSetXSetYSetXYTest(){

        Point2D p2D = new Point2D();

        p2D.setX(5.8f);
        Assert.assertEquals(5.8, p2D.getX(), 0.01);
        p2D.setY(5.8f);
        Assert.assertEquals(5.8, p2D.getX(), 0.01);
        p2D.setXY(5.8f, 6.4f);
        Assert.assertArrayEquals(new float[]{5.8f, 6.4f}, p2D.getXY(), 0.0f );}

    @Test
    public void Point2DToStringTest(){

        Point2D p2D = new Point2D();

        Assert.assertEquals("(x = 0,000000 ,y = 0,000000 )", p2D.toString());}

}
