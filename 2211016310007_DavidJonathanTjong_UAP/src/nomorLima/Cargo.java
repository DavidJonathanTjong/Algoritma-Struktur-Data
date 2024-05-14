package nomorLima;

public class Cargo {
    //class untuk isi Cargo
    private String nama;
    private int berat;
    
    public Cargo(String nama, int berat) {
        this.nama = nama;
        this.berat = berat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getBerat() {
        return berat;
    }
    
    public void setBerat(int berat) {
        this.berat = berat;
    }
    
}
