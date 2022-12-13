
public class test1 {
    public static void main(String[] args) {
        Shape s = new Shape("red");
        Shape s1 = new Rectangle(10,10,"green");
        Shape s2 = new Triangle(10,10,"blue");
         Shape s3 = new Circle(10.4,"blue");
          Shape[] arr = new Shape[4];
          arr[0]= s;
          arr[1]= s1;
          arr[2]= s2;
           arr[3]= s3;
          for(Shape i:arr){
              System.out.println(i);
               showArea(i);
            if(i instanceof Circle){
                Circle c=(Circle)i;
                System.out.println("circumference is " + c.circumference());
            }
        }
    }
    private static void showArea(Shape obj) {
         System.out.println("Area is " + obj.getArea());
    }
   
}
                
    
 

