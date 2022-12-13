
public class command {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Array;
        if(args.length!=3)
        {
            System.out.println("Please provide three arguments");
        }
        int len=Integer.parseInt(args[0]);
        int init=Integer.parseInt(args[1]);
            int inc=Integer.parseInt(args[2]);
            
            Array=new int[len];
            for(int j=0;j<Array.length;j++){
                Array[j]=init+inc*j;
            }
    for(int i=0;i<Array.length;i++)
            System.out.println(Array[i]+"\n");
         
        System.out.println(" Minimum of Array[0] and array[1]" + Minimum(Array[0],Array[1]));
        System.out.println("");
    System.out.println(" Minimum of All array values" + Minimum(Array));
    }
    
    public static int Minimum(int ...val)
    {
        int min=val[0];
        for (int i=0;i<val.length;i++){
            if (val[i] <min)
                min=val[i];
        }
         return min;   
    }

}
