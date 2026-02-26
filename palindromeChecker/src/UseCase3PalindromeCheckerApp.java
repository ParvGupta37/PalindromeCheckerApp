public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a string to check.");
            return;
        }

        String original = args[0];
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }
    }
}
