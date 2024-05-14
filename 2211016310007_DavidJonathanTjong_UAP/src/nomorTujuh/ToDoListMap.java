package nomorTujuh;

import java.util.HashMap;

public class ToDoListMap {

    private Tugas tugas;
    private HashMap<String, Tugas> noteSaya = new HashMap<>();

    public void tambahToDoList(String tampilan) {
        boolean cek = false;
        for (String i : noteSaya.keySet()) {
            if (i.equalsIgnoreCase(tampilan)) {
                cek = true;
                break;
            }
        }
        if (cek) {
            System.out.println("List anda masih ada, hapus dulu list sebelumnya");
        } else {
            noteSaya.put(tampilan, tugas);
        }
    }

    public void hapusToDoList(String lokasiHapus) {
        noteSaya.remove(lokasiHapus);
    }

    public void lihatToDoList() {
        if (!noteSaya.isEmpty()) {
            System.out.println("======== List Anda Saat Ini =========");
            int no = 1;
            for (String i : noteSaya.keySet()) {
                System.out.println(no + ". " + i);
                System.out.println("   "+noteSaya.get(i).getDeskripsi());
                no++;
            }
        } else {
            System.out.println("List anda masih kosong");
        }

    }

    public Tugas getTugas() {
        return tugas;
    }

    public void setTugas(Tugas tugas) {
        this.tugas = tugas;
    }

    public HashMap<String, Tugas> getNoteSaya() {
        return noteSaya;
    }

}
