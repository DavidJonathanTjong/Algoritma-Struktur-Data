package nomorDelapan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TransaksiBarang transaksibarang = new TransaksiBarang();
        while(true){
            System.out.println("===== APLIKASI MANAJEMEN BARANG =====");
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambahkan Barang");
            System.out.println("2. Transaksi Barang (barang terjual)");
            System.out.println("3. Informasi Barang sekarang");
            System.out.println("4. Riwayat Barang Masuk");
            System.out.println("5. Riwayat Barang Terjual\n6. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            input.nextLine();
            if(pil==1){
                System.out.print("Masukan nama barang: ");
                String namaBar = input.nextLine();
                System.out.print("Masukan stok barang: ");
                int stok = input.nextInt();
                System.out.print("Masukan harga barang: ");
                double hargabar = input.nextDouble();
                input.nextLine();
                
                System.out.print("Masukan nama suplier: ");
                String namaSup = input.nextLine();
                System.out.print("Masukan nomor telpon suplier: ");
                String noSup = input.nextLine();
                System.out.print("Masukan alamat suplier: ");
                String alamatSup = input.nextLine();
                
                Barang barang = new Barang(namaBar, stok, hargabar);
                Suplier suplier = new Suplier(namaSup, noSup, alamatSup);
                transaksibarang.setBar(barang);
                transaksibarang.setSup(suplier);
                transaksibarang.tambahBarang();
                System.out.println("");
            }else if(pil==2){
                transaksibarang.informasiBarang();
                System.out.print("Masukan id barang: ");
                int ambilID = input.nextInt();
                System.out.print("Masukan berapa stok yang ingin diambil: ");
                int ambilStok = input.nextInt();
                transaksibarang.transaksi(ambilID, ambilStok);
                System.out.println("");
            }else if(pil==3){
                transaksibarang.informasiBarang();
                System.out.println("");
            }else if(pil==4){
                transaksibarang.informasiRiwayatBarangMasuk();
                System.out.println("");
            }else if(pil==5){
                transaksibarang.informasiRiwayatBarangKeluar();
                System.out.println("");
            }else if(pil==6){
                System.out.println("Terima Kasih telah menggunakan program");
                break;
            }else{
                System.out.println("Menu yang dipilih tidak tersedia");
            }
            
        }
    }
    
}
