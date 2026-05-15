import java.util.Arrays;

public class Recursion4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Demo d1 = new Demo();
        d1.reverseArray(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

class Demo {
    void reverseArray(int[] arr, int n) {
        rev(arr, 0, n - 1);

    }

    void rev(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev(arr, i + 1, j - 1);
    }
