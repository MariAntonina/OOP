package PointAndMovablePoint;

/**
 * Created by admin on 23.08.2017.
 */
public class MovablePoint extends Point {

    private float _xSpeed = 0.0f;
    private float _ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return _xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        _xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return _ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        _ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{_xSpeed, _ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        {
            _xSpeed = xSpeed;
            _ySpeed = ySpeed;
        }
    }

    public String toString() {
        return String.format("(x = %f ,y = %f ), speed = (xs %f, ys %f )"
                , super.toString(), _xSpeed, _ySpeed);
    }

    public MovablePoint move() {
      super.setX(getX()+ _xSpeed);
      super.setY(getY()+ _ySpeed);
      return this;
    }
}


