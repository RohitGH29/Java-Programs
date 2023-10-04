import java.util.Scanner;
class SearchNumber{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[]=new int[size];

        System.out.println("Enter the numbers:");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Which number you want to find in array:");
        int findNumber=sc.nextInt();
        sc.close();

        boolean tr=false;
        for(int i=0;i<size; i++){
            if(findNumber==numbers[i]){
                System.out.println("Your number "+numbers[i]+" is"+" at "+i+" index");
                tr=true;
                break;
            }
        }
          if(tr==false){
                System.out.print("Search number doesn't exist in the array");  
            }
          }

    }



