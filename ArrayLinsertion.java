import java.util.*;

class insertionSort {

    void sort(List<Integer> list) {
        System.out.println("Array before sorting:");
        printList(list);
        for (int i = 1; i < list.size(); i++) {
            int j = i - 1;
            int key = list.get(i);
            while (j >= 0 && key < list.get(j)) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        System.out.println("Array after sorting :");
        printList(list);
    }

    void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}

public class ArrayLinsertion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = input.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        insertionSort arr1 = new insertionSort();
        arr1.sort(list);

    }
}
