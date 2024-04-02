package NumofDays;

import java.util.Scanner;

public class JumlahHariMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = scan.nextInt();

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = scan.nextInt();

        scan.close();

        int jumlahHari = JumlahHari.hitungJumlahHari(bulan, tahun);

        if (jumlahHari != -1) {
            System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan);
            System.out.println("adalah : " + jumlahHari + " Hari");
        } else {
            System.out.println("Bulan tidak valid (1-12)");
        }
    }
}