import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (checkSosu(i) && checkNum(i)) count++;
        }

        System.out.println(count);
    }

    public static boolean checkNum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 2 == 0) return true;
        
        return false;
    }

    public static boolean checkSosu(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}