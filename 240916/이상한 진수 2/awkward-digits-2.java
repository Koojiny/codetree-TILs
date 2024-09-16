import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String N = br.readLine();
        String[] arr = new String[N.length()];
        String[] temp = new String[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) + "";
            temp[i] = N.charAt(i) + "";
        }
        
        for (int i = 0; i < N.length(); i++) {
            temp[i] = temp[i] == "0" ? "1" : "0";
            String tempStr = "";
            
            for (int j = 0; j < N.length(); j++) {
                tempStr += temp[j];
            }
            int binaryToDecimal = Integer.parseInt(tempStr, 2);
            answer = Math.max(answer, binaryToDecimal);
            temp[i] = arr[i];
        }
        
        System.out.println(answer);
    }
}