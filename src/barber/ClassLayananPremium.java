package barber;
class LayananPremium extends Layanan {
    public LayananPremium(String nama, int harga, int durasi) {
        super(nama, harga, durasi);
    }

    @Override
    public void deskripsiLayanan() {
        System.out.println("[PREMIUM] " + getNama() + " - Rp" + getHarga() + " - " + getDurasi() + " menit");
    }
}
