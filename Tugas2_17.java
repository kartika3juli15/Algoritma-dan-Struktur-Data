import java.util.Scanner;

public class Tugas2_17{
    public static void hitungKecepatan() {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Masukkan jarak (s) dalam meter: ");
        double s = sc17.nextDouble();
        System.out.print("Masukkan waktu (t) dalam detik : ");
        double t = sc17.nextDouble();

        double v = s / t;
        System.out.println("Kecepatan (v) = " + v + " m/s");
    }

    public static void hitungJarak() {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v) dalam meter per sekon : ");
        double v = sc17.nextDouble();
        System.out.print("Masukkan waktu (t) dalam detik : ");
        double t = sc17.nextDouble();

        double s = v * t;
        System.out.println("Jarak (s) = " + s + " meter");
    }

    public static void hitungWaktu() {
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Masukkan jarak (s) dalam meter : ");
        double s = sc17.nextDouble();
        System.out.print("Masukkan kecepatan (v) dalam meter per sekon : ");
        double v = sc17.nextDouble();

        double t = s / v;
        System.out.println("Waktu (t) = " + t + " sekon");

    }
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih : ");
        int pilihan = sc17.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

   
