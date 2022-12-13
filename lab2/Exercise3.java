import java.util.Scanner;
public class Exercise3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


int radius;
System.out.println("enter radius");
radius = sc.nextInt();

System.out.printf("diameter is %.2f \n",2.0*radius);
System.out.printf("circumference is %.2f \n",2*Math.PI*radius);


System.out.printf("area is %.2f \n",Math.PI*(radius*radius));




}
}