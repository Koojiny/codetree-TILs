import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(checkNum(n));
    }

    public static String checkNum(int n) {
        if (n % 2 == 0) {
            if (((n / 10) + (n % 10)) % 5 == 0) {
                return "Yes";
            }
        }
        
        return "No";    
    }
}