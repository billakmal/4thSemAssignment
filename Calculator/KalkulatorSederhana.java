package Calculator;
import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu pilihan
        System.out.println("Selamat Datang di Kalkulator Sederhana");
        System.out.println("Menu Operasi Matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih Menu:");

        // Membaca pilihan operasi dari user
        if (scanner.hasNextInt()) {
            int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                // Membaca input angka pertama dan kedua
                System.out.print("Masukkan angka pertama: ");
                int angkaPertama = scanner.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int angkaKedua = scanner.nextInt();
                scanner.close();

                // Array untuk menyimpan nama-nama operasi matematika
                String[] operasi = {"Pertambahan", "Pengurangan", "Perkalian", "Pembagian"};

                // Melakukan operasi matematika berdasarkan pilihan user
                int hasil = 0;
                switch (pilihan) {
                    case 1:
                        hasil = angkaPertama + angkaKedua;
                        break;
                    case 2:
                        hasil = angkaPertama - angkaKedua;
                        break;
                    case 3:
                        hasil = angkaPertama * angkaKedua;
                        break;
                    case 4:
                        if (angkaKedua == 0) {
                            System.out.println("Pembagian dengan 0 tidak diizinkan!");
                        } else {
                            hasil = angkaPertama / angkaKedua;
                        }
                        break;
                }

                // Menampilkan hasil operasi
                if (pilihan >= 1 && pilihan <= 4 && angkaKedua != 0) {
                    System.out.println("Hasil " + operasi[pilihan - 1] + " antara " + angkaPertama + " dan " + angkaKedua + " adalah " + hasil);
                }
            } else {
                System.out.println("Pilihan operasi tidak valid!");
            }
        } else {
            System.out.println("Pilihan operasi harus berupa angka!");
        }
    }
}