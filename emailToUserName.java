import java.util.Scanner;

public class emailToUserName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the E-MAIL:");
        String email = s.nextLine();
        String username = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }

}
