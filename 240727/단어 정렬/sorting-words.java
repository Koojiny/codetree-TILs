import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sArr = new String[n];

        for (int i = 0; i < n; i++) {
            sArr[i] = br.readLine();
        }

        Arrays.sort(sArr);

        for (int i = 0; i < n; i++) {
            System.out.println(sArr[i]);
        }
    }
}