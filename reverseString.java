public class reverseString {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("SAIRAJ");

        for (int i = 0; i < s.length() / 2; i++) {
            int front = i;
            int back = s.length() - 1 - i;

            char frontChar = s.charAt(front);
            char backChar = s.charAt(back);

            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);

        }
        System.out.println("Reversed String is " + s);
    }
}
