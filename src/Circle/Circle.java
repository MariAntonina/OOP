package Circle;

public class Circle {
    private double _radius = 1.0;
    private String _color = "red";

    public Circle(){}
    public Circle(double r){
        _radius = r;
    }
    public Circle(double r, String color){
        _radius = r;
        _color = color;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius){
        _radius = radius;
    }

    public String getColor(){
        return _color;
    }

    public void setColor(String color){
        _color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius, 2d);
    }

    public double Circumference(){ return 2*Math.PI*_radius;}

    public String toString(){
        return "Circle[radius = " + _radius +
                ",color = " + _color + "]";
    }

}
