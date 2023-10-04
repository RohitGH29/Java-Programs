public class MultiLevelInheritance {

    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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


//Derived class
class Mammals extends Animal{
    int legs;
}

//Derived class
class Dog extends Mammals{
    int breed;
}