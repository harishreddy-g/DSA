import java.util.*;

class Bsort {
    void sort(List<Integer> list) {
        System.out.println("Array before sorting: ");
        printList(list);
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    swap(list, j, j + 1);
                    flag = true;
                }

            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Array after sorting: ");
        printList(list);
    }

    void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    void printList(List<Integer> list) {
        for (int l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
    }
}

public class ArrayLbubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of element in array:");
        int n = input.nextInt();
        System.out.println("Enter the elements: ");
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }

        Bsort arr1 = new Bsort();
        arr1.sort(arr);

    }
}
