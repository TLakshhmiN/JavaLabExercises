import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class Exercise_Q2 {
    private static boolean chkPalin(Node h) {
        if (h == null || h.next == null) {
            return true;
        }

        Node slow = h;
        Node fast = h;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node r = revList(slow.next);
        Node l = h;
        
        while (r != null) {
            if (l.val != r.val) {
                return false;
            }
            l = l.next;
            r = r.next;
        }
        
        return true;
    }
    
    private static Node revList(Node h) {
        Node p = null;
        Node curr = h;
        while (curr != null) {
            Node nextTmp = curr.next;
            curr.next = p;
            p = curr;
            curr = nextTmp;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes for which palindrome needs to be checked: ");
        int n = sc.nextInt();
        
        System.out.printf("Enter the value of Node #0: ");
        Node h = new Node(sc.nextInt());
        Node curr = h;
        for (int i = 1; i < n; i++) {
            System.out.printf("Enter the value of Node #%d: ", i);
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        boolean palin = chkPalin(h);
        if (palin) {
            System.out.println("The linked list is a palindrome. (true)");
        } else {
            System.out.println("The linked list is not a palindrome. (false)");
        }
    }
}
