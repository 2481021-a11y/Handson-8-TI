package latihan1;

public class Motor {
    public Motor(String honda, String merah, int i, String sport) {
    }

    public void klakson() {
    }

    public void lakukanWheely() {
    }

    public class motor extends Kendaraan {
        // Properties tambahan
        private String jenisMotor; // "sport", "matic", "bebek"
        private boolean hadRemCakram;

        // Constructor
        public motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
            // TODO: Implementasi constructor dengan super
        }

        // Override method
        @Override
        public void displayInfo() {
            // TODO: Implementasi dengan memanggil super dan menambahkan info Motor
        }

        @Override
        public void klakson() {
            // TODO: Print "Tiiin tiiin! (suara motor)"
        }

        // Method khusus Motor
        public void lakukanWheely() {
            // TODO: Print "[merk] melakukan wheelie!"
        }
    }
}
