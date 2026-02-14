
/*
Nim  : D1041241012
Nama : Eva Safitri
Program penggunaan operator aritmatika dasar
 */

public class LatihPerhitungan {
    public static void main(String[] args) {
        System.out.println(" === SIMULASI TRANSAKSI BANK === ");
        int saldo = 1000000;
        System.out.println("Saldo awal : " + saldo);
        saldo += 500000;
       // String nama = "Budi Santoso";
        System.out.println("Setoran : " + (saldo - 1000000));
        System.out.println("Saldo Setelah Setor Setor : " + saldo);
        int ssaldo = saldo;
        saldo -= 250000;
        System.out.println("Penarikan : " + (ssaldo - saldo));
        System.out.println("Saldo Akhir : " + saldo);
    }
}