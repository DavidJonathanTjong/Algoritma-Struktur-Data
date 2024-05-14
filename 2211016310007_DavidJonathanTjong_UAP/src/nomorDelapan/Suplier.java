package nomorDelapan;

public class Suplier {
    private String nama;
    private String noTelpon;
    private String alamat;

    public Suplier(String nama, String noTelpon, String alamat) {
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
