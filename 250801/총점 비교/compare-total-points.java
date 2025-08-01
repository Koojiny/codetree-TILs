import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Student[] people = new Student[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            people[i] = new Student(name, a, b, c);
        }

        Arrays.sort(people);

        for (Student s : people) {
            System.out.println(s.name + " " + s.a + " " + s.b + " " + s.c);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int a;
    int b;
    int c;

    public Student(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Student other) {
        return (this.a + this.b + this.c) - (other.a + other.b + other.c) ;
    }
}