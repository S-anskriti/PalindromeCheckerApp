public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String Palindrome = "racecar";
        String NotPalindrome = "notaracecar";

        int i, n, flag;

        flag = 0;
        n = Palindrome.length();
        for (i = 0; i < n/2; i++){
            if(Palindrome.charAt(i) != Palindrome.charAt(n-i-1)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome.");


        flag = 0;
        n = NotPalindrome.length();
        for (i = 0; i < n/2; i++){
            if(NotPalindrome.charAt(i) != NotPalindrome.charAt(n-i-1)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)  System.out.println("The string " + NotPalindrome + " is a palindrome.");
        else System.out.println("The string " + NotPalindrome + " is not a palindrome.");
    }
}