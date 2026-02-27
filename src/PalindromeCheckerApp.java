public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String Palindrome = "racecar";
        char[] chars = Palindrome.toCharArray();

        boolean flag = true;
        int start = 0, end = Palindrome.length()-1;

        while (start < end){
            if(chars[start] != chars[end]){
                flag = false;
                break;
            }
            start ++;
            end --;
        }

        if (flag)  System.out.println("The string " + Palindrome + " is a palindrome.");
        else System.out.println("The string " + Palindrome + " is not a palindrome.");
    }
}