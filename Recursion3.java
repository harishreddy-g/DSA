import java.util.Scanner;
class Demo{
    int fac(int n){
        if(n==0){
            return 1;
        }
        return n*fac(n-1);
    }
}

public class Recursion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        Demo d1= new Demo();
        System.out.println("Factorial of "+n+":");
        System.out.println(d1.fac(n));
    }
}
