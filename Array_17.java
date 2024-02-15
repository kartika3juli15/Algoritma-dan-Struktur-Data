import java.util.Scanner;

public class Array_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matkul = { "", "Critical Thinking dan Problem Solving", "Konsep Teknologi Informasi", "Dasar Pemrogaman", "Agama", 
        "Bahasa Inggris", "Matematika Dasar", "Praktikum Dasar Pemrograman ", "Bahasa Indonesia", "Pengantar Akuntansi dan Manajemen Bisnis" };
        int[] sks = { 0, 2, 2, 2, 2, 2, 2, 3, 2, 2};
        double[] nilai = new double[matkul.length];
        String[] indeks = new String[matkul.length];
        double[] setara = new double[matkul.length];
        int i;

        for (i = 1; i < matkul.length; i++) {
            System.out.print(i + ". Masukkan Nilai Angka untuk MK " + matkul[i] + " : ");
            nilai[i] = sc.nextDouble();
            if (nilai[i] >= 80) {
                indeks[i] = "A";
                setara[i] = 4;
            } else if (nilai[i] >= 75) {
                indeks[i] = "B+";
                setara[i] = 3.5;
            } else if (nilai[i] >= 70) {
                indeks[i] = "B";
                setara[i] = 3;
            } else if (nilai[i] >= 65) {
                indeks[i] = "C+";
                setara[i] = 2.5;
            } else if (nilai[i] >= 60) {
                indeks[i] = "C";
                setara[i] = 2;
            }else if (nilai[i] >= 50){
                indeks[i] = "D";
                setara[i] = 1;
              }else {
                indeks[i] = "E";
                setara[i] = 0;
            } 
        }
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s| %-50s | %-15s | %-15s | %-15s | %-10s |", 
                                "No","Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "Sks");
                System.out.println("");
        System.out.println ("--------------------------------------------------------------------------------------------------------------------------------");
        for (i = 1; i < matkul.length; i++) {
            System.out.printf("| %-5s| %-50s | %-15s | %-15s | %-15s | %-10s |", 
                                i,matkul[i], nilai[i], indeks[i], setara[i], sks[i]);
                    System.out.println("");
}
System.out.println ("--------------------------------------------------------------------------------------------------------------------------------");
}
}
    

