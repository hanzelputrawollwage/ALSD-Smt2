import java.util.Scanner;

public class ExcuseLetterDemo15 {
    public static void main(String[] args) {
        ExcuseLetterStack15 stack = new ExcuseLetterStack15(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.println("5. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type of Excuse (S/I): ");
                    char type = scan.next().charAt(0);
                    System.out.print("Duration: ");
                    int duration = scan.nextInt();
                    scan.nextLine();
                    stack.push(new ExcuseLetter15(id, name, className, type, duration));
                    System.out.println("Excuse letter submitted.");
                    break;
                case 2:
                    ExcuseLetter15 letter = stack.pop();
                    if (letter != null)
                        System.out.println("Processing letter from " + letter.name);
                    break;
                case 3:
                    ExcuseLetter15 latest = stack.peek();
                    if (latest != null)
                        System.out.println("Latest letter from: " + latest.name);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String search = scan.nextLine();
                    ExcuseLetter15 result = stack.searchByName(search);
                    if (result != null)
                        System.out.println("Letter found from: " + result.name);
                    else
                        System.out.println("Letter not found.");
                    break;
            }
        } while (choice != 5);

        scan.close();
    }
}
