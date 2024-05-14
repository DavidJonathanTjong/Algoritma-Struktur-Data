package nomorDua;

public class Produk {
    private String barang;
    private int jumlahBarang;

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
    public void tambahJumBarang(int jumlahBarang){
        this.jumlahBarang += jumlahBarang;
    }
    
}
