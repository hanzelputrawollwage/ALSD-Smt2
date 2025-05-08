public class StudentQueue15 {
    Student15[] data;
    int front, rear, size, max;

    public StudentQueue15(int n){
        max = n;
        data = new Student15[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == max;
    }

    void enQueue(Student15 dt){
        if(isFull()){
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    Student15 deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return null;
        }
        Student15 dt = data[front];
        front = (front + 1) % max;
        size--;
        return dt;
    }

    void peek(){
        if(!isEmpty()){
            System.out.println("Front data: ");
            data[front].print();
        }else{
            System.out.println("Queue is empty!!!");
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return;
        }
        int i = front;
        while(i != rear){
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Number of element: " + size);
    }

    //add new method called viewRear
    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Rear data : ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }    
}
