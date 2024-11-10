import java.util.Scanner;

public class flight_choice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Flight choice:");
        int i = s.nextInt();
        if (i < 0) {
            System.out.println("Invalid Choice! please enter Positive Number.. ");
        } else if (i > 0) {
            System.out.println("You have selected flight:" + i);
        } else {
            System.out.println("Invalid Choice! Please enter Valid Number...");
        }
    }
}
