public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(String color, Boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
    }

    public String toString(){
        return "A square with side = " + getSide() + " which is subclass of " + super.toString();
    }
}
