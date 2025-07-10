package barber;

public class Pelanggan {  
     private String nama;
    private String noHP;
    private Layanan layanan;

    public Pelanggan(String nama, String noHP, Layanan layanan) {
        this.nama = nama;
        this.noHP = noHP;
        this.layanan = layanan;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }
}

    

