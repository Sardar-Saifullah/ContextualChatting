public class Example{
public static void main(String[] arg){
String msg="welcome to oop lab";
int a = 4;
int b = 6;
System.out.print(msg);
System.out.print(" value in a = "+ a);
System.out.print(" value in b = "+ b);
System.out.print(" value of a and b = "+ (a+b));
int c=a;
a=b;
b=c;
System.out.print(" value of a is "+ a + " and value of b is "+ b);

}
}