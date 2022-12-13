import java.util.Scanner;
public class Exercise{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

String subject;
int num1,num2;
System.out.println("enter subject, num1,num2");
subject = sc.nextLine();
num1 = sc.nextInt();
num2 = sc.nextInt();
System.out.printf("suject is %s \n num1 is %d \n num2 is %d",subject,num1,num2);
}
}