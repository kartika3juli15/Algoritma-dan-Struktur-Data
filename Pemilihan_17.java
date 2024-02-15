import java.util.Scanner;
public class Pemilihan_17{
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        
    double nilaitugas, nilaikuis, nilaiUTS, nilaiUAS, nilaiakhir;
    String setara;

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");
    System.out.print("Masukkan nilai tugas: ");
    nilaitugas = sc17.nextDouble();
    System.out.print("Masukkan nilai kuis: ");
    nilaikuis = sc17.nextDouble();
    System.out.print("Masukkan nilai UTS: ");
    nilaiUTS = sc17.nextDouble();
    System.out.print("Masukkan nilai UAS: ");
    nilaiUAS = sc17.nextDouble(); 

    if (!hasil (nilaitugas) || !hasil(nilaikuis) || !hasil(nilaiUTS) || !hasil(nilaiUAS)){
        System.out.println("Nilai yang di input tidak valid");
        return;
    }

    nilaiakhir = (0.2 * nilaitugas) + (0.2 * nilaikuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
    if (nilaiakhir >= 80) {
        setara = "A";
    } else if (nilaiakhir >= 75) {
        setara = "B+";
    } else if (nilaiakhir >= 70) {
        setara = "B";
    } else if (nilaiakhir >= 65) {
        setara = "C+";
    } else if (nilaiakhir >= 60) {
        setara = "C";
    }else if (nilaiakhir >= 50){
        setara = "D";
    }else {
        setara = "E";
    }

    System.out.println("===============================");
    System.out.println("Nilai Akhir = " + nilaiakhir);
    System.out.println("Nilai Huruf = " + setara);
    System.out.println("===============================");

    if (setara == "D"){
        System.out.println("ANDA TIDAK LULUS");
    } else if (setara == "E"){
        System.out.println("ANDA TIDAK LULUS");
    }else {
        System.out.println("ANDA DINYATAKAN LULUS!");
    }
    sc17.close();
}

public static boolean hasil(double nilai) {
        return nilai >= 0 && nilai <= 100;
}
    }
