import java.util.*;
import java.io.*;

public class Main {

    public static String s1, s2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s1 = br.readLine();
        s2 = br.readLine();

        System.out.println(checkString(s1, s2));
    }

    public static int checkString(String target, String now) {
        for (int i = 0; i <= target.length() - now.length(); i++) {
            boolean match = true;

            for (int j = 0; j < now.length(); j++) {
                if (target.charAt(i + j) != now.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) return i;
        }

        return -1;
    }
}