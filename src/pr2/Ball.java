package pr2;

public class Ball {
    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Ball() {}
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    public String toString() {
        return "Ball @ (" + x + ", " + y + ").";
    }

    private double x = 0.0;
    private double y = 0.0;
}
