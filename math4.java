import java.util.Scanner;

class Solution {

    public int GCD(int n1, int n2) {

        while (n2 != 0) {

            int temp = n2;

            n2 = n1 % n2;

            n1 = temp;
        }

        return n1;
    }
}

public class math4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Solution obj = new Solution();

        int gcd = obj.GCD(n1, n2);

        System.out.println("GCD is: " + gcd);

        sc.close();
    }
}