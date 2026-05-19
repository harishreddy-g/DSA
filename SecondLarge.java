class Demo {
    public int slarge(int[] arr) {
        int sl = Integer.MIN_VALUE;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sl = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sl) {
                sl = arr[i];
            }
        }
        return sl;
    }
}

public class SecondLarge {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(d1.slarge(arr));
    }
}
