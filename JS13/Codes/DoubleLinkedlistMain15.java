public class DoubleLinkedlistMain15 {
    public static void main(String[] args) {
        DoubleLinkedlist15 dll = new DoubleLinkedlist15();
        dll.print();
        dll.addFirst(new Student15("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student15("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student15("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student15("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student15("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student15("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }
}