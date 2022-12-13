import java.util.Scanner;
public class Exercise2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);


int num1,num2;
System.out.println("enter num1,num2");
num1 = sc.nextInt();
num2 = sc.nextInt();
System.out.println("numbers before swaping are");
System.out.println("num1 is"+num1+"num2 is"+num2);
int num3;
num3  = num1;
num1= num2;
num2=num3;
System.out.println("numbers after swaping are");
System.out.println("num1 is"+num1+"num2 is"+num2);



}
}