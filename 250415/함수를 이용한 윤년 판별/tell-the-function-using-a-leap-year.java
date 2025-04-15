import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        
        System.out.println(isLunar(year));
    }

    public static boolean isLunar(int y) {
        if (y % 100 == 0 && y % 400 != 0) return false;
        if (y % 4 == 0) return true;
        

        return false;
    }
}