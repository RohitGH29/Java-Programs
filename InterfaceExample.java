public class InterfaceExample {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        q.rule();

        Rook r = new Rook();
        r.move();
        r.rule();
    }
}
// Multiple inheritance by interface

interface ChessRule{
    void rule();
}

interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer,ChessRule{
    public void move(){
        System.out.println("Queen moves");
    }
     public void rule(){
        System.out.println("Queen rule");
     }
}


class Rook implements ChessPlayer,ChessRule{
    public void move(){
        System.out.println("Rook moves");
    }
    public void rule(){
        System.out.println("Rook rule");
    }
}