// plindrome or not

import java.util.Scanner;

class Solution {

    public boolean isPalindrome(int n) {

        if (n < 0 || (n % 10 == 0 && n != 0)) {
            return false;
        }

        int rev = 0;

        while (n > rev) {

            rev = rev * 10 + n % 10;

            n = n / 10;
        }

        return n == rev || n == rev / 10;
    }
}

public class math3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        boolean result = obj.isPalindrome(n);

        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}