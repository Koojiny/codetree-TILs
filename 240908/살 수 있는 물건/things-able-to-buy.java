import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n >= 3000) {
            System.out.print("book");
        } else if (n >= 1000) {
            System.out.print("mask");
        } else {
            System.out.print("no");
        }
    }
}