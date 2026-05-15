import java.util.Scanner;
class Demo {
    int sum(int n){
        if(n == 0){

            return 0;
        }
        return n + sum(n-1);

        
    }
}



public class Recursion2 {
    public static void main(String[] args) {
        Demo d1 =new Demo();
        System.out.println(d1.sum(4));
    }
}
