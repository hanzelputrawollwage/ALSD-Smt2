public class TopStudent15 {
    Student15[] listStudent;
    int idx;

    public TopStudent15(int size) {
        listStudent = new Student15[5];
        idx = 0;
    }

    public void add(Student15 student) {
        if (idx < listStudent.length) {
            listStudent[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudent[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx-1; i++) {
            for (int j = 0; j < idx -i-1; j++) {
                if (listStudent[j].gpa < listStudent[j+1].gpa) {
                    Student15 temp = listStudent[j];
                    listStudent[j] = listStudent[j+1];
                    listStudent[j+1] = temp;
                }
            }
        }
    }
    //add selection sort method
    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudent[j].gpa < listStudent[minIndex].gpa) {
                    minIndex = j;
                }
            }
            // swap the found minimum element
            Student15 temp = listStudent[minIndex];
            listStudent[minIndex] = listStudent[i];
            listStudent[i] = temp;
        }
    }

    // add insertionSort() method
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student15 temp = listStudent[i];
            int j = i;

            while (j > 0 && listStudent[j-1].gpa < temp.gpa) { //change ">" to "<" for descending sorting 
                listStudent[j] = listStudent[j-1];
                j--;
            }
            listStudent[j] = temp;
        }
    }
} 