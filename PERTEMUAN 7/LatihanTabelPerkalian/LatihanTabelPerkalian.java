/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk menampilkan tabel perkalian untuk angka tertentu (misal 7) dari 1 sampai 12 menggunakan for loop.
 */
package LatihanTabelPerkalian;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        System.out.println("=== TABEL PERKALIAN 7 ===");
        int angka = 7;
        for (int i = 1; i <= 12; i++ ) {
            System.out.println(angka + " x " + i + " = " + (angka*i));
        }
    }
}
