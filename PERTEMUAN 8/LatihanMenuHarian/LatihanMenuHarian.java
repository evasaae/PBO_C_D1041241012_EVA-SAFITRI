/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk menampilkan menu makan untuk 3 hari, masing-masing dengan 2 waktu makan (pagi dan siang).
*/
public class LatihanMenuHarian {
     public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for (int i = 1; i<=3; i++) {
            System.out.println("Hari " + i + ":");
            switch (i) {
                case 1:
                    System.out.println("Pagi: Nasi Goreng" );
                    System.out.println("Siang: Soto Ayam");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Pagi: Bubur Ayam" );
                    System.out.println("Pagi: Mie goreng" );
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Pagi: Roti Bakar" );
                    System.out.println("Pagi: Nasi Uduk" );
                    System.out.println();
                    break;   
            }
        }
    }
}
