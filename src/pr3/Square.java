package pr3;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + width + ", color: " + color;
    }
}
