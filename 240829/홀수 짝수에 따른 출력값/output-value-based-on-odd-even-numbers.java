import java.io.*;

public class Main {

    public static int sum = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n % 2 != 0) {
            System.out.print(sumOddNum(n));
        } else {
            System.out.print(sumEvenNum(n));
        }
        
    }

    public static int sumOddNum(int n) {
        sum = 0;
        
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        
        return sum;
    }

    public static int sumEvenNum(int n) {
        sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;            
        }

        return sum;
    }
}