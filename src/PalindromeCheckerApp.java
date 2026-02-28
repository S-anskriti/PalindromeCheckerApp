interface PalindromeStrategy {
    boolean isPalindrome(String input);
}
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        if (input == null) return false;

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
class ReverseStringStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        if (input == null) return false;

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }
}
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.isPalindrome(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Was It A Rat I Saw";
        PalindromeContext context =
                new PalindromeContext(new TwoPointerStrategy());

        boolean result1 = context.execute(text);

        System.out.println("Two-Pointer Strategy Result: " + result1);

        context.setStrategy(new ReverseStringStrategy());

        boolean result2 = context.execute(text);

        System.out.println("Reverse String Strategy Result: " + result2);
    }
}