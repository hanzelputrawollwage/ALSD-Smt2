import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList15 sll = new SingleLinkedList15();
        int choice;

        while (true) {
            System.out.println("\n=== LinkedList Menu ===");
            System.out.println("1. Add Student15 to Front");
            System.out.println("2. Add Student15 to End");
            System.out.println("3. Insert Student15 at Index");
            System.out.println("4. Insert Student15 After a Name");
            System.out.println("5. Display All");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim1 = sc.nextLine();
                    System.out.print("Name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Class: ");
                    String className1 = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa1 = sc.nextDouble();

                    Student15 s1 = new Student15(nim1, name1, className1, gpa1);
                    sll.addFirst(s1);
                    break;

                case 2:
                    System.out.print("NIM: ");
                    String nim2 = sc.nextLine();
                    System.out.print("Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Class: ");
                    String className2 = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa2 = sc.nextDouble();
                    Student15 s2 = new Student15(nim2, name2, className2, gpa2);
                    sll.addLast(s2);
                    break;

                case 3:
                    System.out.print("Insert at index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("NIM: ");
                    String nim3 = sc.nextLine();
                    System.out.print("Name: ");
                    String name3 = sc.nextLine();
                    System.out.print("Class: ");
                    String className3 = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa3 = sc.nextDouble();
                    Student15 s3 = new Student15(nim3, name3, className3, gpa3);
                    sll.insertAt(index, s3);
                    break;

                case 4:
                    System.out.print("Insert after name: ");
                    String key = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim4 = sc.nextLine();
                    System.out.print("Name: ");
                    String name4 = sc.nextLine();
                    System.out.print("Class: ");
                    String className4 = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa4 = sc.nextDouble();
                    Student15 s4 = new Student15(nim4, name4, className4, gpa4);
                    sll.insertAfter(s4, key);
                    break;

                case 5:
                    sll.print();
                    break;

                case 0:
                    System.out.println("Exiting Program!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }

            /* premodified code
            Student15 std1 = new Student15("001", "Student15 1", "TI-1I", 3.89);
             Student15 std2 = new Student15("002", "Student15 2", "TI-1I", 3.45);
             Student15 std3 = new Student15("003", "Student15 3", "TI-1I", 3.20);
             Student15 std4 = new Student15("004", "Student15 4", "TI-1I", 3.00);
             sll.print();
             sll.addFirst(std4);
             sll.print();
             sll.addLast(std1);
             sll.print();
             sll.insertAfter(std3, "Student15 4");
             sll.insertAt(2, std2);
             sll.print();
             System.out.println("Data at index 1 is:");
             Student15 data = sll.getData(1);
             data.print();
             int idx = sll.indexOf("Student15 1");
             System.out.println("Student15 1 is located at index: " + idx);
             sll.removeFirst();
             sll.removeLast();
             sll.print();
             sll.removeAt(0);
             sll.print(); */
        }
    }
}