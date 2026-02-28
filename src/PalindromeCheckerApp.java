public class PalindromeCheckerApp {

    public static boolean twoPointerCheck(String input) {

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

    public static boolean reverseStringCheck(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }

    public static void main(String[] args) {

        String text = "Able was I ere I saw Elba";

        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(text);
        long endTime1 = System.nanoTime();

        long duration1 = endTime1 - startTime1;

        // Measure Reverse String Execution Time
        long startTime2 = System.nanoTime();
        boolean result2 = reverseStringCheck(text);
        long endTime2 = System.nanoTime();

        long duration2 = endTime2 - startTime2;

        System.out.println("Two-Pointer Result: " + result1);
        System.out.println("Two-Pointer Execution Time (ns): " + duration1);

        System.out.println("Reverse String Result: " + result2);
        System.out.println("Reverse String Execution Time (ns): " + duration2);
    }
}