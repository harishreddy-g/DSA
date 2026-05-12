import java.util.Scanner;

class Solution {
    public void pattern15(int n) {

        for (int i = n; i >= 1; i--) {

            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);
            }

            System.out.println();
        }
    }
}

public class p15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern15(n);

        sc.close();
    }
}