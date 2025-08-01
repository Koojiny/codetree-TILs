import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Future[] futures = new Future[n];
        String[] weathers = new String[n];
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String date = st.nextToken();
            String day = st.nextToken();
            String weather = st.nextToken();
            
            if (weather.equals("Rain")) weathers[cnt++] = date;
            futures[i] = new Future(date, day, weather);
        }

        Arrays.sort(weathers, 0, cnt);
        
        for (int i = 0; i < n; i++) {
            if (futures[i].date.equals(weathers[0])) System.out.println(futures[i].date + " " + futures[i].day  + " " + futures[i].weather);
        }
        
    }
}

class Future {
    String date;
    String day;
    String weather;

    public Future(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}