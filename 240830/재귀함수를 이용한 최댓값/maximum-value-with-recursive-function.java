import java.io.*;
import java.util.*;

public class Main {
    static int maxN = 0;
    static int n;
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        System.out.print(maxNum(maxN, Integer.parseInt(st.nextToken()), 1));
    }

    public static int maxNum(int maxNum, int tmpNum, int depth) {
        if (depth == n) return Math.max(maxNum, maxN);
        //System.out.println(maxNum + " " + tmpNum + " " + depth);
        maxN = Math.max(maxNum, tmpNum);
        return maxNum(maxN, Integer.parseInt(st.nextToken()), depth + 1);
    }
}