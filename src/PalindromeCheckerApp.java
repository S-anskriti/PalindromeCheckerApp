public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String Palindrome = "racecar";
        String Reverse = "";

        int i;

        for(i = Palindrome.length()-1; i >= 0; i--){
            Reverse += Palindrome.charAt(i);
        }
        if (Palindrome.equals(Reverse))  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome.");
    }
}