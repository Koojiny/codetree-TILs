import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        if (s1.length() != s2.length()) {
            System.out.println("No");
            return;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}