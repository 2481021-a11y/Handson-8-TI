public class Dosen extends Pegawai {
    // Properties tambahan
    private String mataKuliah;
    private int pengalamanMengajar;

    // Constructor
    public Dosen(String nip, String nama, String jurusan,
                 String mataKuliah, int pengalamanMengajar) {
        // TODO: Implementasi dengan super
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Override dengan info dosen
    }

    // Override clone dengan covariant return type
    @Override
    public Dosen clone() {
        // TODO: Return new Dosen
        return null;
    }

    // Override dengan widening access
    @Override
    public void methodProtected() {
        // TODO: Override dari protected ke public
    }
}
