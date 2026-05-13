import java.util.Scanner;

class Solution {

    public void pattern22(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int bottom = 2 * n - 2 - i;
                int left = j;
                int right = 2 * n - 2 - j;

                int min = Math.min(
                        Math.min(top, bottom),
                        Math.min(left, right)
                );

                System.out.print((n - min) + " ");
            }

            System.out.println();
        }
    }
}

public class p22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern22(n);

        sc.close();
    }
}