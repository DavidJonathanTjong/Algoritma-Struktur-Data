package pratikum;

import java.util.Scanner;

public class LiftAksi {
    public static void main(String[] args) {
        //studi kasus antrian naik lift dimana orang pertama masuk akan terakhir keluar
        // IN: A B C D E
        // OUT: E D C B A
        Scanner input = new Scanner(System.in);
        Orang orang = new Orang();
        Lift lift = new Lift();
        while(true){
            System.out.println("======NAIK LIFT======");
            System.out.println("LIMIT LIFT = "+lift.getKapasitas()+" orang");
            System.out.println("1. Masuk Lift");
            System.out.println("2. Keluar Lift");
            System.out.println("3. End Program");
            System.out.print("Pilih: ");
            int pil = input.nextInt();
            if(pil==1){
                System.out.print("Masukan nama anda: ");
                orang.setNama(input.next());
                lift.masukLift(orang);
            }else if(pil==2){
                lift.keluarLift();
            }else if(pil==3){
                System.out.println("Terima kasih telah naik lift");
                break;
            }else{
                System.out.println("Pilihan tidak ada, pilih lagi!");
            }
        }
        
    }
}