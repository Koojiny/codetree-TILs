import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student other) {
        if (this.kor == other.kor) {
            if (this.eng == other.eng) {
                return other.math - this.math;
            }
            return other.eng - this.eng;
        }

        return other.kor - this.kor;
    }
}