import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String productName = st.nextToken();
        int productCode = Integer.parseInt(st.nextToken());

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(productName, productCode);

        System.out.println("product " + product1.code + " is " + product1.name);
        System.out.println("product " + product2.code + " is " + product2.name);
    }
}

class Product {
    String name;
    int code;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}