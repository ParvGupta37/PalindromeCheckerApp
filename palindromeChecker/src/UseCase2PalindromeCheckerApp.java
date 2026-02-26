public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   PALINDROME CHECKER - USE CASE 2");
        System.out.println("=======================================");

        // Hardcoded string
        String word = "madam";

        System.out.println("Checking word: " + word);

        boolean isPalindrome = true;

        int left = 0;
        int right = word.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("Validation complete.");
    }
}
