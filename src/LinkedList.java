public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    static class DoubleNode {
        int data;
        DoubleNode next;
        DoubleNode previous;

        DoubleNode(int value) {
            this.data = value;
            this.next = null;
            this.previous = null;
        }

    }

    Node head = null;
    Node tail = null;

    DoubleNode doubleHead = null;
    DoubleNode doubleTail = null;


    void addSingleNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }


    void addDoubleNode(int value) {
        DoubleNode newNode = new DoubleNode(value);
        if (doubleHead == null) {
            doubleHead = newNode;
        } else {
            doubleTail.next = newNode;
            newNode.previous = doubleTail;
        }
        doubleTail = newNode;
    }

    void displayNodes() {
        Node current = head;
        if (current == null) {
            System.out.println("No item exist");
            return;
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

    }

    void displayDoubleNodes() {
        DoubleNode current = doubleHead;
        if (current == null) {
            System.out.println("No item exist");
            return;
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }

    }

    Node search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    void delete(int value) {
        Node current = head;
        Node previous = head;
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.data == value) {
            head = head.next;
            return;
        }

        while (current.data != value) {
            previous = current;
            current = current.next;
        }

        if (current.data == tail.data) {
            tail = previous;
        }
        previous.next = current.next;

    }

    void deleteDouble(int value) {
        DoubleNode current = doubleHead;
        if (doubleHead == null) return;
        if (doubleHead == doubleTail) {
            doubleHead = null;
            doubleTail = null;
            return;
        }
        if (doubleHead.data == value) {
            doubleHead = doubleHead.next;
            return;
        }

        while (current.data != value) {
            current = current.next;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;

    }

    void reverse() {
        Node previous = head;
        Node current = tail;
        if (current == head) return;
        while (current != head) {
            while (previous.next != current) {
                previous = previous.next;
            }
            System.out.println(current.data + " ");
            current = previous;
            previous = head;
        }
        System.out.println(head.data + " ");
    }

    void reverseDouble() {
        DoubleNode current = doubleTail;
        if (current == doubleHead) return;
        while (current != doubleHead) {
            System.out.println(current.data + " ");
            current = current.previous;
        }
        System.out.println(doubleHead.data + " ");
    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        for (int i = 0; i < 6; i++) {
            l1.addDoubleNode(i + 5);
        }
        l1.displayDoubleNodes();
        Node node = l1.search(18);
        if (node == null) {
            System.out.println("No match");
        } else {
            System.out.println(node.data + " ");
        }

        // l1.reverseDouble();
        l1.deleteDouble(6);
        l1.displayDoubleNodes();

    }
}

