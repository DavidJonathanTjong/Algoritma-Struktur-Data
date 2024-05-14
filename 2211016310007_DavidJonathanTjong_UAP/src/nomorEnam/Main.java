package nomorEnam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ToDoList note = new ToDoList();
        while(true){
            System.out.println("===== Program To Do List =====");
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambahkan TO Do List");
            System.out.println("2. Hapus To Do List");
            System.out.println("3. Lihat To Do List");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            input.nextLine();
            if(pil==1){
                System.out.print("Masukan judul: ");
                String judul = input.nextLine();
                System.out.print("Masukan deskripsi: ");
                String deskripsi = input.nextLine();
                Task task = new Task(judul, deskripsi);
                note.setTask(task);
                note.tambahkanList();
            }else if(pil==2){
                note.hapusList();
            }else if(pil==3){
                note.tampilanList();
            }else if(pil==4){
                System.out.println("Terima Kasih telah menggunakan program");
                break;
            }else{
                System.out.println("Menu yang anda pilih tidak ada");
            }
        }
    }
}
