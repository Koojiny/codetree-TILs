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
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            
            people[i] = new Student(height, weight, i + 1);
        }

        Arrays.sort(people);

        for (Student s : people) {
            System.out.println(s.height + " " + s.weight + " " + s.num);
        }
    }
}

class Student implements Comparable<Student> {
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student other) {
        if (this.height != other.height) return other.height - this.height;
        if (this.weight != other.weight) return other.weight - this.weight;
        return this.num - other.num;
        
    }
}