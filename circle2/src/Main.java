public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", true);
        Circle circle = new Circle(5.0, "red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "green", false);
        Square square = new Square(3.0, "yellow", true);

        System.out.println(shape);
        System.out.println(circle);
        System.out.println("Area circulo: " + circle.getArea());
        System.out.println("Perimetro circulo: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Area rectangulo: " + rectangle.getArea());
        System.out.println("Perimetro rectangulo: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("Area cuadrado: " + square.getArea());
        System.out.println("Perimetro cuadrado: " + square.getPerimeter());
    }
}
