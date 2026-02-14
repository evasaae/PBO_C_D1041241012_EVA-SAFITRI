/*
Nim  : D1041241012
Nama : Eva Safitri
Program penggunaan operator aritmatika dasar
 */

public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        System.out.println(" === INFORMASI PRODUK === ");
       String namaProduk = "Laptop Asus";
       int hargaSatuan = 7000000;
       int jumlahStok = 15;
       boolean statusTersedia = true;
        System.out.println("Nama Produk : " + namaProduk);
         System.out.println("Harga Satuan : " + hargaSatuan);
          System.out.println("Jumlah Stok : " + jumlahStok);
           System.out.println("Status Tersedia : " + statusTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok : " + (hargaSatuan * jumlahStok));
        System.out.println("Pajak (11%): Rp " + (long) ((hargaSatuan * jumlahStok) * PAJAK));
    }
}