package Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 100;
        length = 50 ;
    }

    public Rectangle(double w, double l){
        width = w;
        length = l;
    }

    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled =  f;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getPerimeter;
    public String toString;
}
