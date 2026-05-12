import java.util.Scanner;

class Solution {
    public void pattern5(int n) {

        int i = n;

        while (i > 0) {

            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
            i--;
        }
    }
}

public class p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern5(n);

        sc.close();
    }
}