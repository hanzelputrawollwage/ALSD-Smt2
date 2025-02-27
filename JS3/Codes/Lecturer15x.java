public class Lecturer15x {
    String id;
    String name;
    boolean gender;
    int age;
    
    public Lecturer15x() {

    }

    public Lecturer15x(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Age: " + age);
        System.out.println("=========================================");
    }

}