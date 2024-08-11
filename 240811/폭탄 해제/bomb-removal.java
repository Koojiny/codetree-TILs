import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Password password = new Password(st.nextToken(), st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
        System.out.println("code : " + password.code);
        System.out.println("color : " + password.color);
        System.out.println("second : " + password.second);
    }
}

class Password {
    String code;
    char color;
    int second;

    public Password(String c, char col, int sec) {
        this.code = c;
        this.color = col;
        this.second = sec;
    }
}