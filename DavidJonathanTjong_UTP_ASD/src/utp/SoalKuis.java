package utp;

import java.util.Scanner;

public class SoalKuis {

    private Scanner input1 = new Scanner(System.in); //int
    private Scanner input2 = new Scanner(System.in); //double
    private Scanner masukan = new Scanner(System.in); //String

    private String[] arrSoal;
    private double[] arrJawaban;

    public SoalKuis() {
        arrSoal = new String[0];
        arrJawaban = new double[0];
    }

    public SoalKuis(String x) {

    }

    public void menubuatKuis() {
        System.out.print("Berapa soal kuis yang akan anda buat: ");
        int jumSoal = input1.nextInt();
        arrSoal = new String[jumSoal];
        arrJawaban = new double[jumSoal];
        for (int i = 0; i < arrSoal.length; i++) {
            System.out.print("Masukan pertanyaan soal ke-" + (i + 1) + ": ");
            arrSoal[i] = masukan.nextLine();
            System.out.print("Masukan jawaban soal :");
            arrJawaban[i] = input2.nextDouble();
        }
        sortBubbleSoal(arrSoal, arrJawaban);
    }

    public String[] getArrSoal() {
        return arrSoal;
    }

    public double[] getArrJawaban() {
        return arrJawaban;
    }

    public void menjawabKuis() {

    }

    public boolean cekIsiArray() {
        return arrSoal.length == 0;
    }

    //karena data pertanyaan kuis biasanya sedikit maka aman saja 
    public void sortBubbleSoal(String[] arr, double[] jawaban) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    //soal
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //jawaban
                    double answ = jawaban[j];
                    jawaban[j] = jawaban[j + 1];
                    jawaban[j + 1] = answ;
                }
            }
        }
    }
}
