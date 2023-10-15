package DividenConquer;

public class MergeSort {

      public static void printBeforeSort(int arr[]) {
        System.out.print("Before sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printAfterSort(int arr[]) {
        System.out.print("After sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2; // calculate mid pt
        mergeSort(arr, si, mid); // for left side
        mergeSort(arr, mid + 1, ei); // for right side

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // index for 1st sorted part
        int j = mid + 1;// index for 2nd sorted part
        int k = 0; // index for temp;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of the 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for leftover elements of the 2nd sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy the temp into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

  

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8,1 };
        printBeforeSort(arr);
        mergeSort(arr, 0, arr.length - 1);
        printAfterSort(arr);
    }
}
