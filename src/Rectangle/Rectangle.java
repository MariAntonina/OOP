package Rectangle;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by admin on 18.08.2017.
 */
public class Rectangle {
    private float _length = 1.0f;
    private float _width = 1.0f;

    public Rectangle(){}
    public Rectangle(float len, float wid){
        _length = len;
        _width = wid;
    }

    public float get_length() {
        return _length;
    }

    public void set_length(float len) {
        _length = len;
    }

    public float get_width() {
        return _width;
    }

    public void set_width(float wid) {
        _width = wid;
    }

    public double getArea(){
        return _length*_width;
    }
    public double getPerimeter(){
        return (_length+ _width)*2;
    }
    public String toString(){
        return "Rectangle[length = " + _length +
                ",width = " + _width + "]";
    }

}
