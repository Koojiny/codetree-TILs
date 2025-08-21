import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 2; j < len - 1; j++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == '('
                && s.charAt(j) == ')' && s.charAt(j + 1) ==')') cnt++;
            }
        }

        System.out.println(cnt);
    }
}