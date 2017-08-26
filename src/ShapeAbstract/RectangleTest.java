package ShapeAbstract;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void rectangleDefaultGetWidthGetLengthTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.getLength(), 0.01);
        Assert.assertEquals(1.0, rectangle.getWidth(), 0.01);
    }

    @Test
    public void rectangleDefaultSetWidthSetLengthTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2.0);
        rectangle.setWidth(3.0);
        Assert.assertEquals(2.0, rectangle.getLength(), 0.01);
        Assert.assertEquals(3.0, rectangle.getWidth(), 0.01);
    }

    @Test
    public void rectangleDefaultGetAreaTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.getArea(), 0.01);
    }

    @Test
    public void rectangleDefaultGetPerimeterTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(4.0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    public void rectangleDefaultToStringTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals("A Rectangle with width=1.0 and length=1.0 which is a subclass of A Shape with color of red and filled",
                rectangle.toString());
    }
}
