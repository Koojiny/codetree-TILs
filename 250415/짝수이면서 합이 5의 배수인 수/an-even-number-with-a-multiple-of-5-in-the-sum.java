import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(isMagicNum(n));
    }

    public static String isMagicNum(int n) {
        
        return n % 2 == 0 && (n / 10 + n % 10) % 5 == 0? "Yes" : "No";
    }
}