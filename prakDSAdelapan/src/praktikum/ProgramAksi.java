package praktikum;

import java.util.HashMap;
import java.util.Scanner;

public class ProgramAksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 1;
        HashMap<Integer, ReservasiHotel> pesananTamu = new HashMap<>();
        ReservasiHotel reservasiKamar = new ReservasiHotel();//untuk cek Kamar
        /*
        Studi kasus pemesanan kamar hotel secara offline tanpa aplikasi
        menu 1: resepsiones melayani tamu yang ingin memesan kamar hotel dengan
        mengisi nama, no telpon, tipe kamar, lama menginap, serta nomor kamar.
        Kemudian akan menampilkan harga pesanan kamar hotel
        nomor kamar yang diisi tidak akan bisa ditempati orang lain kecuali tamu
        tersebut check out
        menu 2: untuk mengosongkan kamar yang dipakai sebelumnya sehingga bisa 
        dipakai lagi
        menu 3: untuk melihat siapa saja tamu yang pernah memesan
        menu 4: untuk membersihkan riwayat reservasi
        menu 5: program berhenti
         */

        while (true) {
            System.out.println("====== RESERVASI HOTEL ======");
            System.out.println("Pilihan Menu");
            System.out.println("1. Pesan Kamar Tamu");
            System.out.println("2. Tamu check out\n3. Tamu yang berkunjung");
            System.out.println("4. Bersihkan Riwayat Tamu\n5. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            if (pil == 1) {
                ReservasiHotel reservasi = new ReservasiHotel();
                Tamu tamu = new Tamu();
                //untuk membuat reservasi tamu baru dan disimpan ke hashmap pesanan tamu
                System.out.print("Nama Tamu: ");
                tamu.setNama(input.next());
                System.out.print("No Telepon: ");
                tamu.setNoTelpon(input.next());
                System.out.println("Pilihan Tipe Kamar:\n1. Economy\n2. Bussiness"
                        + "\n3. Exclusive");
                System.out.print("Tipe Kamar: ");
                int tipeRoom = input.nextInt();
                tamu.setTipeKamar(tipeRoom);
                System.out.print("Lama Menginap: ");
                tamu.setLamaMenginap(input.nextInt());

                reservasi.setTamu(tamu);
                reservasiKamar.setPilihanKamar(tipeRoom, input);
                int jenisKamar = reservasiKamar.getJenisKamar();
                int checkPoint = reservasiKamar.getNoKamar();
                reservasi.setKamarCheckPoint(checkPoint);
                reservasi.setJenisKamar(jenisKamar);
                pesananTamu.put(id, reservasi);
                System.out.println("Harga Menginap: "+pesananTamu.get(id).getBiayaTotal());
                id++;
            } else if (pil == 2) {
                System.out.println("Masukan nomor kamar yang checkout: ");
                int kamarSelesai = input.nextInt();
                reservasiKamar.setKamarTersedia(kamarSelesai);
            } else if (pil == 3) {
                System.out.println("RIWAYAT TAMU YANG PERNAH MEMESAN");
                System.out.println("No\tNama\tNo. Telepon\tBiaya");
                int no = 1;
                for (int i : pesananTamu.keySet()) {
                    System.out.println(no + "\t" + pesananTamu.get(i).getTamu().getNama()
                    +"\t"+pesananTamu.get(i).getTamu().getNoTelpon()+"\t"
                    +pesananTamu.get(i).getBiayaTotal());
                    no++;
                }
            } else if (pil == 4) {
                pesananTamu.clear();
                reservasiKamar.getKamar().inisialisasiNoKamar();
                id = 1;
            } else if (pil == 5) {
                System.out.println("Program Berhenti");
                break;
            }
        }
    }
}
