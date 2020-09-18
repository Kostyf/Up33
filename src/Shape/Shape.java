package Shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "Blue";
        filled = true ;
    }

    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }

    public String getColor(){
        return color;
    }
    public void getColor(String color){
        this.color = color;
    }
    public boolean isFilled(){

    }
    public void setFilled(boolean filled){
        this.color = color;
    }

    public double getArea(){}
    public double getPerimeter;
    public String toString;

    public abstract double getPerimeter();
}
