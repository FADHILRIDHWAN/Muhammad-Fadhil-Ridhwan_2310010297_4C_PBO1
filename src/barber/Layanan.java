package barber;

public class Layanan  {
    private String nama;
    private int harga;
    private int durasi; // dalam menit

    public Layanan(String nama, int harga, int durasi) {
        this.nama = nama;
        this.harga = harga;
        this.durasi = durasi;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getDurasi() {
        return durasi;
    }

    public void deskripsiLayanan() {
        System.out.println(nama + " - Rp" + harga + " - " + durasi + " menit");
    }
}

    

