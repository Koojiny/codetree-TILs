import java.io.*;

public class Main {
    public static class ObjectClass {
        private String secretCode;
        private String meetingPoint;
        private String time;

        public ObjectClass(String secretCode, String meetingPoint,
        String time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append("secret code : " + secretCode);
            sb.append("\n");
            sb.append("meeting point : " + meetingPoint);
            sb.append("\n");
            sb.append("time : " + time);

            return sb.toString();
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        ObjectClass oc = new ObjectClass(input[0], input[1], input[2]);
        System.out.println(oc.toString());
    }
}