/*
Nim  : D1041241012
Nama : Eva Safitri
Program untuk memvalidasi username dan password
 */

public class LatihanLogin {
    public static void main(String[] args) {
        System.out.println(" === VALIDASI LOGIN === ");
        String inputUsername = "admin";
        String inputPassword = "eva";
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");

        if (inputUsername.equals("admin")) {
            System.out.println("Username valid");
            if (inputPassword.equals("admin123")) {
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            } else {
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }
    }
}
