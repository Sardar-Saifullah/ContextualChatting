import java.util.ArrayList;
public class testBook1 {
    public static void main(String[] args) {
        Book1[] list= Book1.CreateObject();
        ArrayList<Book1> grades = new ArrayList<Book1>();
        grades.add(list[0]);
        grades.add(list[1]);
    }
}
