import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] cArr = new char[10];

        for (int i = 0; i < 10; i++) {
            cArr[i] = st.nextToken().charAt(0);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(cArr[i]);
        }
    }
}