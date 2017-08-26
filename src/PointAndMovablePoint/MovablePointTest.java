package PointAndMovablePoint;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 25.08.2017.
 */
public class MovablePointTest {

    @Test
    public void MovablePointDefaultGetXSpeedGetYSpeedGetSpeedTest() {

        MovablePoint movpkt = new MovablePoint();

        Assert.assertEquals(0.0, movpkt.getXSpeed(), 0.01);
        Assert.assertEquals(0.0, movpkt.getYSpeed(), 0.01);
        Assert.assertArrayEquals(new float[]{0.0f, 0.0f}, movpkt.getSpeed(), 0.0f );}

    @Test
    public void MovablePointDefaultSetXSpeedSetYSpeedSetSpeedTest(){

        MovablePoint movpkt = new MovablePoint();

        movpkt.setXSpeed(51.8f);
        Assert.assertEquals(51.8, movpkt.getXSpeed(), 0.01f);
        movpkt.setYSpeed(5.8f);
        Assert.assertEquals(5.8, movpkt.getYSpeed(), 0.01f);
        movpkt.setSpeed(5.8f, 6.4f);
        Assert.assertArrayEquals(new float[]{5.8f, 6.4f}, movpkt.getSpeed(), 0.0f );}

    @Test
    public void MovablePointToStringTest(){

        MovablePoint movpkt = new MovablePoint();

        Assert.assertEquals("(x = 0,0 ,y = 0,0 ), speed = (xs 0,0, ys 0,0)", movpkt.toString());}

    @Test
    public void MovablePointMove(){
        MovablePoint movpkt = new MovablePoint();

//        movpkt.move(movpkt.setX(movpkt.getX() + movpkt.setXSpeed());
        Assert.assertEquals(0.0, movpkt.getX(), 0.01f);
        Assert.assertEquals(0.0, movpkt.getY(), 0.01f);}
}
