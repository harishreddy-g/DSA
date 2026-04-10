class node {
    int data;
    node next;
    node prev;

    node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

class doubleL {
    node head;

    void addFront(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            head.prev = null;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addEnd(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            head.prev = null;
            return;
        }
        if (head.next == null) {
            head.next = newNode;
            newNode.prev = head;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        newNode.prev = temp;

    }

    void deleteFront() {
        if (head == null) {
            System.out.println("List is empty.!!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("List iss empty.!!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        temp.prev.next = null;

    }

    void delete(int key) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node temp = head;
        if (temp.data == key) {
            deleteFront();
            return;
        }
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found");
            return;
        }
        if (temp.next == null) {
            temp.prev.next = null;
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    void printList() {
        node temp = head;
        System.out.print("null <--> ");
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class doublelink {
    public static void main(String[] args) {
        doubleL l = new doubleL();
        l.addEnd(10);
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
