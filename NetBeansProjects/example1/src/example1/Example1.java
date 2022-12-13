/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.util.Scanner;
public class Example1 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name and birth year");
        String name = sc.nextLine();
        int year = sc.nextInt();
        int age = 2022-year;
        System.out.println("welcome! ");
        System.out.println("your name is "+name);
         System.out.println("your age is "+age);
        
        
    }
    
}
