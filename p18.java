import java.util.Scanner;

class Solution {

    public void pattern18(int n) {

        for (int i = 1; i <= n; i++) {

            char c = (char) ('A' + (n - i));

            for (char start = c; start <= (char) ('A' + (n - 1)); start++) {
                System.out.print(start);
            }

            System.out.println();
        }
    }
}

public class p18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern18(n);

        sc.close();
    }
}