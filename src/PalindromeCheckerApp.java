import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String Palindrome = "racecar";

        if(isPalindrome(Palindrome))    System.out.println("The string is palindrome");
        else System.out.println("The string is not palindrome");
    }
}