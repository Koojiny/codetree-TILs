import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] cArr = str.toCharArray();
        Arrays.sort(cArr);
        String sortedStr = new String(cArr);
        
        System.out.print(sortedStr);
    }
}