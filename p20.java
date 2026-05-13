import java.util.Scanner;

class Solution {

    public void pattern20(int n) {

        int space = 0;
        int star = 0;

        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                space = 2 * (n - i);
                star = i;
            } else {
                space = 2 * (i - n);
                star = 2 * n - i;
            }

            // Stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = star; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class p20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern20(n);

        sc.close();
    }
}