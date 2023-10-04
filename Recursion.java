public class Recursion {

    public static void main(String[] args) {
        number(10);
    }

    static void number(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }

        System.out.print(n+" ");
        number(n - 1);

    }

}
