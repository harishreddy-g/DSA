//printing 1 to N using recursion .

import java.util.Scanner;

class Demo {
    void printNumbers(int n) {
        print(1, n);
    }

    void print(int count, int n) {
        if (count > n) {
            return;
        }
        System.out.println(count + " ");
        print(count + 1, n);

    }
}

public class Recursion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        Demo d1 = new Demo();
        System.out.println("Numbers from 1 to "+n);
        d1.printNumbers(n);
    }
}
