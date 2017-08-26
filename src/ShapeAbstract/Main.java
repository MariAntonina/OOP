package ShapeAbstract;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape("yellow", true);
//        System.out.println(shape);
        Circle circle = new Circle(2.5, "green", true);
        System.out.println(circle);
        Rectangle rec = new Rectangle(2.0, 4.0,
                "pink", false);
        System.out.println(rec);

        Square sq = new Square();
        System.out.println(sq);
    }
}
