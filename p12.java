import java.util.Scanner;

class Solution {
    public void pattern12(int n) {

        for (int i = 1; i <= n; i++) {

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            // Decreasing numbers
            for (int p = i; p >= 1; p--) {
                System.out.print(p);
            }

            System.out.println();
        }
    }
}

public class p12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern12(n);

        sc.close();
    }
}