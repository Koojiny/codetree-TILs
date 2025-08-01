import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        Num[] nums = new Num[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            
            nums[i] = new Num(x, i);
        }

        Arrays.sort(nums, new Comparator<Num>() {
            @Override
            public int compare(Num a, Num b) {
                if (a.num != b.num) return a.num - b.num;
                return a.idx - b.idx;
            }
        });

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[nums[i].idx] = i + 1;
        }

        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}

class Num {
    int num;
    int idx;

    public Num(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }
}