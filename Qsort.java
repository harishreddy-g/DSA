class quickSort {
    int partion(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while (start < end) {
            while (start <= ub && arr[start] <= pivot) {
                start++;
            }

            while (end >= lb && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end);
        return end;
    }

    void sort(int[] arr, int lb, int ub) {

        if (lb < ub) {
            int loc = partion(arr, lb, ub);
            sort(arr, lb, loc - 1);
            sort(arr, loc + 1, ub);
        }

    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

public class Qsort {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int n = arr.length;
        quickSort qs = new quickSort();
        qs.sort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        qs.printArray(arr);
    }
}
