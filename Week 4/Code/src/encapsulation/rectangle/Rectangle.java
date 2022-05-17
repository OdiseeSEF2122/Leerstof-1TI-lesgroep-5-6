package encapsulation.rectangle;

public class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle(final double width, final double length){
        this.length = length;
        this.width = width;
        calculateArea();
    }

    public double getArea(){
        return area;
    }

    private void calculateArea(){
        area = length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        calculateArea();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        calculateArea();
    }
}
