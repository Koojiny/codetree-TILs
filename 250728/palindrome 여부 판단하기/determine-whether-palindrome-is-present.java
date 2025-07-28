import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();

        if (isPalindrome(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString += s.charAt(i);
        }

        if (newString.equals(s)) return true;
        else return false;
    }
}