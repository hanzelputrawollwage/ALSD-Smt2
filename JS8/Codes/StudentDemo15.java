import java.util.Scanner;

public class StudentDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAssignmentStack15 stack = new StudentAssignmentStack15(5);
        int choose;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Collecting Assignment");
            System.out.println("2. Grading Assignment");
            System.out.println("3. Display Top Assignment");
            System.out.println("4. Display Assignment List");
            System.out.println("5. First who's collecting");
            System.out.print("Choose menu : ");
            choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Class : ");
                    String kelas = sc.nextLine();
                    Student15 student = new Student15(nim, name, name);
                    stack.push(student);
                    System.out.printf("Assignment %s successfully collected\n ", student.name);
                    break;

                case 2:
                    Student15 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Enter grade (0-100) : ");
                        int grade = sc.nextInt();
                        graded.grading(grade);
                        System.out.printf("Grade Assignment %s is %d\n", graded.name, grade);
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    Student15 see = stack.peek();
                    if (see != null) {
                        System.out.println("Last assignment collected by " + see.name);
                    }
                    break;

                case 4:
                    System.out.println("List all assignment");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    break;

                // adding new case for checking who collected first
                case 5:
                    Student15 first = stack.theFirst();
                    if (first != null) {
                        System.out.println("The one who's submitted the assignment first is " + first.name);
                    }
                    break;

                default:
                    System.out.println("Chooices not valid");
            }
        } while (choose >= 1 && choose <= 4);
        sc.close();
    }
}