package praktikum;

import java.util.Scanner;

public class SortSearchProgram {

    private int[] arr;
    Scanner sc = new Scanner(System.in);
    boolean cek = false;

    public void buatArray() {
        int n;
        do {
            System.out.print("Masukan kapasitas array: ");
            n = sc.nextInt();
        } while (n <= 0);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("masukan nilai indeks ke-" + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    public void tampilkanMenu() {
        System.out.println("Pilihan Menu");
        System.out.println("1. Sort Ascending\n2. Sort Descending\n3. Find Value and Index\n0. End Program");
        System.out.print("Pilih: ");
    }
    
    public int pilihMenu(){
        return sc.nextInt();
    }

    public void menuAksi(int pil) {
        if (pil == 0) {
            cek = true;
        } else if (pil == 1) {
            sortingAscending();
        } else if (pil == 2) {
            sortingDescending();
        } else if (pil == 3) {
            System.out.print("Masukan nilai yang ingin dicari: ");
            int x = sc.nextInt();
            searchLinear(x);
        } else {
            System.out.println("Menu tidak tersedia, silahkan pilih lagi!");
        }
    }
    
    public boolean isntMelanjutkan(){
        return cek;
    }

    public void sortingAscending() {
        System.out.print("Array sebelum di sorting: ");
        tampilkanArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Pengurutan tahap-" + (i + 1) + ": ");
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            tampilkanArray();
        }
        System.out.print("Hasil sorting: ");
        tampilkanArray();
    }

    public void sortingDescending() {
        System.out.print("Array sebelum di sorting: ");
        tampilkanArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Pengurutan tahap-" + (i + 1) + ": ");
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            tampilkanArray();
        }
        System.out.print("Hasil sorting: ");
        tampilkanArray();
    }

    private void tampilkanArray() {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("");
    }

    public void searchLinear(int x) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mencari " + x + " pada indeks ke-" + i);
            if (x == arr[i]) {
                System.out.println("Nilai " + x + " ditemukan pada indeks ke-" + i);
                return;
            }
        }
        System.out.println("Nilai tidak ditemukan");
    }

}