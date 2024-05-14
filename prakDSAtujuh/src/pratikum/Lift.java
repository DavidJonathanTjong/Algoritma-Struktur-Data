package pratikum;

import java.util.Scanner;

public class Lift {

    private Scanner input = new Scanner(System.in);
    private Orang orang;
    private int kapasitas = 5;
    private Antrian antrian = new Antrian(kapasitas);

    public void masukLift(Orang orang) {
        String nama = orang.getNama();
        if (antrian.isFull()) {
            keputusanOrangDepan(nama);
        } else {
            antrian.push(orang.getNama());
            System.out.println(orang.getNama()+" telah masuk lift");
            kapasitas--;
        }
    }

    public int getKapasitas() {
        return kapasitas;
    }

    private void keputusanOrangDepan(String nama) {
        System.out.print("Apakah " + antrian.peek() + " di paling depan mau keluar (y/n): ");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            antrian.pop();
            antrian.push(nama);
            System.out.println(nama+" telah masuk lift");
        } else {
            System.out.println("ANTRIAN PENUH");
        }
    }

    public void keluarLift() {
        if (antrian.isEmpty()) {
            System.out.println("Lift kosong");
        } else {
            while(!antrian.isEmpty()){
                System.out.println(antrian.pop() + " telah keluar");
            }
            antrian.tampilkanAntrian();
            kapasitas=5;
        }
    }

}
