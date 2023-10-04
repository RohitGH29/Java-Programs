public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.play();
    }
    
}


class A{
    void play(){
        System.out.println("A Play");
    }
}

class B extends A{
    void play(){
        System.out.println("B Play");
    }
}
