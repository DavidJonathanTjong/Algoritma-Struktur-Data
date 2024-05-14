package praktikum;

public class programAksi {

    public static void main(String[] args) {
        SortSearchProgram program = new SortSearchProgram();
        program.buatArray();
        while (true) {
            program.tampilkanMenu();
            int pilih = program.pilihMenu();
            program.menuAksi(pilih);
            if (program.isntMelanjutkan()) {
                break;
            }
        }

    }
}
