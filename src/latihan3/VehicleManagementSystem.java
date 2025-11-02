import java.util.ArrayList;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");

        // Latihan 1: Create vehicle fleet
        // - Buat 3 Mobil: Toyota Avanza, Honda Jazz, Suzuki Ertiga
        // - Buat 2 Motor: Honda Beat, Yamaha NMAX
        // - Set harga rental per hari untuk masing-masing

        // Ekspektasi Output:
        // Fleet created: 5 vehicles
        ArrayList<Vehicle> fleet = new ArrayList<>();

        Car car1 = new Car("Toyota", "Avanza", 2020, "B1234AV", 300000, 7, "Automatic", true);
        Car car2 = new Car("Honda", "Jazz", 2019, "B5678JZ", 350000, 5, "Automatic", true);
        Car car3 = new Car("Suzuki", "Ertiga", 2021, "B9012ER", 320000, 7, "Manual", false);

        Motorcycle motor1 = new Motorcycle("Honda", "Beat", 2022, "B1111BT", 100000, "Matic", 110);
        Motorcycle motor2 = new Motorcycle("Yamaha", "NMAX", 2023, "B2222NM", 150000, "Sport", 155);

        fleet.add(car1);
        fleet.add(car2);
        fleet.add(car3);
        fleet.add(motor1);
        fleet.add(motor2);

        System.out.println("Fleet created: " + fleet.size() + " vehicles\n");

        // Latihan 2: Display all vehicles
        // - Loop semua kendaraan
        // - Display info lengkap masing-masing

        // Ekspektasi Output:
        // [Info detail untuk setiap kendaraan]
        for (Vehicle v : fleet) {
            v.displayInfo();
        }

        // Latihan 3: Rent a vehicle
        // - Customer "Andi" rental Toyota Avanza selama 3 hari
        // - Calculate total biaya
        // - Display rental details

        // Ekspektasi Output:
        // Rental untuk: Andi
        // Kendaraan: Toyota Avanza (Mobil)
        // Durasi: 3 hari
        // Biaya per hari: Rp 300,000
        // Total biaya: Rp 900,000
        RentalTransaction r1 = new RentalTransaction("Andi", car1, 3);
        r1.displayRentalDetails();

        // Latihan 4: Calculate monthly revenue
        // - Rent beberapa kendaraan
        // - Calculate total revenue bulan ini

        // Ekspektasi Output:
        // Total revenue bulan ini: Rp 5,400,000
        RentalTransaction r2 = new RentalTransaction("Budi", car2, 5);
        RentalTransaction r3 = new RentalTransaction("Citra", motor1, 7);
        RentalTransaction r4 = new RentalTransaction("Dina", car3, 4);
        RentalTransaction r5 = new RentalTransaction("Eko", motor2, 6);

        double totalRevenue = r1.getTotalBiaya() + r2.getTotalBiaya() + r3.getTotalBiaya() + r4.getTotalBiaya() + r5.getTotalBiaya();

        System.out.println("Total revenue bulan ini: Rp " + totalRevenue + "\n");

        // Latihan 5: Vehicle maintenance
        // - Mark beberapa kendaraan sebagai "under maintenance"
        // - Display available vehicles only

        // Ekspektasi Output:
        // Available vehicles: 3
        // Under maintenance: 2
        car2.setTersedia(false);
        motor1.setTersedia(false);

        int available = 0;
        int maintenance = 0;
        for (Vehicle v : fleet) {
            if (v.isTersedia()) available++;
            else maintenance++;
        }

        System.out.println("Available vehicles: " + available);
        System.out.println("Under maintenance: " + maintenance + "\n");

        // Latihan 6: Find vehicles by criteria
        // - Find all Mobil dengan harga < Rp 350,000/hari
        // - Find all Motor jenis "matic"

        // Ekspektasi Output:
        // Found 2 Mobil sesuai kriteria
        // Found 1 Motor matic
        int foundCar = 0;
        int foundMotor = 0;

        for (Vehicle v : fleet) {
            if (v instanceof Car && v.hargaRentalPerHari < 350000) {
                foundCar++;
            } else if (v instanceof Motorcycle) {
                Motorcycle m = (Motorcycle) v;
                if (m.getJenisMotor().equalsIgnoreCase("matic")) {
                    foundMotor++;
                }
            }
        }

        System.out.println("Found " + foundCar + " Mobil sesuai kriteria");
        System.out.println("Found " + foundMotor + " Motor matic\n");

        // Latihan 7: Generate rental report
        // - Display summary rental bulan ini
        // - Group by vehicle type
        // - Show total revenue per type

        // Ekspektasi Output:
        // === RENTAL REPORT ===
        // Mobil: 15 rentals, Rp 4,200,000
        // Motor: 8 rentals, Rp 1,200,000
        // Total: Rp 5,400,000
        double totalCar = 0, totalMotor = 0;
        int countCar = 0, countMotor = 0;

        RentalTransaction[] list = {r1, r2, r3, r4, r5};
        for (RentalTransaction r : list) {
            if (r.getKendaraan() instanceof Car) {
                totalCar += r.getTotalBiaya();
                countCar++;
            } else if (r.getKendaraan() instanceof Motorcycle) {
                totalMotor += r.getTotalBiaya();
                countMotor++;
            }
        }

        System.out.println("=== RENTAL REPORT ===");
        System.out.println("Mobil: " + countCar + " rentals, Rp " + totalCar);
        System.out.println("Motor: " + countMotor + " rentals, Rp " + totalMotor);
        System.out.println("Total: Rp " + (totalCar + totalMotor));
    }
}
