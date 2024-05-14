package nomorEmpat;

public class Main {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();
        antrian.tampilkanAntrian();
        System.out.println("");
        
        antrian.tambahAntrian(701);
        antrian.tambahAntrian(702);
        antrian.tambahAntrian(703);
        antrian.tambahAntrian(704);
        antrian.tampilkanAntrian();
        
        System.out.println("");
        antrian.hapusAntrian();
        antrian.tampilkanAntrian();
        
        System.out.println("");
        antrian.tambahAntrian(705);
        antrian.tampilkanAntrian();
        
        System.out.println("");
        antrian.tambahAntrian(706);
        antrian.tambahAntrian(707);
        antrian.tambahAntrian(708);
        antrian.tampilkanAntrian();
    }
}
