
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class single {
    Node head;

    void addFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void deleteFront() {
        if (head == null) {
            System.out.println(" you can't delete ,List is empty!!");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("List got empty");
            return;
        }

        head = head.next;
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println(" you can't delete ,List is empty!!");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("List got empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {

            temp = temp.next;

        }
       
        temp.next = null;

    }

    void delete(int key) {
        if (head == null) {
            System.out.println(" you can't delete ,List is empty!!");
            return;
        }
        if (head.data == key) {
            if (head.next == null) {
                System.out.println("List got empty!");
                head = null;
            } else {
                head = head.next;
            }
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Key not found in list.");
        } else if (temp.next.data == key) {
            temp.next = temp.next.next;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class singlelink {
    public static void main(String[] args) {
        single l = new single();
        l.addFront(10);
        l.addEnd(9);
        l.addEnd(8);
        l.addEnd(7);
        l.addFront(11);
        l.printList();
        l.deleteFront();
        l.deleteEnd();
        l.delete(9);
        l.printList();
    }
}
