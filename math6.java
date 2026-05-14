import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {

    public int[] divisors(int n) {

        List<Integer> d = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                d.add(i);
            }
        }

        int[] ans = new int[d.size()];

        for (int i = 0; i < d.size(); i++) {
            ans[i] = d.get(i);
        }

        return ans;
    }
}

public class math6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Solution obj = new Solution();

        int[] result = obj.divisors(n);

        System.out.println("Divisors are: " + Arrays.toString(result));

        sc.close();
    }
}