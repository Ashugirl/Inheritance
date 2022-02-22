package graphics;

public class SquareApp {

    public static void main(String[] args) {

        Square square = new Square();

        square.setSide(-55);

        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println(square.getHeight());
        System.out.println(square.getWidth());
        //System.out.println(square.getHeight());
        //System.out.println(square.getWidth());
        square.setPosition(12, 14);
        System.out.println("The location of the square is: "+ square.getX() + square.getY());
    }
}
