package Recursion;

public class LastOccurence {

   /* public static int lastOccurence(int arr[],int i , int key){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr, i-1, key);
    }*/
    public static int lastOccurence(int arr[],int i , int key){
        if(i == arr.length){
            return -1;
        }
        int isFound= lastOccurence(arr, i+1, key);
        if(isFound == -1 && arr [i]==key){
            return i;
        }
        return isFound;
    }
    

    public static void main(String[] args) {
        int arr[]={5,5,5,5};
        int key=5;
        System.out.println("The key "+key+" is at "+lastOccurence(arr, 0, key));
    }
    
}
