public class LecturerData15x {
    Lecturer15x[] LecturerData15;
    int idx;

    public LecturerData15x() {
        LecturerData15 = new Lecturer15x[5];
        idx = 0;
    }

    public void add(Lecturer15x dsn) {
        if (idx < LecturerData15.length) {
            LecturerData15[idx] = dsn;
            idx++;
        } else {
            System.out.println("Too many data");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            LecturerData15[i].print();
        }
    }

    public void sortingAscending() { // bubble sort (young to old)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (LecturerData15[j].age > LecturerData15[j + 1].age) {
                    Lecturer15x temp = LecturerData15[j];
                    LecturerData15[j] = LecturerData15[j + 1];
                    LecturerData15[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDescending() { // selection sort (old to young)
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (LecturerData15[j].age > LecturerData15[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer15x temp = LecturerData15[maxIdx];
            LecturerData15[maxIdx] = LecturerData15[i];
            LecturerData15[i] = temp;
        }
    }

    public void sequentialSearch(String name) { //Add new method called sequentialSearch
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (LecturerData15[i].name.equalsIgnoreCase(name)) {
                LecturerData15[i].print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Lecturer with name : "+name+" , not found.");
        }
    }

    public void binarySearch(int targetAge) { //Add new method called binarySearch
        sortingAscending();
        
        int left = 0, right = idx - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (LecturerData15[mid].age == targetAge) {
                found = true;
                LecturerData15[mid].print();

                int i = mid - 1;
                while (i >= 0 && LecturerData15[i].age == targetAge) {
                    LecturerData15[i].print();
                    i--;
                }

                i = mid + 1;
                while (i < idx && LecturerData15[i].age == targetAge) {
                    LecturerData15[i].print();
                    i++;
                }
                break;
            } else if (LecturerData15[mid].age < targetAge) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Lecturer with age "+targetAge+" , not found");
        }
    }
}
