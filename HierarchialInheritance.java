public class HierarchialInheritance {

 public static void main(String[] args){
    Rohit r = new Rohit();
    r.smell();
    Mohit m= new Mohit();
    m.smell();
 }
    
}

// Base class
class Human{

    void smell(){
        System.out.println("Smell");
    }
}

//Derived class
class Rohit extends Human{
    void say(){
        System.out.println("Rohit");
    }
}

//Derived class
class Mohit extends Human{
    void say(){
        System.out.println("Mohit");
    }
}

