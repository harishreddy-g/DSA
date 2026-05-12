import java.util.Scanner;

class Solution {
    public void pattern2(int n) {
        int i = 0;

        while (i < n) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }
    }
}

public class p2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern2(n);

        sc.close();
    }
}