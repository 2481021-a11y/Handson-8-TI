package latihan1;

public class Kendaraan {
    // Properties
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    private String nomorRangka;

    // Constructor
    public Kendaraan(String merk, String warna, int tahunProduksi) {
        // TODO: Implementasi constructor
        // - Inisialisasi semua properties
        // - Print pesan "Constructor Kendaraan dipanggil"
    }

    public Kendaraan() {
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        // TODO: Print semua informasi kendaraan
    }

    // Method klakson
    public void klakson() {
        // TODO: Print "Tin tin!"
    }

    // Method untuk menghitung umur kendaraan
    public int hitungUmur() {
        // TODO: Return umur kendaraan (tahun sekarang - tahun produksi)
        return 0;
    }

    // Getter dan Setter
    public String getNomorRangka() {
        return nomorRangka;
    }

    public void setNomorRangka(String nomorRangka) {
        this.nomorRangka = nomorRangka;
    }
}
