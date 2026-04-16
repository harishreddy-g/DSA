class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class circleList {
    Node head;

    void addFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;

    }

    void deleteFront() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
    }

    void delete(int key) {
        if (head == null)
            return;

        // single node
        if (head.data == key && head.next == head) {
            head = null;
            return;
        }

        // ✅ delete head
        if (head.data == key) {
            deleteFront();
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Element not found");
    }

    void display() {
        if (head == null)
            return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}

public class circularlink {
    public static void main(String[] args) {
        circleList l1 = new circleList();
        l1.addFront(10);
        l1.addEnd(20);
        l1.addEnd(30);
        l1.addFront(0);
        l1.display();
    }
}
