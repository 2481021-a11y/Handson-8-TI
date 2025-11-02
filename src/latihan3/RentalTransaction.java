public class RentalTransaction {
    // Properties
    private String namaPelanggan;
    private Vehicle kendaraan;
    private int durasiHari;
    private double totalBiaya;

    // Constructor
    public RentalTransaction(String namaPelanggan, Vehicle kendaraan, int durasiHari) {
        // TODO: Implementasi
        this.namaPelanggan = namaPelanggan;
        this.kendaraan = kendaraan;
        this.durasiHari = durasiHari;
        // TODO: Calculate total biaya
        this.totalBiaya = kendaraan.hitungBiayaRental(durasiHari);
        kendaraan.setTersedia(false);
    }

    // Method display rental details
    public void displayRentalDetails() {
        // TODO: Print detail rental
        System.out.println("Rental untuk: " + namaPelanggan);
        System.out.println("Kendaraan: " + kendaraan.merk + " (" + kendaraan.getClass().getSimpleName() + ")");
        System.out.println("Durasi: " + durasiHari + " hari");
        System.out.println("Biaya per hari: Rp " + kendaraan.hargaRentalPerHari);
        System.out.println("Total biaya: Rp " + totalBiaya);
        System.out.println("---------------------------------");
    }

    // Getters
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}
