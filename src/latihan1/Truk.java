package latihan1;

public class Truk {
    public Truk(String mitsubishi, String putih, int i, double v, int i1) {
    }

    public class truk extends Kendaraan {
        // Properties tambahan
        private double kapasitasMuatan; // dalam ton
        private int jumlahRoda;

        // Constructor
        public truk(String merk, String warna, int tahunProduksi, double kapasitasMuatan, int jumlahRoda) {
            // TODO: Implementasi constructor
        }

        // Override method
        @Override
        public void displayInfo() {
            // TODO: Override dan tambahkan info Truk
        }

        @Override
        public void klakson() {
            // TODO: Panggil super.klakson() dulu
            // TODO: Kemudian print "HONK HONK! (suara klakson truk yang lebih keras)"
        }
    }
}
