import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int size = s.length();
        int cnt = 0;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == '(' && s.charAt(j) == ')' && s.charAt(j + 1) == ')')
                    cnt++;
            }
        }
        
        System.out.print(cnt);
    }    
}