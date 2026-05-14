
//  counts no of digits in a number 


import java.util.Scanner;

class Solution {

    public int countDigit(int n) {

        String s = Integer.toString(n);

        return s.length();
    }
}

public class math1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        int digits = obj.countDigit(n);

        System.out.println("Number of digits: " + digits);

        sc.close();
    }
}