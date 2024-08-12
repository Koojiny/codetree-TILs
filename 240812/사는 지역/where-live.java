import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String code = st.nextToken();
            String region = st.nextToken();

            p[i] = new Person(name, code, region);
            s[i] = name;
        }

        Arrays.sort(s);
        
        for (int i = 0; i < n; i++) {
            if (s[n - 1].equals(p[i].name)) {
                System.out.println("name " + p[i].name);
                System.out.println("addr " + p[i].code);
                System.out.println("city " + p[i].region);
            }
        }
    }
}

class Person {
    String name;
    String code;
    String region;

    public Person(String name, String code, String region) {
        this.name = name;
        this.code = code;
        this.region = region;
    }
}