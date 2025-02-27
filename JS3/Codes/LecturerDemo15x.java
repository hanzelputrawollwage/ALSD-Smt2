import java.util.Scanner;

public class LecturerDemo15x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lecturers: ");
        int numLec = sc.nextInt();
        Lecturer15x[] lecturerArray = new Lecturer15x[numLec];

        for (int i = 0; i < numLec; i++) {
            System.out.print("ID: ");
            String id = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Gender (true = male, false = female): ");
            boolean gender = sc.nextBoolean();

            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.println();

            lecturerArray[i] = new Lecturer15x(id, name, gender, age);
        }

        System.out.println("\nAll Lecturer Data:\n");
        for (int i = 0; i < lecturerArray.length; i++) {
            lecturerArray[i].print();
        }

        int maleCount = 0, femaleCount = 0;
        for (Lecturer15x lec : lecturerArray) {
            if (lec.gender) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        System.out.println("\nLecturer Count by Gender:\n");
        System.out.println("Male Lecturers: " + maleCount);
        System.out.println("Female Lecturers: " + femaleCount);
        System.out.println("=========================================");

        int maleTotalAge = 0, femaleTotalAge = 0;
        for (Lecturer15x lec : lecturerArray) {
            if (lec.gender) {
                maleTotalAge += lec.age;
            } else {
                femaleTotalAge += lec.age;
            }
        }

        System.out.println("\nAverage Age by Gender:\n");
        System.out.println("Average Male Lecturer Age: " + (maleCount > 0 ? (double) maleTotalAge / maleCount : 0));
        System.out.println("Average Female Lecturer Age: " + (femaleCount > 0 ? (double) femaleTotalAge / femaleCount : 0));
        System.out.println("=========================================");

        Lecturer15x oldest = lecturerArray[0];
        for (int i = 1; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age > oldest.age) {
                oldest = lecturerArray[i];
            }
        }
        System.out.println("\nOldest Lecturer:\n");
        oldest.print();

        Lecturer15x youngest = lecturerArray[0];
        for (int i = 1; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age < youngest.age) {
                youngest = lecturerArray[i];
            }
        }
        System.out.println("\nYoungest Lecturer:\n");
        youngest.print();

        sc.close();
    }
}
