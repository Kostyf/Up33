package Shape;

public class Square extends Rectangle {

    public Square() {
        width = 100;
        length = 50 ;
    }

    public Square(double s, double l){
        side = s;
        length = l;
    }

    public Square(double w, double l, String c, boolean f){
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
    public double getArea(){}

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getPerimeter;
    public String toString;
}
