package utp;

import java.util.Scanner;

public class Main {
//    PENDATAAN NILAI SISWA BERDASARKAN KUIS MATEMATIKA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TampilanAksi tampilan = new TampilanAksi();
        while (true) {
            tampilan.menuUtama();
            int pilih = sc.nextInt();
            if (pilih == 0) {
                tampilan.menuPeringkat();
                break;
            } else if (pilih == 1) {
                tampilan.menuSiswa();
            } else if (pilih == 2) {
                tampilan.menuGuru();
            } else {
                tampilan.notifikasiTidakValid();
            }
        }

    }
}