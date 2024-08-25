import java.io.*;

public class Main {

    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cnt = 0;
        
        System.out.print(devideNum(n));
    }

    public static int devideNum(int n) {
        if (n == 1) return cnt;
        cnt++;
        if (n % 2 == 0) {
            return devideNum(n / 2);
        } else {
            return devideNum(n / 3);
        }
    }
}