public class StudentKRSQueue15 {
    StudentKRS15[] data;
    int front, rear, size, max, approval;

    public StudentKRSQueue15(int n) {
        max = n;
        data = new StudentKRS15[max];
        size = 0;
        front = 0;
        rear = -1;
        approval = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        approval = 0;
        System.out.println("Queue cleared");
    }

    void enqueue(StudentKRS15 Q) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = Q;
        size++;
        System.out.println(Q.name + " successfully added into queue");
    }

    void approvalProcess() {
        if (size < 2) {
            System.out.println("Not enough students to approval (min 2)");
            return;
        }
        System.out.println("Processing KRS approval for 2 students :");
        for (int i = 0; i < 2; i++) {
            StudentKRS15 Q = data[front];
            Q.print();
            front = (front + 1) % max;
            size--;
            approval++;
        }
    }

    void showAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("All students in queue :");
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].print();
            i = (i + 1) % max;
        }
    }

    void showFirstTwo() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else if (size == 1) {
            System.out.println("Only one student in queue:");
            data[front].print();
        } else {
            System.out.println("First out of two students in queue:");
            data[front].print();
            data[(front + 1) % max].print();
        }
    }

    void showRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Last student in queue :");
            data[rear].print();
        }
    }

    void queueStatus() {
        System.out.println("Total students in queue : " + size);
        System.out.println("Students approved : " + approval);
        System.out.println("Students not approved yet : " + (30 - approval));
    }
}
