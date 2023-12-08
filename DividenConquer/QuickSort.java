package DividenConquer;

public class QuickSort {
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

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // last element take as pivot value
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] < pivot) {
                // swap if element smaller than pivot value
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Now set pivot it's corrrect postion
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 1 };
        printBeforeSort(arr);
        quickSort(arr, 0, arr.length - 1);
        printAfterSort(arr);
    }

}
