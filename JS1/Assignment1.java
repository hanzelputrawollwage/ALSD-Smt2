import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char cityCode[] = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'N', 'T'}; 
        char cityNames[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        char choice;
        int index;

        while (true) {
            System.out.print("Input the City Code: ");
            choice = sc.next().toUpperCase().charAt(0);
            
            index = -1;
            for (int i = 0; i < cityCode.length; i++) {
                if (choice == cityCode[i]) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("City code not found. Try again.\n");
            } else {
                System.out.print("City Name: ");
                for (int i = 0; i < cityNames[index].length; i++) {
                    System.out.print(cityNames[index][i]);
                }
                System.out.println("\n");
                break;
            }
        }

        sc.close();
    }
}
