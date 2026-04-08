import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

class selectionSort {
    void sort(List<Integer> list) {
        System.out.println("Array after sorting:");
        printList(list);
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            if (min != i) {
                swap(list, min, i);
            }
        }
        System.out.println("Array after sorting");
        printList(list);
    }

    void swap(List<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    void printList(List<Integer> list) {
        for (int n : list) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}

public class ArrayLselection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of elements in array");
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        selectionSort arr1 = new selectionSort();
        arr1.sort(list);
    }
}
