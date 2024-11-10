import java.util.Scanner;

public class sumofanintegerdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("`Enter the Integer: ");
        int a = s.nextInt();
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a = a / 10;
        }
        System.out.println("The sum of Digit is :" + sum);
    }

}
