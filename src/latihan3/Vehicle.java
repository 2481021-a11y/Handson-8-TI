public class Vehicle {
    // Properties
    protected String merk;
    protected String model;
    protected int tahunProduksi;
    protected String nomorPolisi;
    protected double hargaRentalPerHari;
    protected boolean tersedia;

    // Constructor
    public Vehicle(String merk, String model, int tahunProduksi,
                   String nomorPolisi, double hargaRentalPerHari) {
        // TODO: Implementasi
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.nomorPolisi = nomorPolisi;
        this.hargaRentalPerHari = hargaRentalPerHari;
        this.tersedia = true; // kendaraan tersedia secara default
    }

    // Method untuk rental
    public double hitungBiayaRental(int jumlahHari) {
        // TODO: Return harga rental * jumlah hari
        return hargaRentalPerHari * jumlahHari;
    }

    // Method displayInfo
    public void displayInfo() {
        // TODO: Display info vehicle
        // TODO: Display info vehicle
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Nomor Polisi: " + nomorPolisi);
        System.out.println("Harga Rental per Hari: Rp " + hargaRentalPerHari);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Under Maintenance"));
        System.out.println("---------------------------------");
    }

    // Getters and setters
    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
