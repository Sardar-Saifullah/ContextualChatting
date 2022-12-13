
abstract class Shapes {
    Shapes(){
        System.out.println(" 1-drawig Shape");
    }
    abstract void draw();
}

class Rectangle1 extends Shapes{
    Rectangle1 (){
        System.out.println(" 2-drawing Rectangle ");
    }
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle1 extends Shapes{
    Circle1(){
        System.out.println(" 3-drawing Circle");
    }
    
    void draw(){
        System.out.println("Drawing Circle");
    }
    
    void color(){
        System.out.println("Circle is colored Red");
    }
}
