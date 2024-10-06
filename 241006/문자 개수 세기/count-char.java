import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = br.readLine().charAt(0);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
        }

        System.out.print(count);
    }
}