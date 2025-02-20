public class Course15 {
    String courseID;
    String name;
    int credit;
    int hour;

    void print() {
        System.out.println("Course ID : "+courseID);
        System.out.println("Name : "+name);
        System.out.println("Credit : "+credit);
        System.out.println("Hour : "+hour);
        System.out.println();
    }

    public Course15() {
        // default constructor
        // allows obj. created without parameters
    }

    public Course15(String courseID, String name, int credit, int hour) {
        // parameterized constructor
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
    }

    void addHour(int hour) {
        this.hour += hour;
    }

    void reduceHour(int hour) {
        this.hour -= hour;
    }
}
