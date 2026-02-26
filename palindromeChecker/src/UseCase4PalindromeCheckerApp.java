public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a string to check.");
            return;
        }

        String input = args[0];
        char[] characters = input.toCharArray();

        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}

