public class RecursionIncreaseNumber {

    public static void main(String[] args) {
     
      //incrNum(1, 10);  
      incrNum(10);  
    }

   /*  public static void incrNum(int sNum,int eNum){
        if(sNum==eNum){
            System.out.print(eNum);
            return;
        }
        System.out.print(sNum+" ");
        incrNum(sNum+1, eNum);


    }*/

    public static void incrNum(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incrNum(n-1);
        System.out.print(n+" ");
    }
    
}
