import java.util.Scanner;

public class negativenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        do {
            System.out.println("Enter the Number:");
            a = s.nextInt();
            if (a >= 0) {
                System.out.println("You entered Number :" + a);
            }
        } while (a >= 0);
        System.out.println("You entered Negative Number..");
    }
}
