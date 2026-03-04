package LatihanKombinasiLoop;

public class LatihanKombinasiLoop {
     public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        int baris = 2;
        int kolom = 3;
        boolean stop = false;
        for (int i = 1; i<=3; i++) {
            for (int j = 1; j<=5; j++) {
                System.out.println("Cek: [" + i + "," + j + "]");
                if (i == baris && j == kolom) {
                    System.out.println("Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    stop = true;
                    break;
            }
            }
            if (stop == true) break;
            }
        }
     }
