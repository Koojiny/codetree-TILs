import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int idx = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (temp == 1) {
                result += Math.pow(2, idx);
            }
            idx++;
        }

        System.out.print(result);
    }
}