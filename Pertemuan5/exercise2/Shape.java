public class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, Boolean filled){
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + color + " filled = " + filled;
    }
}
