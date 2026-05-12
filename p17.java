import java.util.Scanner;

class Solution {
    public void pattern17(int n) {

        for (int i = 1; i <= n; i++) {

            char c = 'A';

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Characters
            for (int p = 1; p <= (2 * i) - 1; p++) {

                System.out.print(c);

                if (p < i) {
                    c = (char) (c + 1);
                } else {
                    c = (char) (c - 1);
                }
            }

            System.out.println();
        }
    }
}

public class p17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern17(n);

        sc.close();
    }
}