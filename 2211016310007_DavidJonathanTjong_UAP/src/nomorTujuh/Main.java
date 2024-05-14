package nomorTujuh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ToDoListMap note = new ToDoListMap();
        while (true) {
            System.out.println("===== Program To Do List =====");
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambahkan TO Do List");
            System.out.println("2. Hapus To Do List");
            System.out.println("3. Lihat To Do List");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            input.nextLine();
            if (pil == 1) {
                //note di hp, tampilan depan judul kemudian diklik judul dan deskripsi
                System.out.print("Masukan judul: ");
                String judul = input.nextLine();
                System.out.print("Masukan deskripsi: ");
                String deskripsi = input.nextLine();
                Tugas task = new Tugas(judul, deskripsi);
                note.setTugas(task);
                note.tambahToDoList(judul);
            } else if (pil == 2) {
                if (note.getNoteSaya().isEmpty()) {
                    System.out.println("List masih kosong");
                } else {
                    System.out.println("====== List yang dapat dihapus =======");
                    note.lihatToDoList();
                    System.out.print("Masukan nama list: ");
                }
                note.hapusToDoList(input.nextLine());
            } else if (pil == 3) {
                note.lihatToDoList();
            } else if (pil == 4) {
                System.out.println("Terima Kasih telah menggunakan program");
                break;
            } else {
                System.out.println("Menu yang anda pilih tidak ada");
            }
        }
    }
}
