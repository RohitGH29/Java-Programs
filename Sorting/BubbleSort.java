package Sorting;

public class BubbleSort {
    
     public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }  
    }

    // optimize bubble sort
   /*  public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                System.out.print(j+" ");
                

            }
            System.out.println();
            if(swap==0)
            {
                System.out.println(turn);
                break;
            }
        }  
    }*/

    public static void printBeforeSort(int arr[]){
        System.out.print("Before sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printAfterSort(int arr[]){
         System.out.print("After sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        printBeforeSort(arr);
        bubbleSort(arr);
        printAfterSort(arr);
    }


}
