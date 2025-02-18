import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int length;

        System.out.print("Please input the cube length : ");
        while (true) {
            length = sc.nextInt();
            if (length > 0) {
                break;
            } else {
                System.out.print("Invalid input. Please enter a positive integer for the cube length: ");
            }
        }

        while (true) {
            System.out.println("\n=====================================");
            System.out.println("Cube Calculator");
            System.out.println("=====================================");
            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter (total edge length) of the cube");
            System.out.println("4. Exit");
            System.out.print("Please select the calculation type : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The volume of the cube is: " + calcVol(length));
                    break;
                case 2:
                    System.out.println("The surface area of the cube is: " + calcSurfaceArea(length));
                    break;
                case 3:
                    System.out.println("The perimeter of the cube is: " + calcPerimeter(length));
                    break;
                case 4:
                    System.out.println("Thanks for using Cube Calculator....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid calculation type.");
            }
        }
    }

    public static int calcVol(int length) {
        return (length * length * length);
    }

    public static int calcSurfaceArea(int length) {
        return (6 * length * length);
    }

    public static int calcPerimeter(int length) {
        return (12 * length);
    }
}
