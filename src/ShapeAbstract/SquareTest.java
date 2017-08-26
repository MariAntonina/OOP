package ShapeAbstract;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest extends RectangleTest {
    @Test
    public void squareDefaultSetSideTest(){
        Square square = new Square();
        square.setSide(2.0);
        Assert.assertEquals(2.0, square.getSide(),0.01);
        Assert.assertEquals(2.0, square.getLength(),0.01);
        Assert.assertEquals(2.0, square.getWidth(),0.01);
    }

    @Test
    public void squareDefaultSetLengthTest(){
        Square square = new Square();
        square.setLength(2.0);
        Assert.assertEquals(2.0, square.getSide(),0.01);
        Assert.assertEquals(2.0, square.getLength(),0.01);
        Assert.assertEquals(2.0, square.getWidth(),0.01);
    }

    @Test
    public void squareDefaultSetWidthTest(){
        Square square = new Square();
        square.setWidth(2.0);
        Assert.assertEquals(2.0, square.getSide(),0.01);
        Assert.assertEquals(2.0, square.getLength(),0.01);
        Assert.assertEquals(2.0, square.getWidth(),0.01);
    }

    @Test
    public void squareDefaultToStringTest(){
        Square square = new Square();
        Assert.assertEquals("A Square with side=1.0 which is a subclass of A Rectangle with width=1.0 and length=1.0 which is a subclass of A Shape with color of red and filled",
                square.toString());
    }

}
