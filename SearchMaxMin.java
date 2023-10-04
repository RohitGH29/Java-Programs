import java.util.Scanner;
class SearchMaxMin{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
      //  System.out.print("Enter the size of array: ");
      //  int size = sc.nextInt();
        int numbers[]=new int[2];

        System.out.println("Enter the numbers:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }

        sc.close();

     int num=  Math.max(numbers[0],numbers[1]);
     System.out.print(num);
        

    }



}