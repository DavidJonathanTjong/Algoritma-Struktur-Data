package praktikumDua;

import java.util.ArrayList;
import java.util.Scanner;

public class HitungOperasi {
    private int hasil;
    private ArrayList<Integer> angka = new ArrayList();
    private int[] output;
    Scanner input = new Scanner(System.in);

    public int kalikan(int x, int y) {
        if (x == 1) {
            return y;
        }
        return y + kalikan(x - 1, y);
    }

    public void setIsiArray(int n) {
        int x =0;
        output = new int[n];
        while (true) {
            System.out.print("Masukan angka: ");
            int inp = input.nextInt();
            if (inp < 0) {
                System.out.println("Angka tidak boleh negatif, masukan lagi!");
            } else {
                angka.add(inp);
                output[x] = inp;
                x++;
                n--;
            }
            if (n == 0) {
                break;
            }
        }

    }

    public void prosesPerkalian() {
        boolean cek = true;
        for (int i : angka) {
            if (i == 0) {
                hasil = 0;
                cek = false;
            }
        }
        
        if (cek == true) {
            hasil = 1;
            for (int i : angka) {
                hasil = kalikan(hasil, i);
            }
        }

    }

    public int menuTampilan(Scanner sc) {
        System.out.print("Masukan berapa bilangan bulat yang ingin dikalikan: ");
        return sc.nextInt();
    }

    public boolean menuMengulang() {
        System.out.println("Apakah ingin menjalankan program ini lagi?\n1. Ya\n2. Exit");
        System.out.print("Pilih: ");
        int pil = input.nextInt();
        if (pil == 2) {
            return true;
        }
        return false;
    }

    public void hasilOperasi() {
        String info = "";
        for(int i=0; i<output.length;i++){
            if(i == output.length-1){
                info = info + output[i];
            }else{
                info = info + output[i]+" x ";
            }
            
            
        }
        System.out.println("Hasil operasi "+info+" adalah " + hasil);
    }

    public int resetHasil() {
        return hasil = 0;
    }

}
