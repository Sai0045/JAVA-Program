import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter The First  Number : ");
            int a = s.nextInt();
            System.out.println("Enter the second number :");
            int b = s.nextInt();

            System.out.println(" CALCULATOR ");
            System.out.println("\n 1 : Addition ");
            System.out.println("   2 : Sustraction");
            System.out.println("   3 : Multiplication ");
            System.out.println("   4 : Exit ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition is :" + (a + b));
                    break;

                case 2:
                    System.out.println("Sustraction is :" + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication is :" + (a * b));
                    break;

                case 4:
                    System.out.println(".....EXIT.....");
                    break;
                default:
                    System.out.println("Enter Valid Number");
                    break;
            }
        } while (choice != 4);

    }
}