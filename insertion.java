import java.util.Scanner;

class Isort{
    static void sort (int[] arr){
        System.out.println("Array before sorting:");
        printArr(arr);
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0&& arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Array after sorting:");
        printArr(arr);  
    }
    static void printArr(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}

public class insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Isort.sort(arr);
        sc.close();
    }
}

    

