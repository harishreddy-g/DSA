import java.util.Scanner;

class Solution {
    public void pattern4(int n) {

        int i = 1;

        while (i <= n) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
            i++;
        }
    }
}

public class p4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern4(n);

        sc.close();
    }
}