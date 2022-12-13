
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return  super.toString()+"\n circumference of circle is "+circumference();
    }
    
}
