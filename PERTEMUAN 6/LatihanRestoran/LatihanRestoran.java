/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk menampilkan menu restoran dan harga.
 */

package LatihanRestoran;

public class LatihanRestoran {
    public static void main(String[] args) {
        System.out.println("=== MENU RESTORAN ===");

        int menuCode = 1;
        int quantity =2;
        int total = 0;
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();
        System.out.println("Pesanan Anda:");
        
        switch (menuCode) {
            case 1:
                System.out.println("Nama Menu: Nasi Goreng");
                total = 15000;
                break;
            case 2:
                System.out.println("Nama Menu: Mie Ayam");
                total = 12000;
                break;
            case 3:
                System.out.println("Nama Menu: Bakso");
                total = 10000;
                break;
            case 4:
                System.out.println("Nama Menu: Soto Ayam");
                total = 13000;
                break;
            case 5:
                System.out.println("Nama Menu: Es Teh");
                total = 3000;
                break;
        }

        System.out.println("Harga Satuan: Rp " + total);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + (total*quantity));
    }
}
