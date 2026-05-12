import java.util.Scanner;

class Solution {
    public void pattern10(int n) {

        int star = 0;

        for (int i = 1; i <= 2 * n - 1; i++) {

            star = i;

            if (i > n) {
                star = 2 * n - i;
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

public class p10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern10(n);

        sc.close();
    }
}