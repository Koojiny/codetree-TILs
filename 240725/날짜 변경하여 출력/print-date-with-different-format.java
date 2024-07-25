import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");
        String yy = st.nextToken();
        String mm = st.nextToken();
        String dd = st.nextToken();

        System.out.printf(mm + "-" + dd + "-" + yy);
    }
}