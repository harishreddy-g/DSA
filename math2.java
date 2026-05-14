import java.util.Scanner;

class Solution {

    public int reverseNumber(int n) {

        int rev = 0;

        while (n > 0) {

            int digit = n % 10;

            rev = rev * 10 + digit;

            n = n / 10;
        }

        return rev;
    }
}

public class math2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        int reversed = obj.reverseNumber(n);

        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}