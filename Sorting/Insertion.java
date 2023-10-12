package Sorting;

public class Insertion {

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            // finding the correct position to insert
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
    }

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
        int arr[]={5,4,1,3,2};
        printBeforeSort(arr);
        insertionSort(arr);
        printAfterSort(arr);
    }
    
}
