public class MethodOverloading {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println(cal.sum(10,20));
        System.out.println(cal.sum((float)1.6,(float)2.5));
        System.out.println(cal.sum(10,20,45));
    }
}

class Calculate{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
