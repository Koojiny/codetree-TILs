import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            arr[i] = new Student(height, weight, i + 1);
        }

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.height != b.height) return a.height - b.height;
                return b.weight - a.weight;
            }
        });

        for (Student s : arr) {
            System.out.println(s.height + " " + s.weight + " " + s.num);
        }
    }
}

class Student {
    int height;
    int weight;
    int num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
}