public class Student15Assignment {
    String nim, name, className;
    
    public Student15Assignment() {

    }

    public Student15Assignment(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className);
    }
}
