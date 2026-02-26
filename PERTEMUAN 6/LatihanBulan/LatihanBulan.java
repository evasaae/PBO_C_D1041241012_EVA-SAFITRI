/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk mengonversi angka (1-12) menjadi nama bulan.
 */

package LatihanBulan;

public class LatihanBulan {
    public static void main(String[] args) {
        System.out.println("=== KONVERSI BULAN ===");

        int month = 5;
        String monthName;
        System.out.println("Angka bulan: " + month);
        switch (month) {
            case 1:
                monthName = "Januari";
                break;
            case 2:
                monthName = "Februari";
                break;
            case 3:
                monthName = "Maret";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "Mei";
                break;
            case 6:
                monthName = "Juni";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "Agustus";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Oktober";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Desember";
                break;
            default:
                monthName = "Angka bulan tidak valid (1-12)";
        }
        if (month > 0 && month < 13) System.out.println("Angka bulan: " + monthName);
        else System.out.println("Error: " + monthName);
    }
}
