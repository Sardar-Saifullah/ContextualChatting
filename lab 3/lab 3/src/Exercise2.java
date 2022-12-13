
public class Exercise2 {
    double marks;
    public void displayMsg()
    {
        System.out.printf("your marks is %f\n",marks);
    }
   
    public void calGrades()
    {
       
        if(marks>=90 && marks<=100)
            System.out.println("A grade");
             if(marks>=81 && marks<=89)
                             System.out.println("B grade");

                      if(marks>=71 && marks<=79)
                                      System.out.println("C grade");

                               if(marks>=61 && marks<=69)
                                               System.out.println("D grade");
                                if(marks>=50 && marks<=59)
                                               System.out.println("E grade");
                                if(marks<50)
                                    System.out.println("F grade");
                                

        
    }
    
}
