import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Info[] infos = new Info[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String addr = st.nextToken();
            String location = st.nextToken();

            names[i] = name;
            infos = new Info(name, addr, location);
        }

        Arrays.sort(names);
        
        for (int i = 0; i < n; i++) {
            if (names[n - 1].equals(infos[i].name)) {
                System.out.println(infos[i].);
                System.out.println(infos[i].);
                System.out.println(infos[i].);
            }
        }
    }
}

class Info {
    String name;
    String address;
    String location;

    public Info(String name, String address, String location) {
        this.name = name;
        this.address = address;
        this.location = location;
    }
}