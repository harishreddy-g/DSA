import java.util.*;

class mergeSort {
    void divide(List<Integer> list, int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            divide(list, lb, mid);
            divide(list, mid + 1, ub);
            merge(list, lb, mid, ub);
        }
    }

    void merge(List<Integer> list, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = 0;
        List<Integer> l = new ArrayList<>();
        while (i <= mid && j <= ub) {
            if (list.get(i) < list.get(j)) {
                l.add(k, list.get(i));
                i++;
            } else {
                l.add(k, list.get(j));
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= ub) {
                l.add(k, list.get(j));
                j++;
                k++;
            }
        }
        if (j > ub) {
            while (i <= mid) {
                l.add(k, list.get(i));
                i++;
                k++;
            }
        }

        for (int z = 0; z <= ub - lb; z++) {
            list.set(lb + z, l.get(z));
        }
    }

    void printlist(List<Integer> list) {
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}

public class ArrayLmerge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements in Array: ");
        int n = input.nextInt();
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        mergeSort arr1 = new mergeSort();
        int lb = 0;
        int ub = n - 1;
        arr1.divide(list, lb, ub);
        System.out.println("Array after sorting: ");
        arr1.printlist(list);
        input.close();
    }
}
