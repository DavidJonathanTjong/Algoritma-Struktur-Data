package praktikum;

import java.util.HashMap;

public class Kamar {
    private HashMap<Integer, Double> tipeKamar = new HashMap<Integer, Double>();
    //untuk menyimpan tipe kamar beserta harga/harinya
    private int noKamar = 1; //akan hanya ada 30 kamar 
    private HashMap<Integer, Boolean> tersediaKamar = new HashMap<>();
    
    public Kamar() {
        inisialisasi();
        inisialisasiNoKamar();
    }
    
    public void inisialisasi(){
        tipeKamar.put(1, 225000.0);
        tipeKamar.put(2, 500000.0);
        tipeKamar.put(3, 1000000.0);
    }
    
    public void inisialisasiNoKamar(){
        for (int i = 1; i <= 30; i++) {
            tersediaKamar.put(i, true);
            //true ini adalah status kamar yang menandakan kamar bisa diberikan
        }
    }
    
    public void setStatusKamar(int noKamar, boolean tersedia){
        tersediaKamar.replace(noKamar, tersedia);
    }

    public void setTersediaKamar(HashMap<Integer, Boolean> tersediaKamar) {
        this.tersediaKamar = tersediaKamar;
    }
    public HashMap<Integer, Boolean> getTersediaKamar() {
        return tersediaKamar;
    }
    
    //jika ingin merubah harga kamar atau menambahkan tipe kamar
    public HashMap<Integer, Double> getTipeKamar() {
        return tipeKamar;
    }
    public void setTipeKamar(HashMap<Integer, Double> tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
    
}
