package Shape;

/**
 * Created by admin on 22.08.2017.
 */
public class Shape {
    private String _color = "red";
    private boolean _filled = true;

    public Shape(){}
    public Shape(String color, boolean filled){
        _color = color;
        _filled = filled;
    }

    public String getColor(){ return _color;}
    public void setColor(String color){ _color = color;}

    public boolean isFilled(){return _filled;}
    public void setIsFilled(boolean filled){_filled = filled;}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Shape with color of ").append(_color). append(" and ");
        if(_filled){
            sb.append("filled");
        }else{
            sb.append("not filled");
        }
        return sb.toString();
    }



}
