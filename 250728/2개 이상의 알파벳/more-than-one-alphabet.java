import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();

        if (checkAlphabet(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checkAlphabet(String s) {        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) return true;
        }

        return false;
    }
}