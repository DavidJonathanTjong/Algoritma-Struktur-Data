package nomorLima;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TumpukanKargo tumpukanKargo = new TumpukanKargo();
        while (true) {
            System.out.println("===== Program Pendataan Cargo =====");
            System.out.println("Pilihan Menu");
            System.out.println("1. Masukan Kargo");
            System.out.println("2. Keluarkan Kargo");
            System.out.println("3. Informasi Kargo di Pelabuhan Sekarang");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            if (pil == 1) {
                System.out.println("====== Menumpuk kontainer kargo ======");
                System.out.println("List lokasi kargo");
                int nom = 1;
                for (String i : tumpukanKargo.getLokasi_tumpukanKargo().keySet()) {
                    System.out.println(nom + ". " + i);
                    nom++;
                }
                System.out.print("Pilih: ");
                int pilihan = input.nextInt();
                input.nextLine();
                if (pilihan > 0 || pilihan <= tumpukanKargo.getJumlahLokasi()) {
                    tumpukanKargo.setPilihanLokasi(pilihan);
                    System.out.print("Masukan nama kargo: ");
                    String nama = input.nextLine();
                    System.out.print("Masukan berat kargo: ");
                    int berat = input.nextInt();
                    Cargo cargo = new Cargo(nama, berat);
                    tumpukanKargo.setCargo(cargo);
                    tumpukanKargo.tumpukKargo();
                } else {
                    System.out.println("Lokasi tidak tersedia");
                }
            } else if (pil == 2) {
                System.out.println("====== Mengambil kontainer kargo ======");
                System.out.println("List lokasi kargo");
                int nom2 = 1;
                for (String i : tumpukanKargo.getLokasi_tumpukanKargo().keySet()) {
                    System.out.println(nom2 + ". " + i);
                    nom2++;
                }
                System.out.print("Pilih: ");
                int pilihan2 = input.nextInt();
                if (pilihan2 > 0 || pilihan2 <= tumpukanKargo.getJumlahLokasi()) {
                    tumpukanKargo.setPilihanLokasi(pilihan2);
                    tumpukanKargo.ambilKargo();
                } else {
                    System.out.println("Lokasi tidak tersedia");
                }
            } else if (pil == 3) {
                tumpukanKargo.tampilkanSeluruhKargo();
            }else if (pil == 4) {
                System.out.println("Terima Kasih telah menggunakan program");
                break;
            } else {
                System.out.println("Pilihan Menu Tidak Tersedia\n");
            }
        }

    }
}
