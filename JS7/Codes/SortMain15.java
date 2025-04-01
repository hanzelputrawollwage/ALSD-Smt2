public class SortMain15 {
    public static void main(String args[]) {
        MergeSort15 sorter = new MergeSort15();
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        sorter.printArray(data);

        sorter.mergeSort(data);

        System.out.println("Sorted Data");
        sorter.printArray(data);
    }
}