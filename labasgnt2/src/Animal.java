interface Animal {
    
    public void Eat();
    public String makeSound();
    
}

class Dog implements Animal{
    
    public void Eat(){
        System.out.println("dog eat meat");
        
    }
    public String makeSound(){
        
        return "DOGS SOUNDS WOW WOW WOW WOW";
    }
    public void noLegs(){
        System.out.println("DOG HAS FOUR LEGS");
        System.out.println("");
    }
}

class cat implements Animal{
    public void Eat(){
        System.out.println("cat drink milk");
    }
    public String makeSound(){
        return "CATS SOUNDS MEOW MEOW";
    }
    public void noLegs(){
            System.out.println("CAT HAS TWEO LEGS");
    }
}
