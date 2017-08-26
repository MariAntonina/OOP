package Shape;

/**
 * Created by admin on 22.08.2017.
 */
public class Square extends Rectangle {
    public Square(){}
    public Square(double side){ super(side,side);}
    public Square(double side, String color, boolean filled){
        super(side, side, color,true);
    }
    public double getSide(){ return getLength();}
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Square with side = ")
                .append(getSide())
                .append(" whitch is a subclass of ")
                .append(super.toString());
        return sb.toString();

    }

}
