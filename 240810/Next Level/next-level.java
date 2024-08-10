import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 초기값을 이용하여 첫 번째 User 객체를 생성
        User user1 = new User();

        // 값 변경
        user1.id = "codetree";
        user1.level = 10;
        
        // 변수 선언 및 입력
        String id2 = st.nextToken();
        int level2 = Integer.parseInt(st.nextToken());
        
        // 초기값을 이용하여 두 번째 User 객체 생성
        User user2 = new User();

        // 값 변경
        user2.id = id2;
        user2.level = level2;

        System.out.printf("user %s lv %d\n", user1.id, user1.level);
        System.out.printf("user %s lv %d", user2.id, user2.level);
    }
}

class User {
    String id;
    int level;

    public User(){
        this.id = "";
        this.level = 0;
    }

    public User(String id, int level){
        this.id = id;
        this.level = level;
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