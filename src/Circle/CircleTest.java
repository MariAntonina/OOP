package Circle;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 18.08.2017.
 */
public class CircleTest {

    @Test
    public void circleAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(2.0, circle.getArea(), 0.01);
    }

    @Test
    public void circleDefaultRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);

    }
    @Test
    public void circleArea2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);

    }
    @Test
    public void circleRadius2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);

    }
    @Test
    public void circleRadius2StringTest() {
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle[radius = 2.0,color = red]", circle.toString());
    }
    @Test
    public void circleRadius2GetColorTest() {
        Circle circle = new Circle();
        Assert.assertEquals("red", circle.getColor());
    }
    @Test
    public void circleRadius2SetColorTest() {
        Circle circle = new Circle();
        circle.setColor("blue");
        Assert.assertEquals("blue",circle.getColor());
    }
    @Test
    public void circleRadius2SetRadiusTest() {
        Circle circle = new Circle();
        circle.setRadius(5.5);
        Assert.assertEquals(5.5,circle.getRadius(),0.01);
    }
}
