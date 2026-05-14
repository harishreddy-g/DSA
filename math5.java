import java.util.Scanner;

class Solution {

    public boolean isArmstrong(int n) {

        int count = 0;
        int sum = 0;
        int digits = n;

        // Count digits
        while (digits > 0) {
            count++;
            digits = digits / 10;
        }

        int temp = n;

        // Calculate Armstrong sum
        while (temp > 0) {

            int digit = temp % 10;

            sum += Math.pow(digit, count);

            temp = temp / 10;
        }

        return sum == n;
    }
}

public class math5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        boolean result = obj.isArmstrong(n);

        System.out.println("Is Armstrong Number: " + result);

        sc.close();
    }
}