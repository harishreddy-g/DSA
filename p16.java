import java.util.Scanner;

class Solution {
    public void pattern16(int n) {

        for (int i = 1; i <= n; i++) {

            int k = i - 1;
            char c = (char) ('A' + k);

            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }

            System.out.println();
        }
    }
}

public class p16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern16(n);

        sc.close();
    }
}