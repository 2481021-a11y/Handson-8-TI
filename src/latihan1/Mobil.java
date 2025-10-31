package latihan1;

public class Mobil {
    public Mobil(String toyota, String hitam, int i, int i1, String bensin) {
        class mobil extends Kendaraan {
            // Properties tambahan
            private int jumlahPintu;
            private String jenisBahanBakar;

            // Constructor
            public mobil(String merk, String warna, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
                // TODO: Panggil constructor parent dengan super()
                // TODO: Inisialisasi properties tambahan
                // TODO: Print "Constructor Mobil dipanggil"
            }

            // Override method displayInfo
            @Override
            public void displayInfo() {
                // TODO: Panggil super.displayInfo() terlebih dahulu
                // TODO: Tambahkan informasi spesifik Mobil
            }

            // Method tambahan khusus Mobil
            public void nyalakanAC() {
                // TODO: Print "AC menyala"
            }

            // Getter
            public int getJumlahPintu() {
                return jumlahPintu;
            }
        }
    }

    public Mobil() {
    }

    public void displayInfo() {
    }

    public void nyalakanAC() {
    }
}
