import java.util.Scanner;

class Solution {
    public void pattern3(int n) {

        int count = 1;

        while (count <= n) {

            for (int i = 1; i <= count; i++) {
                System.out.print(i);
            }

            System.out.println();
            count++;
        }
    }
}

public class p3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        obj.pattern3(n);

        sc.close();
    }
}