import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(is369(a, b));
    }

    public static int is369(int a, int b) {
        int answer = 0;
        for (int i = a; i <= b; i++) {
            if(isMagicNum(i)) answer++;
        }

        return answer;
    }

    public static boolean isMagicNum(int n) {
        return n % 3 == 0 || have369(n);
    }

    public static boolean have369(int n) {
        String s = String.valueOf(n);
        if (s.contains("3") || s.contains("6") || s.contains("9")) return true;
        
        return false;
    }
}