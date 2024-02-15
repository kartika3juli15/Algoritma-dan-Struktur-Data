
import java.util.Scanner;

public class Fungsi_17 {

    // Fungsi untuk menghitung pendapatan 
    public static int hitungPendapatan(int[] stok, int[] harga) {
        int pendapatan = 0;
        for (int i = 1; i < stok.length; i++) {
            pendapatan += stok[i] * harga[i - 1]; 
        }
        return pendapatan;
    }

    // Fungsi untuk mendapatkan jumlah stock setiap jenis bunga pada suatu cabang
    public static int[] stokjenis(int[][] stok, int cabang) {
        int[] stokCabang = null;
        for (int i = 0; i < stok.length; i++) {
            if (stok[i][0] == cabang) {
                stokCabang = new int[stok[i].length - 1];
                for (int j = 1; j < stok[i].length; j++) {
                    stokCabang[j - 1] = stok[i][j];
                }
                break;
            }
        }
        return stokCabang;
    }

    // Fungsi untuk mendapatkan nama bunga berdasarkan jenisnya
    public static String NamaBunga(int jenis) {
        switch (jenis) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }

    // Fungsi untuk mengurangi stok bunga yang mati
    public static int[] penguranganStokBunga(int[] stok, int[] pengurangan) {
        int[] stokBaru = new int[stok.length];
        for (int i = 0; i < stok.length; i++) {
            stokBaru[i] = stok[i] + pengurangan[i];
        }
        return stokBaru;
    }                                       


    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int[][] stok = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        // Memanggil fungsi untuk menampilkan pendapatan 
        System.out.println("Total Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok[i], harga);
            System.out.println("Cabang " + stok[i][0] + ": Rp " + pendapatan);
        }

        // Memanggil fungsi untuk menampilkan jumlah stok setiap jenis 
        System.out.println();
        System.out.print("pilih RoyalGarden ke berapa : ");
        int cabang = sc17.nextInt();
        System.out.println("Jumlah stock setiap jenis bunga pada cabang RoyalGarden " + cabang + ":");
        int[] stokCabang4 = stokjenis(stok, cabang);
        for (int i = 0; i < stokCabang4.length; i++) {
            System.out.println("Jumlah stock " + NamaBunga(i) + ": " + stokCabang4[i]);
        }

        // Pengurangan stock karena bunga mati
        System.out.println();
        int[] penguranganStok = {-1, -2, 0, -5};
        int[] stokCabang4SetelahPengurangan = penguranganStokBunga(stokCabang4, penguranganStok);
        System.out.println("Jumlah stock setelah pengurangan stock bunga yang mati pada cabang RoyalGarden " + cabang + ":");
        for (int i = 0; i < stokCabang4SetelahPengurangan.length; i++) {
            System.out.println("dengan rincian pengurangan : " + penguranganStok[i]);
            System.out.println("Jumlah stock setelah pengurangan " + NamaBunga(i) + ": " + stokCabang4SetelahPengurangan[i]);
            
        } 
    }
}

    
