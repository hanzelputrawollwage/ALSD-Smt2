public class StudentMain15 {

    public static void main(String[] args) {
        Student15 std1 = new Student15();
        std1.studentID = "244107020097";
        std1.name = "Tiara";
        std1.className = "TI-1I";
        std1.gpa = 3.8;
        std1.print();

        std1.changeClass("TI-2I");
        std1.updateGPA(3.9);
        std1.print();

        Student15 std2 = new Student15("244107020040", "Rizky", "TI-1I", 3.5);
        std2.updateGPA(3.3);
        std2.print();

        Student15 studentHanzel = new Student15("244107020157", "Hanzel", "TI-1I", 3.7);
        studentHanzel.updateGPA(3.8);
        studentHanzel.print();
    }
}