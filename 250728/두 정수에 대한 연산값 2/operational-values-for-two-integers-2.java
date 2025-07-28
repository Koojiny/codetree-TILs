import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        IntWrapper a = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper b = new IntWrapper(Integer.parseInt(st.nextToken()));

        changeNum(a, b);

        System.out.println(a.value + " " + b.value);
    }

    public static void changeNum(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else {
            a.value += 10;
            b.value *= 2;
        }
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}