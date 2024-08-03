import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = a;i <= b; i++) {
            if(isPrime(i) && evenNum(i)) cnt++;
        }
        
        System.out.print(cnt);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
            else continue;
        }
        return true;
    }

    public static boolean evenNum(int n) {
        int sum = 0;

        while (true) {
            int c = 0;
            if (n < 10) {
                c = n;
                sum += c;
                break; 
            }
            c = n % 10;
            sum += c;

            n = n / 10;
        }

        if (sum % 2 == 0) return true;
        else return false;
    }
}