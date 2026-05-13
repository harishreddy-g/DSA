import java.util.Scanner;

class Solution {

    public void pattern21(int n) {

        for (int i = 1; i <= n; i++) {

            if (i == 1 || i == n) {

                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }

            } else {

                // First Star
                System.out.print("*");

                // Spaces
                for (int j = 2; j < n; j++) {
                    System.out.print(" ");
                }

                // Last Star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class p21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern21(n);

        sc.close();
    }
}