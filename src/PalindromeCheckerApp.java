class PalindromeService {

    public boolean isPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Never Odd Or Even";

        PalindromeService service = new PalindromeService();
        boolean result = service.isPalindrome(text);

        if (result) {
            System.out.println("\"" + text + "\" is a palindrome");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome");
        }
    }
}