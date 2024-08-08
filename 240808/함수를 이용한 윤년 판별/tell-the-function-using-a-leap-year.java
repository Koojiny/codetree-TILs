import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        if (isLunaryear(y)) System.out.print("true");
        else System.out.print("false");
    }

    public static boolean isLunaryear(int year) {
        if (year % 4 == 0) return true;
        if (year % 100 == 0 && year % 400 != 0) return false;
        return false;
    }
}