
public class Book1 {
    private double marks;

    private Book1(double marks) {
        this.marks = marks;
    }
   
    public static Book1[] CreateObject(){
        int[] marks ={50,60,70,80,90};
        Book1 b1 = new Book1(marks);
        Book1 b2 = new Book1(marks);
        Book1 [] obj = new Book1[2];
        obj[0]=b1;
         obj[1]=b2;
        return obj;
    }
    
}
