import java.util.Scanner;
public class example2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter radius to find area and circumference");
    float pi=3.14f;
    float radius = sc.nextFloat();
    float cf = 2 * pi * radius;
    float area = pi*(radius*radius);
    System.out.println("area is" + area);
        System.out.println("circumference  is"+cf);

    
    
            }   
}
