import java.io.*;
import java.util.*;

public class Main {
    
    static ArrayList<Integer> arr = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            int num = 0;
            if (command.equals("push_back")) {
                num = Integer.parseInt(st.nextToken());
                push_back(num);
            } else if (command.equals("get")) {
                num = Integer.parseInt(st.nextToken());
                System.out.println(get(num));
            } else if (command.equals("pop_back")) {
                pop_back();
            } else if (command.equals("size")) {
                System.out.println(size());
            }
        }
    }

    public static void push_back(int a) {
        arr.add(a);
    }

    public static void pop_back() {
        arr.remove(arr.size() - 1);
    }

    public static int size() {
        return arr.size();
    }

    public static int get(int k) {
        return arr.get(k - 1);
    }
}