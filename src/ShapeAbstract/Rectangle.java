package ShapeAbstract;

public class Rectangle extends Shape{
    protected double _width = 1.0;
    protected double _length = 1.0;

    public Rectangle() {}
    public Rectangle(double width, double length){
        _width = width;
        _length = length;
    }

    public Rectangle(double width, double length,
                     String color, boolean filled){
        super(color, filled);
        _width = width;
        _length = length;
    }

    public double getWidth() { return _width; }
    public void setWidth(double width) { _width = width; }
    public double getLength() { return  _length; }
    public void setLength(double length) { _length = length; }

    @Override
    public double getArea() { return _length * _width; }
    @Override
    public double getPerimeter() {return 2*_length + 2* _width; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with width=")
                .append(_width)
                .append(" and length=")
                .append(_length)
                .append(" which is a subclass of ")
                .append(super.toString());

        return sb.toString();
    }
}
