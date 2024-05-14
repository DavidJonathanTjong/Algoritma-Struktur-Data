package nomorDelapan;

import java.util.HashMap;

public class RiwayatBarang {
    private HashMap<Integer, HashMap<Barang, Suplier>> histori_barangPerusahaanMasuk = new HashMap<>();
    private HashMap<Barang, Suplier> histori_barangPerusahaanKeluar = new HashMap<>();//barang stok harga suplier
    private double totalUangPembelian;
    private double totalUangPendapatan;
    
    public void tambahRiwayatMasuk(int id_barang, HashMap<Barang, Suplier>histori_barang ){
        histori_barangPerusahaanMasuk.put(id_barang, histori_barang);
    }
    public void tambahRiwayatKeluar(Barang bar, Suplier sup){
        histori_barangPerusahaanKeluar.put(bar, sup);
    }

    public void setTotalUangPembelian(double totalUangPembelian) {
        this.totalUangPembelian = totalUangPembelian;
    }

    public void setTotalUangPendapatan(double totalUangPendapatan) {
        this.totalUangPendapatan = totalUangPendapatan;
    }
    
    public void tampilkanRiwayatBarangMasuk(){
        if(!histori_barangPerusahaanMasuk.isEmpty()){
            System.out.println("======== RIWAYAT PEMBELIAN PERUSAHAAN ========");
            System.out.println("No\tNama Barang\tStok\tHarga\t\tSuplier");
            for (int i : histori_barangPerusahaanMasuk.keySet()) {
                HashMap<Barang, Suplier> ambilBarang = histori_barangPerusahaanMasuk.get(i);
                for (Barang j : ambilBarang.keySet()) {
                    System.out.println(i + "\t" + j.getNama() + "\t" + j.getStok() + "\t"
                            + j.getHarga() + "\t" + ambilBarang.get(j).getNama());
                }
            }
            System.out.println("TOTAL PEMBELIAN: "+totalUangPembelian);
        }else{
            System.out.println("Pembelian belum dilakukan");
        }
    }
    public void tampilkanRiwayatBarangKeluar(){
        if(!histori_barangPerusahaanKeluar.isEmpty()){
            System.out.println("======== RIWAYAT PENJUALAN PERUSAHAAN ========");
            System.out.println("Nama Barang\tStok\tHarga\t\tSuplier");
            for (Barang i : histori_barangPerusahaanKeluar.keySet()) {
                System.out.println(i.getNama()+"\t"+i.getStok()+"\t"+i.getHarga()+"\t"
                        +histori_barangPerusahaanKeluar.get(i).getNama());
            }
            System.out.println("TOTAL PENDAPATAN: "+totalUangPendapatan);
        }else{
            System.out.println("Transaksi belum dilakukan");
        }
        
    }

    public HashMap<Integer, HashMap<Barang, Suplier>> getHistori_barangPerusahaanMasuk() {
        return histori_barangPerusahaanMasuk;
    }
    public HashMap<Barang, Suplier> getHistori_barangPerusahaanKeluar() {
        return histori_barangPerusahaanKeluar;
    }

    public double getTotalUangPembelian() {
        return totalUangPembelian;
    }

    public double getTotalUangPendapatan() {
        return totalUangPendapatan;
    }
    
}