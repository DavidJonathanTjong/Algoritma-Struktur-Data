package utp;

import java.util.Scanner;

public class TampilanAksi {

    private Scanner sc = new Scanner(System.in);
    private Scanner in = new Scanner(System.in);
    private Scanner m = new Scanner(System.in);

    SoalKuis soalkuis = new SoalKuis();
    Siswa siswa = new Siswa();

    private String[] soalGuru;
    private double[] jawabanKuis;

    private String[] siswaSkor_Nama = new String[0];
    private int[] siswaSkor_Nilai;

    public void menuUtama() {
        System.out.println("SELAMAT DATAND DI PROGRAM KUIS");
        System.out.println("Silahkan pilih role terlebih dahulu");
        System.out.println("1. Siswa\n2. Guru\n0. End Program");
        System.out.print("Pilih: ");
    }

    public void menuSiswa() {
        if (soalkuis.cekIsiArray()) {
            notifikasiBuatSoal();
        } else {
            System.out.println("SELAMAT DATANG, SEMOGA BERUNTUNG");
            System.out.println("Pilihan menu:");
            System.out.println("1. Kerjakan Soal");
            System.out.print("Pilih: ");
            int pilihanSiswa = sc.nextInt();
            if (pilihanSiswa == 1) {
                siswa.setArraySiswa(soalGuru, jawabanKuis);
                siswa.menjawabKuis(sc, in, m);
                siswaSkor_Nama = siswa.getRankNama();
                siswaSkor_Nilai = siswa.getRankNilai();
            } else {
                notifikasiTidakValid();
            }
        }
    }

    public void menuGuru() {
        System.out.println("SELAMAT DATANG");
        System.out.println("Pilihan menu:");
        System.out.println("1. Buat Kuis");
        System.out.println("2. Cari Siswa");
        System.out.print("Pilih: ");
        int pilihanGuru = sc.nextInt();
        if (pilihanGuru == 1) {
            soalkuis.menubuatKuis();
            soalGuru = soalkuis.getArrSoal();
            jawabanKuis = soalkuis.getArrJawaban();
        } else if (pilihanGuru == 2) {
            if (siswaSkor_Nama.length == 0) {
                System.out.println("Suruh siswa kerjakan kuis terlebih dahulu");
            } else {
                System.out.println("Cari nama siswa: ");
                String nama = m.nextLine();
                Searching srch = new Searching();
                srch.searchLinear(siswaSkor_Nama, nama, siswaSkor_Nilai);
            }
        } else {
            notifikasiTidakValid();
        }
    }

    public void menuPeringkat() {
        siswaSkor_Nama = siswa.getRankNama();
        siswaSkor_Nilai = siswa.getRankNilai();
        QuickSort sort = new QuickSort(siswaSkor_Nilai, siswaSkor_Nama);
        sort.urutkanData();
        sort.tampilkanRanking();
    }

    public void notifikasiTidakValid() {
        System.out.println("Input anda tidak valid, input lagi!");
    }

    public void notifikasiBuatSoal() {
        System.out.println("Minta guru anda untuk membuat soal terlebih dahulu");
    }
}
