class Msort {
    void divide(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            divide(arr, lb, mid);
            divide(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = 0;
        int[] b = new int[ub - lb + 1];
        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= ub) {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        if (j > ub) {
            while (i <= mid) {
                b[k] = arr[i];
                i++;
                k++;
            }
        }
        for (int a = 0; a < b.length; a++) {
            arr[lb + a] = b[a];
        }

    }

    void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

public class Merge {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        Msort ms = new Msort();
        System.out.println("Original array:");
        ms.printArr(arr);
        ms.divide(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        ms.printArr(arr);
    }
}
