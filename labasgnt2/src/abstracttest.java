public class abstracttest {
   public static void main(String [] args){
   
       Shapes [] s = new Shapes[2];
       
       Circle1 cc= new Circle1();
       Rectangle1 rr = new Rectangle1();
       
       s[0]=cc;
       s[1]=rr;
       
       for(Shapes i : s){
         
           showInfo(i);
       }
   } 
   
   public static void showInfo(Shapes i){
       
           i.draw();
           if(i instanceof Circle1){
               ((Circle1)i).color();
           
       }
   }
}
