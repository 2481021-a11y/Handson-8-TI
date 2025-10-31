public class Mahasiswa {
    // Properties
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        // TODO: Implementasi
    }

    // Override toString
    @Override
    public String toString() {
        // TODO: Return string representation
        return "";
    }

    // Override equals - compare by NIM
    @Override
    public boolean equals(Object obj) {
        // TODO: Implementasi equals berdasarkan NIM
        return false;
    }

    // Override hashCode (best practice dengan equals)
    @Override
    public int hashCode() {
        // TODO: Return hash dari NIM
        return 0;
    }
}
