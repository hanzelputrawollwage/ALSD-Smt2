import java.util.Scanner;

public class ArrayJS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaMk = { "Pancasila", "KTI", "CTPS", "Matdas", "Bhs Inggris", "Daspro", "K3", "Praktikum Daspro" };
        int[] sks = { 2, 3, 2, 4, 2, 3, 2, 3 };
        int[] nilaiAngka = new int[namaMk.length];
        double[] bobotNilai = new double[namaMk.length];

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < namaMk.length; i++) {
            while (true) {
                System.out.print("Masukkan nilai angka untuk MK " + namaMk[i] + " : ");
                if (!sc.hasNextInt()) {
                    System.out.println("Harap masukkan angka yang valid!");
                    sc.next(); 
                    continue;
                }

                int nilai = sc.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Angka Invalid! Harap masukkan angka antara 0 - 100.");
                } else {
                    nilaiAngka[i] = nilai;

                    if (nilai >= 80) {
                        bobotNilai[i] = 4.0;
                    } else if (nilai >= 73) {
                        bobotNilai[i] = 3.5;
                    } else if (nilai >= 65) {
                        bobotNilai[i] = 3.0;
                    } else if (nilai >= 60) {
                        bobotNilai[i] = 2.5;
                    } else if (nilai >= 50) {
                        bobotNilai[i] = 2.0;
                    } else if (nilai >= 39) {
                        bobotNilai[i] = 1.0;
                    } else {
                        bobotNilai[i] = 0.0;
                    }
                    break;
                }
            }
        }

        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai ");
        System.out.println("================================");
        System.out.printf("%-20s %-12s %-12s %-5s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        int totalSks = 0;

        for (int i = 0; i < namaMk.length; i++) {
            String nilaiHuruf = "";

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            totalBobot += bobotNilai[i] * sks[i];
            totalSks += sks[i];
            System.out.printf("%-20s %-12d %-12s %-5.2f\n", namaMk[i], nilaiAngka[i], nilaiHuruf, bobotNilai[i]);
        }

        double ipSemester = totalBobot / totalSks;

        System.out.println("================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        System.out.println("================================");

        sc.close();
    }
}
