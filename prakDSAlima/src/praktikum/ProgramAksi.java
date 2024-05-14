package praktikum;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramAksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Data> list = new LinkedList<>();
        while (true) {
            boolean cek = false;
            System.out.println("=====MENU PROGRAM=====");
            System.out.println("1. Tambahkan Data\n2. Delete Data");
            System.out.println("3. Tampilkan Data\n0. Keluar");
            System.out.print("Pilih menu: ");
            int pil = input.nextInt();
            if (pil == 1) {
                System.out.print("Masukan ID data yang ingin ditambahkan: ");
                int id = input.nextInt();
                for (Data data : list) {
                    if (data.getID() == id) {
                        System.out.println("ID telah ada, harap masukan lagi\n");
                        cek = true;
                    }
                }
                if (cek) {
                    continue;
                }
                System.out.print("Masukan barang yang ingin ditambahkan: ");
                String barang = input.next();
                System.out.print("Masukan harganya: ");
                double price = input.nextDouble();
                list.add(new Data(id, barang, price));
            } else if (pil == 2) {
                System.out.print("ID Data yang ingin dihapus: ");
                int delID = input.nextInt();
                int index = -1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getID() == delID) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("Data yang ingin dihapus tidak ada");
                } else {
                    list.remove(index);
                    System.out.println("Data berhasil dihapus");
                }

            } else if (pil == 3) {
                if(list.size() !=0)
                    System.out.println("ID\tBarang\tHarga");
                for (Data data : list) {
                    data.tampilkanBarang();
                }
            } else if (pil == 0) {
                break;
            }
            System.out.println("");
        }

    }
}