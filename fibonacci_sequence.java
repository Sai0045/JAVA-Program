import java.util.Scanner;

public class fibonacci_sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number till you want a fibonacci sequence:");
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("First " + n + " number of Fibonacci Sequence are:");

        for (int i = 0; i <= n; i++) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
