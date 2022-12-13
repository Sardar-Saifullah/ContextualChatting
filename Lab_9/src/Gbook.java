

public class Gbook {
     private String Course;
    private int[] grades=new int[5];
    public Gbook(int[] val){
       
        Course="Object Oriented Programming";
        grades =val;
    }
    public void GetMax(){
        
        for(int v:grades)
            System.out.print(v+"  ");
        
        int max=grades[0];
        for(int v:grades){
            if(max <v) {
                max=v;
            }
            
        }
       System.out.println("\nMax grade is" +max); 
            
    }
      

 public String toString(){
     return String.format("Course Name: %s \n",this.Course);
 }
 
 
 }



