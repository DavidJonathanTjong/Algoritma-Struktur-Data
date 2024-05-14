package nomorLima;

import java.util.*;

public class TumpukanKargo {

    private Cargo cargo;
    private HashMap<String, Stack<Cargo>> lokasi_tumpukanKargo;
    private LinkedList<String> daftarLokasi = new LinkedList<>();
    private int pilihanLokasi;
    private int jumlahLokasi;

    public int getJumlahLokasi() {
        return jumlahLokasi;
    }

    public TumpukanKargo() {
        lokasi_tumpukanKargo = new HashMap<>();
        inisialisasiLokasiMenumpukCargo();
    }

    public void inisialisasiLokasiMenumpukCargo() {
        //Kasus dimana kargo sangat banyak dengan lokasi untuk menumpuk yang luas
        //untuk menambahkan lokasi tidak bisa secara input untuk keamanan 
        lokasi_tumpukanKargo.put("AA1", new Stack<Cargo>());
        lokasi_tumpukanKargo.put("AA2", new Stack<Cargo>());
        lokasi_tumpukanKargo.put("AB1", new Stack<Cargo>());
        for (String i : lokasi_tumpukanKargo.keySet()) {
            daftarLokasi.add(i);
        }
    }

    public void tampilkanSeluruhKargo() {
        for (String i : daftarLokasi) {
            System.out.println("Lokasi: " + i);
            Stack<Cargo> barang = lokasi_tumpukanKargo.get(i);
            if (barang.isEmpty()) {
                System.out.println("Tidak ada barang");
            } else {
                System.out.println("Nama\tBerat");
                for (Cargo item : barang) {
                    System.out.println(item.getNama() + "\t" + item.getBerat());
                }
            }

            System.out.println("");
        }
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void tumpukKargo() {
        Stack<Cargo> getCargoLokasi = new Stack<>();
        getCargoLokasi = lokasi_tumpukanKargo.get(daftarLokasi.get(pilihanLokasi));
        getCargoLokasi.push(cargo);
        lokasi_tumpukanKargo.replace(daftarLokasi.get(pilihanLokasi), getCargoLokasi);
    }

    public void ambilKargo() {
        Stack<Cargo> getCargoLokasi = lokasi_tumpukanKargo.get(daftarLokasi.get(pilihanLokasi));
        if (!getCargoLokasi.isEmpty()) {
            getCargoLokasi.pop();
            lokasi_tumpukanKargo.replace(daftarLokasi.get(pilihanLokasi), getCargoLokasi);
        } else {
            System.out.println("Kargo kosong");
        }

    }

    public HashMap<String, Stack<Cargo>> getLokasi_tumpukanKargo() {
        return lokasi_tumpukanKargo;
    }

    public void setPilihanLokasi(int pilihanLokasi) {
        this.pilihanLokasi = pilihanLokasi - 1;
    }

}
