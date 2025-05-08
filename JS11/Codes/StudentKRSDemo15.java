import java.util.Scanner;

public class StudentKRSDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentKRSQueue15 queue = new StudentKRSQueue15(10);
        int choice;

        do {
            System.out.println("\n=== KRS Approval Menu ===");
            System.out.println("1. Register Student");
            System.out.println("2. Process Approval (2 students)");
            System.out.println("3. Show All in Queue");
            System.out.println("4. Show First Two in Queue");
            System.out.println("5. Show Last Student in Queue");
            System.out.println("6. Show Queue Status");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String program = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    StudentKRS15 std = new StudentKRS15(nim, name, program, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.approvalProcess();
                    break;
                case 3:
                    queue.showAll();
                    break;
                case 4:
                    queue.showFirstTwo();
                    break;
                case 5:
                    queue.showRear();
                    break;
                case 6:
                    queue.queueStatus();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("Invalid menu!");
            }
        } while (choice != 0);

        sc.close();
    }
}
