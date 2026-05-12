import java.util.Scanner;

class Solution {
    public void pattern6(int n) {

        int i = n;

        while (i > 0) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
            i--;
        }
    }
}

public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern6(n);

        sc.close();
    }
}