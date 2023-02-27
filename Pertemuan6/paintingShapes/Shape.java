public abstract class Shape {
    private String shapeName;

    public abstract double area();

    public Shape(String SN){
        shapeName = SN;
    }

    public String toString(){
        return "Name of Shape : " + shapeName;
    }
}
