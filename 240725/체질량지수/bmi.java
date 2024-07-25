import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        double b = (10000 * w) / (double)(h * h);

        System.out.printf("%d\n", (int)b);
        if (b >= 25) System.out.print("Obesity");
    }
}