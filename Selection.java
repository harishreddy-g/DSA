import java.util.Scanner;

class Ssort{
    static void sort (int[] arr){
        System.out.println("Array before sorting:");
        printArr(arr);
        for(int i=0;i<=arr.length-2;i++){
            int minindex=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<=arr[minindex]){
                    minindex = j;
                }
            }
            swap(arr,i,minindex);
        }
        System.out.println("Array after sorting:");
        printArr(arr);
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArr(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}


public class Selection {
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
        Ssort.sort(arr);
    }
}
