import java.util.Scanner;

class bubblesort{
    static void sort(int[] arr){
        System.out.println("before sorting:");
        printArr(arr);
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println("after sorting:");
        printArr(arr);
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArr(int[] arr){
        for(int a :arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}



public class BubbleSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        input.close();
        bubblesort.sort(arr);

    }
}
