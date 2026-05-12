import java.util.Scanner;

class Solution {
    public void pattern14(int n) {

        for (int i = 1; i <= n; i++) {

            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);
            }

            System.out.println();
        }
    }
}

public class p14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern14(n);

        sc.close();
    }
}