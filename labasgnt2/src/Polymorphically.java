import java.util.ArrayList;
public class Polymorphically {
    
    public static void main(String []args){
        
        Dog dd=new Dog();
        cat cc=new cat();
        
        ArrayList<Animal> animal=new ArrayList<Animal>();
        
        animal.add(dd);
        animal.add(cc);
        
        for(Animal a:animal ){
            a.Eat();
            System.out.println("SOUNDS: "+a.makeSound());
            
            if(a instanceof Dog){
            ((Dog)a).noLegs();
        }
        
        if(a instanceof cat){
            ((cat)a).noLegs();
        }
        }
    }
    
}
