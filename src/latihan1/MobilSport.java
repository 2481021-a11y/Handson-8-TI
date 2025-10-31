package latihan1;

public class MobilSport {
    public MobilSport(String ferrari, String merah, int i, int i1, String bensin, boolean b, int i2) {
    }

    public void displayInfo() {
        return;
    }

    public String getNomorRangka() {
        return null;
    }

    public void aktifkanTurbo() {
        return;
    }

    public class mobilSport extends Mobil {
        // Properties tambahan
        private boolean turbo;
        private int kecepatanMaksimal;

        // Constructor
        public mobilSport(String merk, String warna, int tahunProduksi,
                          int jumlahPintu, String jenisBahanBakar,
                          boolean turbo, int kecepatanMaksimal) {
            super();
            // TODO: Implementasi constructor
        }

        // Override method
        @Override
        public void displayInfo() {
            // TODO: Override dan tambahkan info MobilSport
        }

        // Method khusus MobilSport
        public void aktifkanTurbo() {
            // TODO: Print "TURBO DIAKTIFKAN! [merk] melaju dengan kecepatan maksimal!"
        }
    }
}
