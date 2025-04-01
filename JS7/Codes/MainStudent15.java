import java.util.Scanner;

public class MainStudent15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //add a scanner for amount
        System.out.print("Enter number of student : ");
        int amountStudent = s.nextInt(); //change 5 into scanner that accepts amountStudent
        SearchStudent15 data = new SearchStudent15(amountStudent); //add amountStudent in parameter

        System.out.println("-----------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < 5; i++) {
            System.out.println("-----------");
            System.out.print("NIM : ");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name : ");
            String name = s.nextLine();
            System.out.print("Age : ");
            int age = s.nextInt();
            System.out.print("GPA : ");
            double gpa = s.nextDouble();

            Student15 std = new Student15(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("=================================");
        System.out.println("Entire Student Data:");
        data.display();

        System.out.println("____________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);
        data.showPosition(search, position);
        data.showData(search, position);

        //add or modify the code for Binary Search Tasks
        System.out.println("==========================================");
        System.out.print("Search student by NIM : ");
        System.out.println("Using Binary Search");
        position = data.findBinarySearch(search, 0, amountStudent-1);

        data.showPosition(search, position);
        data.showData(search, position);

        s.close();
    }
}
