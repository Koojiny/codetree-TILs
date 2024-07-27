import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = br.readLine().toCharArray();
        Arrays.sort(cArr);
        String sortedString = new String(cArr);
        System.out.print(cArr);
    }
}