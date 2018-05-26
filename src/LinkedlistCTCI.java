import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LinkedlistCTCI {
    Node head;
    static class Node {
        int data;
        Node next;
        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void printlist(Node head) {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before operation :");
        printlist(start);
        System.out.println("\n1. Remove dup with hashset \n2. Remove dup with runner \n3. Remove kth to last \n4. Delete any middle element without access to head");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        //sc.close();
        switch (c) {
            case 1:
                removedup(start);
                System.out.println("\nLinked list after removing duplicates :");
                printlist(start);
                break;
            case 2:
                removeduprun(start);
                System.out.println("\nLinked list after removing duplicates using runner :");
                printlist(start);
                break;
            case 3:

                System.out.println("Enter k");
                int k = sc.nextInt();
                sc.close();
                kthtolast(start, k);
                System.out.println("\nLinked list after removing " + k + "th to last:");
                printlist(start);
                break;
            case 4:
                System.out.println("Enter node");
                //no access
                //Node n = 10;
               // deleteNode(n);
                break;
        }



    }

    public static void removedup(Node head) {
        Node current = head;
        Node prev = null;
        HashSet<Integer> dict = new HashSet<Integer>();
        while(current != null) {
            int value = current.data;
            if(dict.contains(value)) {
                prev.next = current.next;
            }
            else {
                dict.add(value);
                prev = current;
            }
            current = current.next;
        }
    }

    public static void removeduprun(Node head) {
        Node current = head;
        Node prev = null;
        //Node runner = head.next;
        while(current != null) {
            int value = current.data;
            Node runner = current.next;
            while(runner != null) {
                if(runner.data == value) {
                    current.next = runner.next;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }

    public static void kthtolast(Node head, int k) {
        Node current = head;
        int length = getLength(current);
        //System.out.println(length);
        int target = length - k;
        if(target < 0) {
            System.out.println(" linked list is smaller");
            return;
        }
        while(target > 0) {
            current = current.next;
            target -= 1;
        }
        System.out.println(current.data);
    }

    public static int getLength(Node current) {
        if(current == null) {
            return 0;
        }
        else {
            return 1 + getLength(current.next);
        }
    }

    public static boolean deleteNode(Node n) {
        if(n.next == null || n == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
