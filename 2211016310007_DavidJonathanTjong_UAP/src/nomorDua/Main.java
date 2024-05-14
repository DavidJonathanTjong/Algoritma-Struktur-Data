package nomorDua;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Produk> dataProduk = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("==== Program Pendataan Inventaris ====");
            System.out.println("Pilihan Menu");
            System.out.println("1. Insert Produk\n2. Delete Produk");
            System.out.println("3. Show Produk\n4. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            if (pil == 1) {
                Produk produk = new Produk();
                System.out.print("Masukan nama barang: ");
                String nama = input.next();
                System.out.print("Masukan jumlah barang: ");
                int jumlahBar = input.nextInt();
                if (jumlahBar > 0) {
                    boolean cek = false;
                    int lokasi = 0;
                    for (int i = 0; i < dataProduk.size(); i++) {
                        if (dataProduk.get(i).getBarang().equals(nama)) {
                            produk = dataProduk.get(i);
                            lokasi =i;
                            cek = true;
                            break;
                        }
                    }
                    if (cek) {
                        produk.tambahJumBarang(jumlahBar);
                        dataProduk.set(lokasi, produk);
                    } else {
                        produk.setBarang(nama);
                        produk.setJumlahBarang(jumlahBar);
                        dataProduk.add(produk);
                    }
                } else {
                    System.out.println("tidak dapat menambahkan barang");
                }
            } else if (pil == 2) {
                System.out.println("LiST PILIHAN BARANG");
                for (int i = 0; i < dataProduk.size(); i++) {
                    System.out.println((i+1)+". "+dataProduk.get(i).getBarang());
                }
                System.out.print("Pilih nomor yang ingin dihapus: ");
                int pilDel = input.nextInt()-1;
                if(pilDel<0 || pilDel>dataProduk.size()){
                    System.out.println("Tidak dapat menghapus");
                }else{
                    dataProduk.remove(pilDel);
                }
            } else if (pil == 3) {
                Sorting sort = new Sorting();
                sort.sortingList(dataProduk);
                sort.tampilkanSorting();
            } else if (pil == 4) {
                System.out.println("Terima kasih telah menggunakan program");
                break;
            } else {
                System.out.println("Pilihan menu tidak ada");
            }
        }

    }
}
