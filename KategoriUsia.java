import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int usia;s
        String kategori;

        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();

        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else if (usia >= 65) {
            kategori = "Lansia";
        } else {
            kategori = "Invalid Number";
        }

        System.out.println(usia + " termasuk dalam kategori: " + kategori);
        
    }
}
