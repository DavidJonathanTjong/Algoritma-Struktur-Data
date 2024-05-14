package utp;

public class Searching {

    public void searchLinear(String[]nama, String x, int[]nilai) {
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(x)) {
                System.out.println("Siswa "+x+", total benar: "+nilai[i]);
                return;
            }
        }
        System.out.println("Siswa tidak ditemukan");
    }
}
