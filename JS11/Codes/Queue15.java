public class Queue15 {
    int[] data;
    int front, rear, size, max;

    public Queue15(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front Data : " + data[front]);
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }

            System.out.println(data[i] + " ");
            System.out.println("Number of element : " + size);
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!!");
        }
    }

    void enQueue(int dt) {
        if (isFull()) {
            System.out.println("Queue is full, exiting now");
            System.exit(1);
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = dt;
        size++;
    }

    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, exiting now");
            System.exit(1);
        }
        int dt = data[front];
        size--;
        if (isEmpty()) {
            front = rear = -1;
        } else {
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
        return dt;
    }
}
