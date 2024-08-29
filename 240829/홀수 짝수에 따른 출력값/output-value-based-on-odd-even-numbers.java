import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(sumNum(n));
    }

    public static int sumNum(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        
        return sumNum(n - 2) + n;
    }
}