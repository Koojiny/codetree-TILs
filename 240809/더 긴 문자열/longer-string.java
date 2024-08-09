import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        
        if (s1.length() < s2.length()) {
            System.out.printf("%s %d", s2, s2.length());
        } else if (s1.length() == s2.length()) {
            System.out.printf("same");
        } else {
            System.out.printf("%s %d", s1, s1.length());
        }
    }
}