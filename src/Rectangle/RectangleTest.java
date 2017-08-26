package Rectangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 18.08.2017.
 */
public class RectangleTest {
    @Test
    public void rectangleAreaTest(){
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.getArea(), 0.01);}

      @Test
    public void rectangleDefaultLengthTest() {
          Rectangle rectangle = new Rectangle();
          Assert.assertEquals(1.0, rectangle.get_length(), 0.1);}

    @Test
    public void rectangleDefaultWidthTest() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0, rectangle.get_width(), 0.1);}

    @Test
    public void rectangleArea2Test(){
        Rectangle rectangle = new Rectangle(5, 5);
        Assert.assertEquals(25.0, rectangle.getArea(), 0.01);}

    @Test
    public void rectangleSetLenght2Test(){
        Rectangle rectangle = new Rectangle();
        rectangle.set_length(7);
        Assert.assertEquals(7, rectangle.get_length(), 0.01);}

    @Test
    public void rectangleSetWidtht2Test(){
        Rectangle rectangle = new Rectangle();
        rectangle.set_width(8.8f);
        Assert.assertEquals(8.8, rectangle.get_width(), 0.01);}

    @Test
    public void rectangle2StringTest() {
        Rectangle rectangle = new Rectangle(5,6);
        Assert.assertEquals("Rectangle[length = 5.0,width = 6.0]", rectangle.toString());}

    @Test
    public void rectanglePerimeter2Test(){
        Rectangle rectangle = new Rectangle(5, 5);
        Assert.assertEquals(20, rectangle.getPerimeter(), 0.01);}

}
