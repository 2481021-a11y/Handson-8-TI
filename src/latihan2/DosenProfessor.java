public class DosenProfessor extends Dosen {
    // Properties tambahan
    private String gelarProfesor;
    private int jumlahPenelitian;

    // Constructor
    public DosenProfessor(String nip, String nama, String jurusan,
                          String mataKuliah, int pengalamanMengajar,
                          String gelarProfesor, int jumlahPenelitian) {
        // TODO: Implementasi
    }

    // Override displayInfo (chain dari Dosen)
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info profesor
    }
}
