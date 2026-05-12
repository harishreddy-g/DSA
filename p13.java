import java.util.Scanner;

class Solution {
    public void pattern13(int n) {

        int start = 1;

        for (int i = 1; i <= n; i++) {

            start = start + (i - 1);

            for (int j = start; j < start + i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

public class p13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern13(n);

        sc.close();
    }

}