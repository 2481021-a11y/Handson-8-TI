public class Car extends Vehicle {
    // Properties tambahan
    private int jumlahPenumpang;
    private String tipeTransmisi; // "Manual", "Automatic"
    private boolean acTersedia;

    // Constructor
    public Car(String merk, String model, int tahunProduksi, String nomorPolisi,
               double hargaRentalPerHari, int jumlahPenumpang,
               String tipeTransmisi, boolean acTersedia) {
        // TODO: Implementasi dengan super
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jumlahPenumpang = jumlahPenumpang;
        this.tipeTransmisi = tipeTransmisi;
        this.acTersedia = acTersedia;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info Car
        super.displayInfo();
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Tipe Transmisi: " + tipeTransmisi);
        System.out.println("AC Tersedia: " + (acTersedia ? "Ya" : "Tidak"));
        System.out.println("---------------------------------");
    }

    // Override biaya rental (Car bisa punya surcharge)
    @Override
    public double hitungBiayaRental(int jumlahHari) {
        // TODO: Implementasi dengan possible surcharge untuk AC
        return 0;
    }
}
