package graphics;

public class Circle extends Shape{
    //class variables
    public final static double PI = Math.PI;

    private int radius;


    //constructors


    public Circle(){ this(0, 0, 0);

    }
    public Circle(int radius){

    }

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setPosition(x, y);

    }
    //getters and setters

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = Math.abs(radius);
    }





    public void grow(int z){
        this.radius = (radius + z);
    }

    public double getArea(){
        return PI * (radius*radius);
    }

    public double getPerimeter(){
        return (double) 2 * (PI * radius);
    }
}

