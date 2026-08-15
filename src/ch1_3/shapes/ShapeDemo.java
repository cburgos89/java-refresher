package ch1_3.shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(40.45),
                new Square(45.6),
                new Circle(5.567)
        };

        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
    }
}
