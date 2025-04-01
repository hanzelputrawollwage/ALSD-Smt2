public class SearchStudent15 {
    Student15[] listStd = new Student15[5];
    int idx = 0;

    public void add(Student15 std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }
    
    //add a new constructor for accepting the number of student with integer size
    public SearchStudent15(int size) {
        listStd = new Student15[size];
        idx = 0;
    }

    public void display() {
        for (int i = 0; i < idx; i++) {
            listStd[i].display();
            System.out.println("---------------------------");
        }
    }

    public int findSeqSearch(int search) {
        for (int i = 0; i < idx; i++) {
            if (listStd[i].nim == search) {
                return i;
            }
        }
        return -1;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }

    //add Binary Search
    public int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left+right) / 2;
            if (cari == listStd[mid].nim) {
                return (mid);
            } else if (listStd[mid].nim > cari) {
                return findBinarySearch(cari, left, mid -1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    } 
}
