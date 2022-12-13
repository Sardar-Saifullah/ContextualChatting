
public class TestBook {
    public static void main(String[] args) {
        String[] list ={"Author1","Author2","Author3"};
        Book b = new Book("java",100.50,list);
        System.out.println(b.toString());
         
          Book c = new Book("java 2",200.50,list);
          
        System.out.println(c.toString());
        
          Book d = new Book("java 3",300.50,list);
          
        System.out.println(d.toString());
        
    }
}
