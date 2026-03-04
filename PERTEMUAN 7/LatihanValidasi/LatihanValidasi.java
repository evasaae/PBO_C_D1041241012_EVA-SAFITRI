/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk mensimulasikan validasi input nilai ujian (0-100) menggunakan do-while loop.
 */
package LatihanValidasi;

public class LatihanValidasi {
    public static void main(String[] args) {
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        int nilai = 0;
        int input = 1;
        do {
           if (input == 1) nilai = -10;
           else if (input == 2) nilai = 150;
           else if (input == 3) nilai = 85;

           System.out.println();
           System.out.println("Percobaan input: " + nilai);
           if (nilai >= 0 && nilai <= 100) 
                System.out.println("Nilai valid: " + nilai);
            else 
                System.out.println("Error: Nilai harus antara 0-100!");
            input++;
        } while (nilai < 0 || nilai > 100);
    }
}
