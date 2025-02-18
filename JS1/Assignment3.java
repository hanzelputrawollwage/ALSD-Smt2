import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] courseNames = new String[n];
        int[] creditHours = new int[n];
        int[] semesters = new int[n];
        String[] lectureDays = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for course " + (i + 1));
            System.out.print("Course Name: ");
            courseNames[i] = sc.nextLine();
            
            System.out.print("Credit Hours: ");
            creditHours[i] = sc.nextInt();
            
            System.out.print("Semester: ");
            semesters[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Lecture Day: ");
            lectureDays[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Courses");
            System.out.println("2. Display Courses on a Specific Day");
            System.out.println("3. Display Courses for a Specific Semester");
            System.out.println("4. Search for a Course");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayCourses(courseNames, creditHours, semesters, lectureDays);
                    break;
                case 2:
                    System.out.print("Enter day (e.g., Monday, Tuesday): ");
                    String day = sc.nextLine();
                    displayCoursesByDay(courseNames, creditHours, semesters, lectureDays, day);
                    break;
                case 3:
                    System.out.print("Enter semester: ");
                    int semester = sc.nextInt();
                    sc.nextLine();
                    displayCoursesBySemester(courseNames, creditHours, semesters, lectureDays, semester);
                    break;
                case 4:
                    System.out.print("Enter course name to search: ");
                    String courseName = sc.nextLine();
                    searchCourse(courseNames, creditHours, semesters, lectureDays, courseName);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void displayCourses(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays) {
        System.out.println("\nAll Courses Schedule:");
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Course Name: " + courseNames[i] + ", Credit Hours: " + creditHours[i] + ", Semester: " + semesters[i] + ", Lecture Day: " + lectureDays[i]);
        }
    }

    public static void displayCoursesByDay(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String day) {
        System.out.println("\nCourses on " + day + ":");
        for (int i = 0; i < courseNames.length; i++) {
            if (lectureDays[i].equalsIgnoreCase(day)) {
                System.out.println("Course Name: " + courseNames[i] + ", Credit Hours: " + creditHours[i] + ", Semester: " + semesters[i]);
            }
        }
    }

    public static void displayCoursesBySemester(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, int semester) {
        System.out.println("\nCourses for Semester " + semester + ":");
        for (int i = 0; i < courseNames.length; i++) {
            if (semesters[i] == semester) {
                System.out.println("Course Name: " + courseNames[i] + ", Credit Hours: " + creditHours[i] + ", Lecture Day: " + lectureDays[i]);
            }
        }
    }

    public static void searchCourse(String[] courseNames, int[] creditHours, int[] semesters, String[] lectureDays, String courseName) {
        boolean found = false;
        for (int i = 0; i < courseNames.length; i++) {
            if (courseNames[i].equalsIgnoreCase(courseName)) {
                System.out.println("\nCourse found:");
                System.out.println("Course Name: " + courseNames[i] + ", Credit Hours: " + creditHours[i] + ", Semester: " + semesters[i] + ", Lecture Day: " + lectureDays[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found.");
        }
    }
}
