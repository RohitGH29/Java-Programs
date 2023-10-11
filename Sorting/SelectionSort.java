package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
        selectionSort(arr);
        printAfterSort(arr);
}
    
}
