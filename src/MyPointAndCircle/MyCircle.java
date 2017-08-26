package MyPointAndCircle;

/**
 * Created by admin on 21.08.2017.
 */
public class MyCircle {

    private MyPoint _center = new MyPoint(0,0);
    private int _radius = 1;

    public MyCircle(){}
    public MyCircle(int x, int y, int radius){
        _radius = radius;
        _center = new MyPoint(x,y);

    }

    public MyCircle(MyPoint center, int radius){
        _center = center;
        _radius = radius;
    }

    public MyPoint getCenter() {
        return _center;
    }

    public void setCenter(MyPoint center) {
        _center = center;
    }

    public int getRadius() {
        return _radius;
    }

    public void setRadius(int radius) {
        _radius = radius;
    }

    public int  getCenterX(){ return  _center.getX(); }

    public void setCenterX(int x) { _center.setX(x);}



    public double getArea(){
        return Math.PI*Math.pow(_radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*_radius;
    }
    public double distnaceMyCircle( MyCircle another){
        return (new MyPoint()).distance(another);
    }
}
