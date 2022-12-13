
public class Book {
   private String bname;
   private double price;
   private String[] authors;
   public Book(String bname,double price,String[] authors){
   this.bname= bname;
   this.price = price;
   this.authors=authors;
   }
   public String toString(){
       String str = "[";
       for(String a:authors){
           
           str += a+",";
       }
           str = str +"]";
           return String.format("Book name %s book price %2f\nauthor list %s",bname,price,str);
       }  

 
    }

