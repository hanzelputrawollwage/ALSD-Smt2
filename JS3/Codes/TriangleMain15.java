public class TriangleMain15 {
    public static void main(String[] args) {
        Triangle15[] trArray = new Triangle15[4];
        trArray[0] = new Triangle15(10,4);
        trArray[1] = new Triangle15(20,10);
        trArray[2] = new Triangle15(15,6);
        trArray[3] = new Triangle15(25,10);

        Triangle15.print(trArray);
    }
}
