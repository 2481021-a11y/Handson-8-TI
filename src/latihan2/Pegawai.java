public class Pegawai {
    // Properties
    protected String nip;
    protected String nama;
    protected String jurusan;

    // Constructor
    public Pegawai(String nip, String nama, String jurusan) {
        // TODO: Implementasi
    }

    // Method untuk di-override
    public void displayInfo() {
        // TODO: Print info pegawai
    }

    // Method clone dengan return type Pegawai
    public Pegawai clone() {
        // TODO: Return new Pegawai dengan data yang sama
        return null;
    }

    // Protected method untuk ditest widening
    protected void methodProtected() {
        // TODO: Print "Protected method in Pegawai"
    }

    // Final method - tidak bisa di-override
    public final void calculateSalary() {
        // TODO: Print "Menghitung gaji pegawai..."
    }

    @Override
    public String toString() {
        // TODO: Override toString()
        return "";
    }
}
