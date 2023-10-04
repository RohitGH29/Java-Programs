public class Inheritance {
     public static void main(String args[]){
 
        Fish a=new Fish();
        a.eat();
        a.breathe();
        a.swim();
         
     }
}

//Base class
class Animal{

    void eat(){
        System.out.println("Eat");
    }

    void breathe(){
        System.out.println("Breathe");
    }

}

// Derived class
class Fish extends Animal{

    void swim(){
        System.out.println("Swim in water");
    }
}


