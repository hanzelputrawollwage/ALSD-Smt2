public class StudentKRS15 {
    String nim, name, studyProgram, className;

    public StudentKRS15(String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    public void print() {
        System.out.println(nim + " - " + name + " - " + studyProgram + " - " + className);
    }
}
