import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String code = st.nextToken();
        char location = st.nextToken().charAt(0);
        int time = Integer.parseInt(st.nextToken());

        Secret sec = new Secret(code, location, time);
        System.out.println("secret code : " + sec.code);
        System.out.println("meeting point : " + sec.location);
        System.out.println("time : " + sec.time);
    }
}

class Secret {
    String code;
    char location;
    int time;

    public Secret(String code, char location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }
}