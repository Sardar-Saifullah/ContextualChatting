public class testex2 {
    public static void main(String[] args) {
          Shape s = new Shape("red");
        Shape s1 = new Rectangle(10,10,"green");
        Shape s2 = new Triangle(10,10,"blue");
        
          Shape[] arr = new Shape[3];
          arr[0]= s;
          arr[1]= s1;
          arr[2]= s2;
         
          for(Shape i:arr){
              System.out.println(i);
                   i.getArea();
          }
       
    }
 
}
