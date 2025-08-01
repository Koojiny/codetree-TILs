import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Spot[] dot = new Spot[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            dot[i] = new Spot(x, y, i + 1);
        }

        Arrays.sort(dot);

        for (Spot d : dot) {
            System.out.println(d.num);
        }
    }
}

class Spot implements Comparable<Spot> {
    int x;
    int y;
    int num;
    int dist;

    public Spot(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
        this.dist = Math.abs(x - 0) + Math.abs(y - 0);
    }

    @Override
    public int compareTo(Spot other) {
        if (this.dist != other.dist) return this.dist - other.dist;
        return this.num - other.num;
    }
}