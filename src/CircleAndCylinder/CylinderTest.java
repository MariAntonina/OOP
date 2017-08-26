package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 22.08.2017.
 */
public class CylinderTest {
    @Test
    public void cylinderTest(){
        Cylinder cyl = new Cylinder(1.0, 1.0 );
        Assert.assertEquals(1.0,cyl.getRadius(),0.01);
    }

    @Test
    public void cylinderHeightTest(){
        Cylinder cyl = new Cylinder(1.0, 1.0);
        Assert.assertEquals(1.0,cyl.getHeight(),0.01);
    }
    @Test
    public void cylinderRedTest(){
        Cylinder cyl = new Cylinder(1.0, 1.0, "red" );
        Assert.assertEquals("red",cyl.getColor());
    }
    @Test
    public void cylinderGetHeightTest(){
        Cylinder cyl = new Cylinder();
        Assert.assertEquals(1.0,cyl.getHeight(),0.01);
    }
    @Test
    public void cylinderSetHeightTest(){
        Cylinder cyl = new Cylinder();
        cyl.setHeight(6);
        Assert.assertEquals(6.0,cyl.getHeight(),0.01);
    }
    @Test
    public void cylindergetVolumeTest(){
        Cylinder cyl = new Cylinder();
        Assert.assertEquals(3.14,cyl.Volume(),0.01);
    }
}
