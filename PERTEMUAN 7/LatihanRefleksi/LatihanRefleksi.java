/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk menampilkan hasil yang sama menggunakan while, do-while, dan for loop.
 */
package LatihanRefleksi;

public class LatihanRefleksi {
    public static void main(String[] args) {
        //Latihan menggunakan While
        System.out.println("=== MENGGUNAKAN WHILE ===");
        int angkaWhile = 1;
        while (angkaWhile <= 5) {
            System.out.println(angkaWhile);
            angkaWhile++;
        }
        System.out.println();

        //Latihan menggunakan Do-While
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        int angkaDoWhile = 1;
        do {
            System.out.println(angkaDoWhile);
            angkaDoWhile++;
        } while (angkaDoWhile <= 5);
        System.out.println();

        //Latihan menggunakan For
        System.out.println("=== MENGGUNAKAN FOR ===");
        for(int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}
/*Menurut saya, jenis loop yang paling mudah dipahami yaitu For loop. Karena, dalam For langsung berisi 
inisialisasi awal, batasan, dan aturan increment-nya. Jenis loop ini juga yang paling sering saya gunakan 
pada kelas kelas mengoding sebelumnya.
*/