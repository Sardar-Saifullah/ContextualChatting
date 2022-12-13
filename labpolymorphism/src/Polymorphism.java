
public class Polymorphism {
    public static void main(String[] arg){
        Shape s=new Shape("green");
        Shape s1=new Rectangle("green",2,5);
        Shape s2=new Triangle("yellow",2,5);
        
        Shape[] shape=new Shape[3];
        shape[0]=s;
        shape[1]=s1;
        shape[2]=s2;
        for(int i =0;i<shape.length;i++){
            if(i==1){
                Rectangle r =(Rectangle)shape[i];
                r.perimeter();
            }
        }
      
    }
    public static void showArea(Shape obj){
         System.out.println("Area is " + obj.getArea());
    }
}