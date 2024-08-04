import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if (checkDay(M, D)) System.out.print("Yes");
        else System.out.print("No");
    }

    public static boolean checkDay(int M, int D) {
        if (1 <= M && M <= 12) {
            if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10){
                if (1 <= D && D <= 31) return true;
                else return false;
            }
            if (M == 2) {
                if (1 <= D && D <= 28) return true;
                else return false;
            }
            else {
                if (1 <= D && D <= 30) return true;
                else return false;
            }
        }

        return false;
    }
}