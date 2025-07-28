import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        IntWrapper a = new IntWrapper(Integer.parseInt(st.nextToken()));
        IntWrapper b = new IntWrapper(Integer.parseInt(st.nextToken()));

        checkNum(a, b);

        System.out.println(a.value + " " + b.value);
    }

    public static void checkNum(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}