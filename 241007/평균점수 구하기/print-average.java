import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double[] d = new Double[8];
        double sum = 0;

        for (int i = 0; i < 8; i++) {
            sum += Double.parseDouble(st.nextToken());
        }

        System.out.printf("%.1f", sum / 8);
    }
}