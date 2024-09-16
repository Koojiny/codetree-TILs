import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] num = br.readLine().toCharArray();
        int max = Integer.MIN_VALUE;
        
        // 1. 2진법 수를 2번째 숫자부터 순환 (맨 앞은 0이 아님을 가정하므로)
        for (int i = 0; i < num.length; i++) {
            if (num[i] == '1') {
                num[i] = '0';

                String s = "";
                for (int j = 0; j < num.length; j++) {
                    s += num[j];
                }
                int tmp = Integer.parseInt(s, 2); // 10진법 변환
                max = Math.max(max, tmp);
                num[i] = '1';
            } else {
                num[i] = '1';

                String s = "";
                for (int j = 0; j < num.length; j++) {
                    s += num[j];
                }
                int tmp = Integer.parseInt(s, 2); // 10진법 변환
                max = Math.max(max, tmp);
                num[i] = '0';
            }
        }
        // 2. 순환하며 해당 숫자를 0 또는 1로 변경
        // 3. 10진법으로 숫자를 변환
        System.out.print(max);
    }
}