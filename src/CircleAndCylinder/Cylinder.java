package CircleAndCylinder;

/**
 * Created by admin on 22.08.2017.
 */
public class Cylinder extends Circle{

    private double _height = 1.0;

    Cylinder(){
        super();
    }
    Cylinder( double radius){ super(radius);}
    Cylinder( double radius, double height){
        super(radius);
        _height = height;}

    Cylinder(double radius, double height, String color){
        super(radius, color);
        _height = height;
    }

    public double getHeight(){ return _height;}

    public void setHeight(double height){_height= height;}

    public double Volume(){ return getArea() *_height;}

}
