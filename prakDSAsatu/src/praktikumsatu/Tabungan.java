package praktikumsatu;

import java.util.Scanner;

public class Tabungan {
    private int saldo = 0;
    Scanner sc = new Scanner(System.in);

    void tampilkanMenu() {
        while (true) {
            lihatMenu();
            int pil = sc.nextInt();
            if (pil == 1) {
                pilihanKoin(1);
            } else if (pil == 2) {
                pilihanKoin(2);
            } else if (pil == 3) {
                lihatSaldo();
            } else if (pil == 4) {
                System.out.println("Terima kasih telah menggunakan program ini");
                break;
            }else
                System.out.println("Menu tidak tersedia, silahkan pilih lagi");
        }
    }

    private int masukanKoin(int saldo) {
        return this.saldo +=saldo;
    }
    
    private int ambilKoin(int saldo) {
        return this.saldo -=saldo;
    }
    
    public int getSaldo(int saldo){
        return saldo;
    }

    void lihatSaldo() {
        System.out.println("total koin anda saat ini: Rp."+saldo);
    }

    private void pilihanKoin(int status) {
        // 1: menabung koin  2: tarik koin
        while (true) {
            System.out.println("Menu pilihan koin\n1. 100\n2. 200\n3. 500");
            System.out.print("Pilih koin: ");
            int pilih = sc.nextInt();
            if (pilih == 1) {
                if(status==2){
                    if(saldo-100 <0){
                        System.out.println("koin anda tidak cukup");
                    }else
                        ambilKoin(100);
                }else
                    masukanKoin(100);
                break;
            } else if (pilih == 2) {
                if(status==2){
                    if(saldo-200 <0){
                        System.out.println("koin anda tidak cukup\n");
                    }else
                        ambilKoin(200);
                }else
                    masukanKoin(200);
                break;
            } else if (pilih == 3) {
                if(status==2){
                    if(saldo-500 <0){
                        System.out.println("koin anda tidak cukup\n");
                    }else
                        ambilKoin(500);
                }else
                    masukanKoin(500);
                break;
            } else
                System.out.println("pilihan tidak tersedia");
        }
    }

    private void lihatMenu() {
        System.out.println("Selamat datang di program tabungan celengan koin");
        System.out.println("1. Masukan koin \n2. Ambil Koin\n3. Total koin\n4. Keluar");
        System.out.print("Pilih menu: ");
    }
}