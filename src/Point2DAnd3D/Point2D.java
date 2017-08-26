package Point2DAnd3D;

/**
 * Created by admin on 22.08.2017.
 */
public class Point2D {
    private float _x = 0.0f;
    private float _y = 0.0f;

     Point2D(float x, float y){
        _x = x;
        _y = y;}

    Point2D(){}

    public float getX(){ return _x;}
    public void setX(float x){ _x = x;}

    public float getY(){ return _y;}
    public void setY(float y){ _y = y;}

    public float[] getXY(){ return new float[]{_x, _y};}
    public void setXY(float x, float y){{_x = x; _y = y; }}

    public String toString() {
        return String.format("(x = %f ,y = %f )",_x , _y);
    }
}
