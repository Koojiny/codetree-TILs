import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Agent[] aArr = new Agent[5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            aArr[i] = new Agent(st.nextToken().charAt(0), Integer.parseInt(st.nextToken()));
        }

        int min = aArr[0].score;
        for (int i = 1; i < 5; i++) {
            if (aArr[i].score < min) min = aArr[i].score;
        }

        for (int i = 0; i < 5; i++) {
            if (aArr[i].score == min) {
                System.out.print(aArr[i].grade + " " + aArr[i].score);
            }
        }
    }
}

class Agent {
    char grade;
    int score;

    public Agent(char g, int s) {
        this.grade = g;
        this.score = s;
    }
}