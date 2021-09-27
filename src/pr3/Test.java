package pr3;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast (Circle to Shape)
        // println по умолчанию вызывает у объекта метод toString
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println();

        Circle c1 = (Circle)s1; // Downcast (Shape to Circle)
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println();

//        Shape s2 = new Shape(); - не будет работать т.к. класс Shape - абстрактный и 2 метода в нём не определены

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println();

        Rectangle r1 = (Rectangle)s3; // Downcast (Shape to rectangle)
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println();

        Shape s4 = new Square(6.6); // Upcast (Square to Shape)
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); - не будет работать т.к. мы выполнили нисходящее преобразование,
//        этого метода у Shape нету
        System.out.println();

        Rectangle r2 = (Rectangle)s4; // Downcast Shape to Rectangle, но по факту Upcast Square to Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); - не будет работать т.к. мы выполнили восходящее преобразование,
//        этого метода у Rectangle нету
        System.out.println(r2.getLength());
        System.out.println();

        Square sq1 = (Square)r2; // Downcast (Rectangle to Square)
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
