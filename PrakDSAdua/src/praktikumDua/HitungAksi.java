package praktikumDua;

import java.util.Scanner;

public class HitungAksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HitungOperasi hitungOperasi = new HitungOperasi();
        while (true) {
            int totalBilangan = hitungOperasi.menuTampilan(sc);
            if (totalBilangan <= 0) {
                continue;
            }
            hitungOperasi.setIsiArray(totalBilangan);
            hitungOperasi.prosesPerkalian();
            hitungOperasi.hasilOperasi();
            hitungOperasi.resetHasil();
            if (hitungOperasi.menuMengulang()) {
                break;
            }
        }
    }
}
