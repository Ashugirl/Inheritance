package graphics;

public class Triangle extends Shape{

    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle(){
        this(0,0,0,0,0);

    }

    public Triangle(int width, int height, int perpendicular){
        this(width, height, perpendicular, 0,0);

    }

    public Triangle(int width, int height, int perpendicular, int x, int y){
        super(x,y);
        setWidth(width);
        setPosition(height);
        setPerpendicular(perpendicular);

    }

    public Triangle(Triangle triangle){

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getPerpendicular(){
        return perpendicular
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    public static int getCount(){
        return count;
    }
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
