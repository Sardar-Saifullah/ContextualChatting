/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp21-bse-022
 */
public class VariableArg {
    
    public static int My_sum(int... num){
        int total=0;
        for(int val:num){
            total +=val;
        }
        return total;
    }
            
     public static void main(String[] args) {
        
         System.out.printf("Sum using two arguments %5d\n", My_sum(10,5));
         System.out.printf("Sum using three arguments %5d\n",My_sum(10,5,5));
      System.out.printf("Sum using four arguments %5d\n",  My_sum(10,5,5,6));
     }  
}


