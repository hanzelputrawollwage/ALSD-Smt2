public class SortingMain15 {
    public static void main(String[] args) {
        int[] a = {34,7,23,32,5,62};
        //declare an array named b[]
        int[] b = {30,20,2,8,14};
        //declare an array named c[]
        int[] c = {40,10,4,9,3};

        Sorting15 sorting1 = new Sorting15(a);
        //create a new obj (B)
        Sorting15 sorting2 = new Sorting15(b);
        //create a new obj (C)
        Sorting15 sorting3 = new Sorting15(c);

        System.out.println("\nOriginal array : ");
        sorting1.print();
        sorting1.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting1.print();

        //call for sorting 2
        System.out.println("\nOriginal array : ");
        sorting2.print();
        sorting2.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting2.print();

        // call for sorting 3
        System.out.println("\nOriginal array : ");
        sorting3.print();
        sorting3.bubbleSort();
        System.out.println("Sorted array (Bubble Sort) : ");
        sorting3.print();
    }
}