import java.util.*;

class quickSort {
    int partion(List<Integer> list, int lb, int ub) {
        int start = lb;
        int end = ub;
        int pivot = list.get(lb);
        while (start < end) {
            while (start <= ub && list.get(start) <= pivot) {
                start++;
            }
            while (end >= lb && list.get(end) > pivot) {
                end--;
            }
            if (start < end) {
                swap(list, start, end);
            }
        }
        swap(list, lb, end);

        return end;
    }

    void sort(List<Integer> list, int lb, int ub) {
        if (lb < ub) {
            int loc = partion(list, lb, ub);
            sort(list, lb, loc - 1);
            sort(list, loc + 1, ub);

        }
    }

    void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    void printList(List<Integer> list) {
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}

public class ArrayLquick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total no elements in an array:");
        int n = input.nextInt();
        System.out.println("Enter the elemets:");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        quickSort arr1 = new quickSort();
        arr1.sort(list, 0, n - 1);
        System.out.println("Array after sorting");
        arr1.printList(list);
        input.close();
    }
}
