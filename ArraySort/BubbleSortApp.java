package ArraySort;

import java.util.Scanner;

public class BubbleSortApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = scanner.nextInt();

        // Buat array untuk menyimpan data
        int[] arr = new int[n];

        // Input data bilangan
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Panggil method sort
        BubbleSort.sort(arr);

        // Tampilkan data setelah diurutkan
        System.out.println("Data sebelum diurutkan:");
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println("Data setelah diurutkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}