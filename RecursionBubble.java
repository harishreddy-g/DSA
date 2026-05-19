class Bubble {
    public int[] sort(int[] arr) {
        return bSort(arr, 0, 0);
    }

    int[] bSort(int[] arr, int i, int j) {
        if (i >= arr.length - 1) {
            return arr;
        }
        if (j >= arr.length - 1 - i) {
            return bSort(arr, i + 1, 0);
        }
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
        return bSort(arr, i, j + 1);
    }
}

public class RecursionBubble {
    public static void main(String[] args) {
        Bubble b1 = new Bubble();
        int[] arr = {5,3,2,1,10,6,4,2};
        b1.sort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
