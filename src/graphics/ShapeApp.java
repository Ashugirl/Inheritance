package graphics;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12,15, 45,65);
        Circle circle = new Circle(35, 15, 28);
        Triangle triangle = new Triangle(69,75,85, 7,9);
        Square square = new Square(50,15,16);
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(25,39,58,1,2);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " +circle.getArea());
        System.out.println("Triangel perimeter: " +triangle.getPerimeter());
        System.out.println("Square perimeter: " +square.getPerimeter());
        System.out.println("Number of shapes: " + Shape.getCount());
        System.out.println("Number of triangles: " +Triangle.getCount());
        System.out.println("Number of squares: " + Square.getCount());
    }
        }
