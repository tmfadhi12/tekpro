public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        setWidth(width);
        setLength(length);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width+length);
    }

    public String toString(){
        return "A rectangle with width = " + width + " and length = " + length + " Which is subclass of " + super.toString();
    }
}
