import java.util.Scanner;

class Solution {

    public boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        boolean b = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                b = false;
                break;
            }
        }

        return b;
    }
}

public class math7{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        boolean result = obj.isPrime(n);

        System.out.println("Is Prime: " + result);

        sc.close();
    }
}