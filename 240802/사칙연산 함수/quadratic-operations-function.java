import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        char o = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());

        switch(o) {
            case '+':
                System.out.print(a + " " + o + " "+ c + " = " + addNum(a, c));
                break;
            case '-':
                System.out.print(a + " " + o + " "+ c + " = " + minusNum(a, c));
                break;
            case '/':
                System.out.print(a + " " + o + " "+ c + " = " + divisionNum(a, c));
                break;
            case '*':
                System.out.print(a + " " + o + " "+ c + " = " + mulNum(a, c));
                break;
            default:
                System.out.print("False");
                break;
        }

    }

    public static int addNum(int a, int b) {
        return a + b;
    }

    public static int minusNum(int a, int b) {
        return a - b;
    }

    public static int divisionNum(int a, int b) {
        return a / b;
    }

    public static int mulNum(int a, int b) {
        return a * b;
    }
}