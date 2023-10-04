import java.util.Scanner;



public class TwoDArray {
    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       
         
        System.out.print("Enter the numbers of row: ");
        int rows = sc.nextInt();

        System.out.print("Enter the numbers of column: ");
        int cols= sc.nextInt();

        int[][] numbers = new int[rows][cols];
        
        System.out.print("Enter the elements of the Array: ");
         
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        System.out.print("Which number you want to search: ");;;;;
        int x = sc.nextInt();

         sc.close();
         
        Boolean b=false;
       // System.out.print("The elements of array is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
              if(numbers[i][j] == x){
                System.out.print("The numbers "+numbers[i][j]+ " is at "+i+j);
                b=true;
                break;
              }
            }
            System.out.println();
        }

        if(b==false)
          System.out.print("The number doesn't exist");
    }

}