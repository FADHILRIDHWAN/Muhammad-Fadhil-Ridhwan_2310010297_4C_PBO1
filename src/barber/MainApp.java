package barber;
import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Antrian antrian = new Antrian();

        Layanan[] daftarLayanan = new Layanan[4];
        daftarLayanan[0] = new Layanan("Pangkas Biasa", 15000, 20);
        daftarLayanan[1] = new Layanan("Undercut Style", 25000, 30);
        daftarLayanan[2] = new Layanan("Hairspa & Cukur", 40000, 45);
        daftarLayanan[3] = new LayananPremium("Cukur Premium + Masker", 60000, 60);

        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println("\n=== SISTEM ANTRIAN BARBERSHOP ===");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Layani Antrian Berikutnya");
            System.out.println("4. Tampilkan Total Pemasukan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka 1-5.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("\nNama Pelanggan: ");
                    String nama = input.nextLine();
                    System.out.print("No HP: ");
                    String noHP = input.nextLine();

                    System.out.println("\n--- Pilih Layanan ---");
                    for (int i = 0; i < daftarLayanan.length; i++) {
                        System.out.print((i + 1) + ". ");
                        daftarLayanan[i].deskripsiLayanan();
                    }

                    System.out.print("Pilih layanan (1-" + daftarLayanan.length + "): ");
                    int layananIndex;
                    try {
                        layananIndex = Integer.parseInt(input.nextLine()) - 1;
                        if (layananIndex < 0 || layananIndex >= daftarLayanan.length) {
                            System.out.println("Layanan tidak valid.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid untuk layanan.");
                        break;
                    }

                    Pelanggan pelanggan = new Pelanggan(nama, noHP, daftarLayanan[layananIndex]);
                    antrian.tambahAntrian(pelanggan);
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    antrian.prosesBerikutnya();
                    break;

                case 4:
                    System.out.println("\n> Total Pemasukan: Rp" + antrian.getTotalPemasukan());
                    break;

                case 5:
                    System.out.println("\nTerima kasih telah menggunakan sistem barbershop.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-5.");
            }
        }

        input.close();
    }
}