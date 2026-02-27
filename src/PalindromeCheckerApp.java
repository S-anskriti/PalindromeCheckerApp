import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String Palindrome = "racecar", ReversedQ = "", ReversedS = "";
        char[] chars = Palindrome.toCharArray();
        Stack <Character> stack  = new Stack<>();
        Queue <Character> queue = new LinkedList<>();

        int i = 0, n = chars.length;

        for(char ch : chars){
            stack.push(ch);
            queue.add(ch);
        }

        while (!queue.isEmpty() && !stack.empty()) {
            ReversedQ += queue.remove();
            ReversedS += stack.pop();
        }

        if (Palindrome.equals(ReversedS))
            System.out.println("The Stack method worked.");
        if (Palindrome.equals(ReversedQ))
            System.out.println("The Queue method worked");
        else
            System.out.println("None of the methods worked");
    }
}