public class Lecturer15 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer15() {
        // default constructor
        // allows obj. created without parameters
    }
    
    public Lecturer15(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        // parameterized constructor
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    void print() {
        System.out.println("Lecturer ID : "+lecturerID);
        System.out.println("Name : "+name);
        System.out.println("Status : "+(status ? "Active" : "Inactive"));
        System.out.println("Year Started : "+startYear);
        System.out.println("Expertise Field : "+expertiseField);
        System.out.println();
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    int calculateTenure(int yearNow) {
        // if we want to return the calculation use "-" rather than "-="
        return yearNow - startYear;
    }

    void changeExpertiseField(String newField) {
        this.expertiseField = newField;
    }
}
