package Point2DAnd3D;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 24.08.2017.
 */
public class Point3DTest {
    @Test
    public void Point3DDefaultGetZGetXYZTest() {

        Point3D p3D = new Point3D();

        Assert.assertEquals(0.0, p3D.getZ(), 0.01);
        Assert.assertArrayEquals(new float[]{0.0f, 0.0f, 0.0f}, p3D.getXYZ(), 0.0f);
    }

    @Test
    public void Point3DDefaultSetZSetXYZTest() {

        Point3D p3D = new Point3D();

        p3D.setZ(5.8f);
        Assert.assertEquals(5.8, p3D.getZ(), 0.01);
        p3D.setXYZ(5.8f, 6.4f, 1.9f);
        Assert.assertArrayEquals(new float[]{5.8f, 6.4f, 1.9f}, p3D.getXYZ(), 0.0f);
    }

    @Test
    public void Point3DToStringTest() {

        Point3D p3D = new Point3D();

        Assert.assertEquals("(x = 0,000000 , y = 0,000000, z = 0,000000 )", p3D.toString());}
}
