package ch1_3.shapes;

public abstract class Shape {
    public abstract double area();

    @Override
    public String toString() {
        return "Area: " + area();
    }
}
