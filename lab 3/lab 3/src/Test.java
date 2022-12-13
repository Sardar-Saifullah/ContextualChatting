import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeBook b1= new GradeBook();
        System.out.println("enter course name");
        b1.courseName = sc.nextLine();
        b1.displayMsg();
        
       
    }
}
