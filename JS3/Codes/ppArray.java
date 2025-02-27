import java.util.Scanner;
public class ppArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num rectangle : "); //add num with scanner
        int num = sc.nextInt(); // integer num w scanner

        Rectangle[] rectangleArray = new Rectangle[num]; //change the refrence with num
        
        for (int i =0; i<num; i++) { //change the 3 to num
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle "+i);

            System.out.print("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input Width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i=0; i < num; i++) { // change to num
            System.out.println("Rectangle "+i);
            System.out.println("Width : "+rectangleArray[0].width+ ", length : "+rectangleArray[0].length);
        }
        sc.close();

        
    }
}