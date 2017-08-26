package Point2DAnd3D;

import Point2DAnd3D.Point2D;

/**
 * Created by admin on 22.08.2017.
 */
public class Point3D extends Point2D {

    private float _z = 0.0f;

    Point3D(float x, float y, float z){ super(x,y); _z = z;}
    Point3D(){}

    public float getZ(){return _z ;}
    public void setZ(float z){_z = z;}


    public float[] getXYZ() {return new float[]{getX(), getY(), _z};}
    public void setXYZ(float x, float y, float z) {{setX(x); setY(y); _z = z;}}

    public String toString() {
        return String.format("(x = %f , y = %f, z = %f )", getX(), getY(), _z);
    }
}
