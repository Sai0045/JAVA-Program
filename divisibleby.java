public class divisibleby {
    public static void main(String[] args) {
        System.out.println("\nDivisible by 3!\n");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) { // Check if the number is divisible by 3
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nDivisible by 5!\n");
        for (int j = 1; j < 100; j++) {
            if (j % 5 == 0) { // Check if the number is divisible by 5
                System.out.print(j + ", ");
            }
        }

        System.out.println("\n\nDivisible by 3 & 5!\n");
        for (int k = 1; k < 100; k++) {
            if (k % 3 == 0 && k % 5 == 0) { // Check if the number is divisible by both 3 and 5
                System.out.print(k + ", ");
            }
        }
        System.out.println("\n\nNot Divisiblr by 3 & 5!\n");
        for (int a = 1; a < 100; a++) {
            if (a % 3 != 0 && a % 5 != 0) { // Check if the number is not divisible by either 3 or 5
                System.out.print(a + ", ");
            }
        }

    }
}
