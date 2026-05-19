//finding the given string is pallindrome or not using recursion
class Demo12 {
    boolean isPalindrome(String s) {
        String p = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return pali(p, 0, p.length()-1);
    }

    boolean pali(String p, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (p.charAt(i) != p.charAt(j)) {
            return false;
        }
       return pali(p, i + 1, j - 1);
    }
}

public class Recursion5 {
    public static void main(String[] args) {
        String s = "harish";
        String s2 = "madam";
        Demo12 d = new Demo12();
        if (d.isPalindrome(s)) {
            System.out.println(s + " is palindrome");
        }
        if (d.isPalindrome(s2)) {
            System.out.println(s2 + " is palindrome");
        }
    }
}
