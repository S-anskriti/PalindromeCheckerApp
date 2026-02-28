public class PalindromeCheckerApp {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    public static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;
        Node next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (prev != null && slow != null) {
            if (prev.data != slow.data) {
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(2);
        insert(1);

        if (isPalindrome()) {
            System.out.println("Linked List is a palindrome");
        } else {
            System.out.println("Linked List is not a palindrome");
        }
    }
}