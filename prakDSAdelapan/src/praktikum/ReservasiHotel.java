package praktikum;

import java.util.Scanner;

public class ReservasiHotel {

    private Kamar kamar = new Kamar();
    private Tamu tamu;
    private int noKamar;
    private int lamaMenginap;
    private double biayaTotal;
    private int jenisKamar;

    public Kamar getKamar() {
        return kamar;
    }

    public void setJenisKamar(int jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public int getJenisKamar() {
        return jenisKamar;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public void setPilihanKamar(int tipeKamar, Scanner input) {
        jenisKamar = tipeKamar;
        lihatKamarTersedia();
        while (true) {
            System.out.print("Pilih nomor kamar: ");
            noKamar = input.nextInt();
            if(kamar.getTersediaKamar().get(noKamar) && noKamar>0 && noKamar<=30){
                break;
            }else{
                System.out.println("Kamar tidak tersedia");
            }
        }
//        setKamarCheckPoint(noKamar);
        kamar.setStatusKamar(noKamar, false);
    }

    public int getNoKamar() {
        return noKamar;
    }
    
    public void setKamarCheckPoint(int x){
        kamar.setStatusKamar(x, false);
    }
    
    public void setKamarTersedia(int x){
        kamar.setStatusKamar(x, true);
    }

    public void lihatKamarTersedia() {
        System.out.println("Daftar Kamar yang Tersedia:");
        for (int i : kamar.getTersediaKamar().keySet()) {
            if (kamar.getTersediaKamar().get(i)) {
                System.out.println("Kamar: " + i);
            }
        }
    }

    private void hitungBiaya() {
        lamaMenginap = tamu.getLamaMenginap();
        biayaTotal = (double) lamaMenginap * kamar.getTipeKamar().get(jenisKamar);
    }

    public double getBiayaTotal() {
        hitungBiaya();
        return biayaTotal;
    }

}
