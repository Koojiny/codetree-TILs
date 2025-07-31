import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        char color = st.nextToken().charAt(0);
        int second = Integer.parseInt(st.nextToken());

        Bomb bomb = new Bomb(code, color, second);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.second);
    }
}

class Bomb {
    String code;
    char color;
    int second;

    public Bomb (String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}