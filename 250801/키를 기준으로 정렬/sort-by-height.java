import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            people[i] = new Person(name, height, weight);
        }
        
        Arrays.sort(people);

        for (Person p : people) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }
    }
}

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person other) {
        return this.height - other.height;
    }
}