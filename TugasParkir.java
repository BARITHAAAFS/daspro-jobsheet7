import java.util.Scanner;

public class TugasParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Enter vehicle type (1 Car, 2 Motorcycle, 0 Exit): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Enter parking duration (hours): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;          // tarif tetap untuk semua kendaraan
                } else if (jenis == 1) {
                    total += durasi * 3000;  // mobil
                } else if (jenis == 2) {
                    total += durasi * 2000;  // motor
                }
            }
        } while (jenis != 0);

        System.out.println("Total parking fee: Rp " + String.format(Locale.US, "%,d", total));
    }
}