public class LinkedList {
    private Node head;


    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void insertAtEnd(int data) {
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


    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }


    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }


    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void deleteByIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }


    public LinkedList[] frontBackSplit() {
        if (head == null || head.next == null) {
            return new LinkedList[]{this, new LinkedList()};
        }
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        LinkedList back = new LinkedList();
        back.head = slow.next;
        slow.next = null;

        LinkedList front = new LinkedList();
        front.head = head;

        return new LinkedList[]{front, back};
    }


    public static LinkedList mergeSorted(LinkedList list1, LinkedList list2) {
        LinkedList result = new LinkedList();
        result.head = merge(list1.head, list2.head);
        return result;
    }

    private static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;
        if (a.data < b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
