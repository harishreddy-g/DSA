import java.util.Scanner;

class Solution {
    public void pattern11(int n) {

        int start = 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(" " + start);
                start = 1 - start;
            }

            System.out.println();
        }
    }
}

public class p11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern11(n);

        sc.close();
    }
}