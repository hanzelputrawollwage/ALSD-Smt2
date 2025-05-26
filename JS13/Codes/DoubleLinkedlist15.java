public class DoubleLinkedlist15 {
    Node15 head;
    Node15 tail;

    public DoubleLinkedlist15() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    Student15 getFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        return head.data;
    }

    Student15 getLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        }
        return tail.data;
    }

    Student15 getIndex(int index) {
        if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Invalid index!");
            return null;
        }

        Node15 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int getSize() {
        int count = 0;
        Node15 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    int indexOf(String key) {
        int index = 0;
        Node15 temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    void addFirst(Student15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void add(int index, Student15 data) {
        if (index < 0 || index > getSize()) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == getSize()) {
            addLast(data);
        } else {
            Node15 newNode = new Node15(data);
            Node15 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    void insertAfter(String key, Student15 data) {
        Node15 newNode = new Node15(data);
        Node15 temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node15 temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node15 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (index < 0 || index >= getSize()) {
            System.out.println("Invalid index");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node15 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node15 temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next == null) {
                    System.out.println("No node after " + key + " to remove!");
                } else {
                    if (temp.next == tail) {
                        removeLast();
                    } else {
                        temp.next = temp.next.next;
                        temp.next.prev = temp;
                    }
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key " + key + " not found!");
    }

}