/*
Nim  : D1041241012
Nama : Eva Safitri
Program 
 */

public class LatihanDiskon {
    public static void main(String[] args) {
        System.out.println(" === KALKULATOR DISKON === ");
        double totalBelanja = 750000.0;
        String diskon;
        double hargaDiskon;
        if (totalBelanja < 100000) {
            diskon = "(0%)";
            hargaDiskon = 0;
        } else if (totalBelanja >= 100000 && totalBelanja <= 499999) {
            diskon = "(5%)";
            hargaDiskon = totalBelanja * 5 / 100;
        } else if (totalBelanja >= 500000 && totalBelanja <= 999999) {
            diskon = "(10%)";
            hargaDiskon = totalBelanja * 10 / 100;
        } else {
            diskon = "(15%)";
            hargaDiskon = totalBelanja * 15 / 100;
        }
        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon " + diskon + ": Rp " + hargaDiskon);
        System.out.println("Harga akhir: " + (totalBelanja - hargaDiskon));
        System.out.println("Anda hemat: " + hargaDiskon);
    } 
}
