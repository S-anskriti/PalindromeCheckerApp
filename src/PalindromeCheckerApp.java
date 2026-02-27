import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String Palindrome = "racecar", Reversed = "";
        char[] chars = Palindrome.toCharArray();
        Stack <Character> stack  = new Stack<>();
        int i = 0, n = chars.length;

        for(i = 0; i < n; i++){
            stack.push(chars[i]);
        }

        while(!stack.empty()){
            Reversed += stack.pop();
        }

        if (Palindrome.equals(Reversed)) {
            System.out.println("The string " + Palindrome + " is palindrome");
        } else {
            System.out.println("The string " + Palindrome + " is not a palindrome");
        }

    }
}