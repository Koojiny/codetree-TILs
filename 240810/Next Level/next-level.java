import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Id id1 = new Id();
        Level level1 = new Level();
        System.out.printf("user %s lv %d\n", id1.id, level1.level);
        
        id1.id = st.nextToken();
        level1.level = Integer.parseInt(st.nextToken());

        System.out.printf("user %s lv %d", id1.id, level1.level);
    }
}

class Id {
    String id;

    public Id() {
        this.id = "codetree";
    }

    public Id(String id) {
        this.id = id;
    }
}

class Level {
    int level;

    public Level() {
        this.level = 10;
    }

    public Level(int level) {
        this.level = level;
    }
}