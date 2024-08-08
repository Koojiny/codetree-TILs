import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int[] newArr = new int[7];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            newArr[i] = arr[i];
        }
        newArr[3] = arr[0] * arr[1];
        newArr[4] = arr[1] * arr[2];
        newArr[5] = arr[0] * arr[2];
        newArr[6] = arr[0] * arr[1] * arr[2];
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        
        int maxNum = 0;
        int n = 6;
        while (true) {
            maxNum = newArr[n];
            if (maxNum % 2 != 0) break;
            
            n--;

        }

        System.out.print(maxNum);
        for (int i = 5; i >= 0; i--) {
            if (maxNum % 2 == 0 && newArr[i])
        }
        
    }
}