package utp;

import java.util.Scanner;

public class Siswa {

    private int size;
    private int sizeNilai;
    private int capacity = 10;
    private int capacityNilai = 10;
    private String[] student;
    private int[] nilaiSiswa;
    private int totalSiswa = 0;
    private String[] soal;
    private double[] jawab;

    public Siswa() {
        this.nilaiSiswa = new int[capacity];
        this.student = new String[capacity];
    }

    public void add(int data) {
        if (size >= capacityNilai) {
            growInt();
        }
        nilaiSiswa[sizeNilai] = data;
        sizeNilai++;
    }

    public void add(String data) {
        if (size >= capacity) {
            growString();
        }
        student[size] = data;
        size++;
    }

    private void growInt() {
        int newCapacity = (int) (capacityNilai * 2);
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = nilaiSiswa[i];
        }
        capacityNilai = newCapacity;
        nilaiSiswa = newArray;
    }

    private void growString() {
        int newCapacity = (int) (capacity * 2);
        String[] newArray = new String[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = student[i];
        }
        capacity = newCapacity;
        student = newArray;
    }

    public void setArraySiswa(String[] arrSoal, double[] arrJawaban) {
        this.soal = arrSoal;
        this.jawab = arrJawaban;
    }

    public void menjawabKuis(Scanner input1, Scanner input2, Scanner masukan) {
        if (totalSiswa >= capacity) {
            growString();
            growInt();
        }
        System.out.print("Masukan nama anda: ");
        add(masukan.nextLine());
        int result = 0;
        for (int i = 0; i < soal.length; i++) {
            System.out.println((i + 1) + ". " + soal[i]);
            System.out.print("jawab: ");
            double cek = input2.nextDouble();
            if (cek == jawab[i]) {
                result++;
            }
        }
        System.out.println("Jawaban benar anda: " + result);
        add(result);
        totalSiswa++;
    }
    
    public boolean cekIsiNilai(){
        if(nilaiSiswa.length ==0){
            return true;
        }
        return false;
    }
    
    public String[] getRankNama(){
        String[]rankSiswa;
    
        int cek = 0;
        for (int i = 0; i < student.length; i++) {
            if(student[i]!= null){
                cek++;
            }
        }
        int getNil=0;
        rankSiswa = new String[cek];
        for (int i = 0; i < rankSiswa.length; i++) {
            if(student[i]!= null){
                rankSiswa[getNil] = student[i];
                getNil++;
            }
        }
        return rankSiswa;
    }
    
    public int[] getRankNilai(){
        int[]rankNilai;
        int cek = 0;
        for (int i = 0; i < student.length; i++) {
            if(student[i]!= null){
                cek++;
            }
        }
        int getNil=0;
        rankNilai = new int[cek];
        for (int i = 0; i < rankNilai.length; i++) {
            if(student[i]!= null){
                rankNilai[getNil] = nilaiSiswa[i];
                getNil++;
            }
        }
        return rankNilai;
    }

}
