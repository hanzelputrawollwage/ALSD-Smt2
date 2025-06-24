public class BinaryTreeArray15 {
    Student15[] data;
    int idxLast;

    public BinaryTreeArray15() {
        data = new Student15[10];
        idxLast = -1;
    }

    void populateData(Student15[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }
}
