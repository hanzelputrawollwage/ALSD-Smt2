public class CourseMain15 {
    public static void main(String[] args) {
        // use default constructor without parameters
        Course15 crs1 = new Course15();
        crs1.courseID = "RTI001";
        crs1.name = "Pancasila";
        crs1.credit = 2;
        crs1.hour = 3;

        crs1.changeCredit(3); // credit from 2 to 3
        crs1.addHour(1); // hour 3+1 =4
        crs1.reduceHour(5); // hour 4-5 = -1
        crs1.addHour(6); // hour -1+6 = 5 // total hour will be 5
        crs1.print();

        // using parameterized constructor
        Course15 crs2 = new Course15("RTI002", "Data Base", 4, 6);
        crs2.changeCredit(5); // credit from 4 to 5
        crs2.addHour(1); // hour 6+1 = 7
        crs2.reduceHour(8); // hour 7-8 = -1
        crs2.addHour(7); // hour -1+7 = 6 // total hour will be 6
        crs2.print();

        // using parameterized constructor
        Course15 crs3 = new Course15("RTI003", "ALSD", 4, 6);
        crs3.changeCredit(6); // credit from 4 to 6
        crs3.addHour(6); // hour 6+6 = 12
        crs3.reduceHour(9); // hour 12-9 = 3
        crs3.addHour(4); // hour 3+4 = 7 // total hour will be 7
        crs3.print();
    }
}
