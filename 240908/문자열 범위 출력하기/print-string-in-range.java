import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.print(s.substring(2, 10));
        // for(int i = 2; i < 10; i++) {
        //     System.out.print(s.charAt(i));
        // }
    }
}