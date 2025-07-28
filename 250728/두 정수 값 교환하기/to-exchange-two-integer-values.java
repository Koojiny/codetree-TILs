import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        IntWrapper n = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper m = new IntWrapper(Integer.parseInt(st.nextToken()));

        swap(n, m);

        System.out.println(n.value + " " + m.value);
    }

    public static void swap(IntWrapper n, IntWrapper m) {
        int temp = m.value;
        m.value = n.value;
        n.value = temp;
    }
}

class IntWrapper {
        int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }