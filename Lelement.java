class Demo {
    public int large(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Lelement {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        int[] arr = { 1, 2, 3, 4, 5, 10, 5, 2, 1 };
        System.out.println(d1.large(arr));
    }
}
