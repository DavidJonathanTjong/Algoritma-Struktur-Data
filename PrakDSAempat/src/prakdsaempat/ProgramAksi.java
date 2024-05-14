package prakdsaempat;

public class ProgramAksi {
    public static void main(String[] args) {
        ProgramQuickSort program = new ProgramQuickSort();
        int kapasitas = program.masukanJumlahData();
        for (int i = 0; i < kapasitas; i++) {
            System.out.print("Masukan isi data: ");
            program.isiDataIndeks(i, program.isiData());
        }
        program.urutkanData();
        program.tampilkanArray();
    }
}
