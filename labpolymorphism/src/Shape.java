
  public class Shape {
     private String color;
    
    public Shape(String color){
        this.color=color;
    }
    
    public double getArea(){
        System.err.println("Shape Unknown! Cannot compute area");
        return 0;
    }
    
    public String toString(){
        return "Shape[color="+color+"]";
    }  
}  
  
