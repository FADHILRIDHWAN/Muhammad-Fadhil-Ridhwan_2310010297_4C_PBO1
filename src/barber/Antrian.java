package barber;
import java.util.LinkedList;

public class Antrian {
  
    private LinkedList<Pelanggan> daftarAntrian = new LinkedList<>();
    private int totalPemasukan = 0;

    public void tambahAntrian(Pelanggan p) {
        daftarAntrian.add(p);
        System.out.println("\n> " + p.getNama() + " berhasil masuk ke antrian.");
    }

    public void tampilkanAntrian() {
        if (daftarAntrian.isEmpty()) {
            System.out.println("\n> Belum ada antrian.");
            return;
        }
        System.out.println("\n--- Daftar Antrian ---");
        int i = 1;
        for (Pelanggan p : daftarAntrian) {
            System.out.println(i++ + ". " + p.getNama() + " - " + p.getLayanan().getNama());
        }
    }

    public void prosesBerikutnya() {
        if (daftarAntrian.isEmpty()) {
            System.out.println("\n> Tidak ada antrian.");
            return;
        }
        Pelanggan p = daftarAntrian.poll();
        totalPemasukan += p.getLayanan().getHarga();
        System.out.println("\n> Melayani: " + p.getNama());
        System.out.println("  Layanan: " + p.getLayanan().getNama());
        System.out.println("  Biaya  : Rp" + p.getLayanan().getHarga());
    }

    public int getTotalPemasukan() {
        return totalPemasukan;
    }
}
    
    

