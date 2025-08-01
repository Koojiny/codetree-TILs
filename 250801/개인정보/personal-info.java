import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());
            
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for (Person p : people) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }
        System.out.println();

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return b.height - a.height;
            }
        });

        System.out.println("height");
        for (Person p : people) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }
    }
}

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight; 
    }
}