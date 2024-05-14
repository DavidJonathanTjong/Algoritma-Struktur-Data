package nomorTiga;

import java.util.LinkedList;
import java.util.Queue;

public class Antrian {

    private Queue<String> dataAntrian = new LinkedList<>();
    private Queue<String> dataAntrianAll;

    public Antrian() {
        dataAntrian.add("budi");
        dataAntrian.add("andri");
        dataAntrian.add("jeki");
        dataAntrianAll = new LinkedList<>(dataAntrian);
    }

    public void tambahOrang(Customer customer) {
        if (customer.getNama().equals("close")) {
            dataAntrianAll.add(dataAntrian.poll());
            System.out.println("Isi Antrian : " + dataAntrian + "\n");
            System.exit(0);
        } else {
            boolean cek = true;
            for (String i : dataAntrianAll) {
                if (customer.getNama().equals(i)) {
                    System.out.println("Nama sudah pernah terdaftar");
                    cek = false;
                    break;
                }
            }
            if (cek) {
                dataAntrian.add(customer.getNama());
                dataAntrianAll.add(dataAntrian.poll());
            }
            System.out.println("Isi Antrian : " + dataAntrian + "\n");
        }
    }

    public Queue<String> getDataAntrian() {
        return dataAntrian;
    }

    public Queue<String> getDataAntrianAll() {
        return dataAntrianAll;
    }
    
    public void tampilkanAntrian() {
        System.out.println("Isi Antrian : " + dataAntrian + "\n");
    }

}
