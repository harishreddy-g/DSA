import java.util.Scanner;

class Solution {
    public void pattern9(int n) {

        // Upper Pyramid
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class p9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern9(n);

        sc.close();
    }
}