import java.util.Scanner;
public class Ex2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise2 b1= new Exercise2();
        System.out.println("enter marks");
        b1.marks = sc.nextDouble();
   b1.displayMsg();
   b1.calGrades();
       
        
    }
}
