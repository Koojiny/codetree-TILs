import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double[][] arr = new double[2][4];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Double.parseDouble(st.nextToken());
            }
        }
        double a1, a2, b1, b2, b3, b4, c1 = 0.0;
        a1 = (arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3]) / 4;
        a2 = (arr[1][0] + arr[1][1] + arr[1][2] + arr[1][3]) / 4;
        b1 = (arr[0][0] + arr[1][0]) / 2;
        b2 = (arr[0][1] + arr[1][1]) / 2;
        b3 = (arr[0][2] + arr[1][2]) / 2;
        b4 = (arr[0][3] + arr[1][3]) / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                c1 += arr[i][j];
            }
        }
        c1 = c1 / 8;

        System.out.printf("%.1f %.1f\n", a1, a2);
        System.out.printf("%.1f %.1f %.1f %.1f\n", b1, b2, b3, b4);
        System.out.printf("%.1f", c1);
    }
}