import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Agent[] agents = new Agent[5];
        int[] scores = new int[5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String codename = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            agents[i] = new Agent(codename, score);
            scores[i] = score;
        }
        Arrays.sort(scores);

        for (int i = 0; i < 5; i++) {
            if (agents[i].score == scores[0]) {
                System.out.println(agents[i].codename + " " + agents[i].score);
                return;
            }
        }        
    }
}

class Agent {
    String codename;
    int score;

    public Agent(String name, int score) {
        this.codename = name;
        this.score = score;
    }
}