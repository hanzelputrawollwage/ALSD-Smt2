public class LecturerData15x {

    public static void showAllLecturerData(Lecturer15x[] lecturerArray) {
        for (int i = 0; i <lecturerArray.length; i++) {
            lecturerArray[i].print();
        }
    }

    public static void countLecturerByGender(Lecturer15x[] lecturerArray) {
        int male = 0;
        int female = 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].gender) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Sum of Male Lecturer : "+male);
        System.out.println("Sum of Female Lecturer : "+female);
        System.out.println("=========================================");

    }

    public static void averageLecturerAgeByGender(Lecturer15x[] lecturerArray) {
        int male = 0, female = 0;
        int maleAgeTotal = 0, femaleAgeTotal = 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].gender) {
                maleAgeTotal += lecturerArray[i].age;
                male++;
            } else {
                femaleAgeTotal += lecturerArray[i].age;
                female++;
            }
        }

        double maleAvg = male > 0 ? (double) maleAgeTotal / male : 0;
        double femaleAvg = female > 0 ? (double) femaleAgeTotal / female : 0;

        System.out.println("Average Age of Male Lecturers: " + (male > 0 ? maleAvg : "No data"));
        System.out.println("Average Age of Female Lecturers: " + (female > 0 ? femaleAvg : "No data"));
        System.out.println("=========================================");

    }

    public static void showOldestLecturerInfo(Lecturer15x[] lecturerArray) {
        Lecturer15x oldest = lecturerArray[0];
        for (int i = 1; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age > oldest.age) {
                oldest = lecturerArray[i];
            }
        }
        oldest.print();
    }

    public static void showYoungestLecturerInfo(Lecturer15x[] lecturerArray) {
        Lecturer15x youngest = lecturerArray[0];
        for (int i = 1; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age < youngest.age) {
                youngest = lecturerArray[i];
            }
        }
        youngest.print();
    }
}