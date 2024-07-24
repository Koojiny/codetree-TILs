import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        char c = br.readLine().charAt(0);
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        System.out.println(c);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f", b);
    }
}