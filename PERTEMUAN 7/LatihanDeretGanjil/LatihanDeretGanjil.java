/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk menampilkan bilangan ganjil dari 1 sampai 15 menggunakan while loop.
 */
package LatihanDeretGanjil;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
         System.out.println("=== BILANGAN GANJIL 1-15 ===");
         int angka = 1;
         while (angka <= 15) {
            System.out.println(angka + " ");
            angka+=2;
         }
    }
}
