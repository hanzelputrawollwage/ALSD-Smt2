public class LecturerData15 {
    Lecturer15[] LecturerData15;
    int idx;

    public LecturerData15() {
        LecturerData15 = new Lecturer15[5];
        idx = 0;
    }

    public void add(Lecturer15 dsn) {
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

    public void sortingAscending() { //bubble sort (young to old)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (LecturerData15[j].age > LecturerData15[j + 1].age) {
                    Lecturer15 temp = LecturerData15[j];
                    LecturerData15[j] = LecturerData15[j + 1];
                    LecturerData15[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDescending() { //selection sort (old to young)
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (LecturerData15[j].age > LecturerData15[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer15 temp = LecturerData15[maxIdx];
            LecturerData15[maxIdx] = LecturerData15[i];
            LecturerData15[i] = temp;
        }
    }
}
