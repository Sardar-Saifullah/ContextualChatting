import java.util.ArrayList;
import java.util.Collections;
public class testGbook {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
         int[] score={5,10,15,20,25};
        int[] score2={2,4,6,8,10};
        Gbook b1=new Gbook(score);
        Gbook b2=new Gbook(score2);
        
     ArrayList<Gbook> grades=new ArrayList<Gbook>();
     grades.add(b1);
     grades.add(b2);
        
        
        //System.out.println("Data Structure Siz "+ gradebook.size());
        for(Gbook b:grades){
            System.out.println("Grade Book :"+ b.toString());
            
            b.GetMax();
            
                    }
    }
    
}

  

