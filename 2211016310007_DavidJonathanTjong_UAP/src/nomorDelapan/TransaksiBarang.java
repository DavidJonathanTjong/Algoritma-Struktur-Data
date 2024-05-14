package nomorDelapan;

import java.util.HashMap;

public class TransaksiBarang {
    //transaksi yang tidak harus tau nama customer
    //id barang -> nama dan stok -> nama suplier
    private Suplier sup;
    private Barang bar;
    private RiwayatBarang historiBarang = new RiwayatBarang();

    private HashMap<Integer, HashMap<Barang, Suplier>> barangPerusahaan = new HashMap<>();//untuk tambah dan transaksi
    private int id_barang = 1;

    public Barang getBar() {
        return bar;
    }

    public void setBar(Barang bar) {
        this.bar = bar;
    }

    public void tambahBarang() {
        //meskipun ketika menambah barang yang sama oleh suplier yang sama
        //tidak boleh stok barangPerusahaan bertambah untuk menghindari manipulasi data 
        HashMap<Barang, Suplier> detail_barang = new HashMap<>();
        detail_barang.put(bar, sup);
        barangPerusahaan.put(id_barang, detail_barang);
        
        HashMap<Barang, Suplier> riwayatbar = new HashMap<>();
        for(Barang i: detail_barang.keySet()){
            String nam = i.getNama();
            int stk = i.getStok();
            double hrg = i.getHarga();
            Barang x = new Barang(nam, stk, hrg);
            riwayatbar.put(x, sup);
            double totalbeli = historiBarang.getTotalUangPembelian();
            totalbeli += (double)stk*hrg;
            historiBarang.setTotalUangPembelian(totalbeli);
        }
        historiBarang.tambahRiwayatMasuk(id_barang, riwayatbar);
        id_barang++;
    }

    public void transaksi(int id, int stok) {
        if (!barangPerusahaan.isEmpty()) {
            if (barangPerusahaan.containsKey(id)) {
                HashMap<Barang, Suplier> detail_barang = barangPerusahaan.get(id);
                double totalpembelian = historiBarang.getTotalUangPendapatan();
                for (Barang i : detail_barang.keySet()) {//diulang 1 kali
                    int stokBar = i.getStok();
                    Suplier suplyer = detail_barang.get(i);
                    Barang barangX = i;
                    Barang barangOut = new Barang(barangX.getNama(), stok, barangX.getHarga());
                    int barangNow = stokBar - stok;
                    barangX.setStok(barangNow);
                    totalpembelian += stok*barangX.getHarga();
                    if (barangNow < 0) {
                        System.out.println("Tidak dapat melakukan transaksi");
                    } else if (barangNow == 0) {
                        barangPerusahaan.remove(id);
                        historiBarang.tambahRiwayatKeluar(barangOut, suplyer);
                        historiBarang.setTotalUangPendapatan(totalpembelian);
                    } else {
                        detail_barang.put(barangX, suplyer);
                        barangPerusahaan.replace(id, detail_barang);
                        historiBarang.tambahRiwayatKeluar(barangOut, suplyer);
                        historiBarang.setTotalUangPendapatan(totalpembelian);
                    }
                }

            } else {
                System.out.println("ID barang tidak tersedia");
            }
        } else {
            System.out.println("Barang Saat ini kosong");
        }
    }

    public void informasiBarang() {
        if (!barangPerusahaan.isEmpty()) {
            System.out.println("=================INFORMASI BARANG SAAT INI===================");
            System.out.println("No\tNama Barang\tStok\tHarga\t\tSuplier");
            for (int i : barangPerusahaan.keySet()) {
                HashMap<Barang, Suplier> ambilBarang = barangPerusahaan.get(i);
                for (Barang j : ambilBarang.keySet()) {
                    System.out.println(i + "\t" + j.getNama() + "\t" + j.getStok() + "\t"
                            + j.getHarga() + "\t" + ambilBarang.get(j).getNama());
                }
            }
        } else {
            System.out.println("Tidak Ada Barang Tersedia");
        }
    }

    public void informasiRiwayatBarangMasuk() {
        historiBarang.tampilkanRiwayatBarangMasuk();
    }

    public void informasiRiwayatBarangKeluar() {
        historiBarang.tampilkanRiwayatBarangKeluar();
    }
    
    public Suplier getSup() {
        return sup;
    }

    public void setSup(Suplier sup) {
        this.sup = sup;
    }
}