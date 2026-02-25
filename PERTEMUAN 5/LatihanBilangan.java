/*
Nim  : D1041241012
Nama : Eva Safitri
Program 
 */

public class LatihanBilangan {
    public static void main(String[] args) {
        System.out.println(" === PEMERIKSAAN BILANGAN === ");
        int bilangan = 0;
        String jenis;
        if (bilangan > 0) {
            jenis = "Bilangan positif";
            //System.out.println(" === PEMERIKSAAN BILANGAN === ");
        } else if (bilangan < 0) {
            jenis = "Bilangan negatif";
        } else {
            jenis = "Bilangan nol";
        }
        System.out.println("Bilangan: " + bilangan);
        System.out.println("Jenis: " + jenis);
        System.out.println("Tipe: " + ((bilangan % 2 == 0) ? "Genap" : "Ganjil"));
    }
}
