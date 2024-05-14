package prakdsaempat;

import java.util.Scanner;

public class ProgramQuickSort {

    private String[] arr;
    private Scanner masukan = new Scanner(System.in); //untuk int
    private Scanner inputan = new Scanner(System.in); //untuk string
    
    public int masukanJumlahData() {
        int jumlahData;
        while (true) {
            System.out.print("Masukan jumlah data: ");
            jumlahData = masukan.nextInt();
            if (jumlahData < 10) {
                System.out.println("Masukan minimal 10 data");
            }else{
                break;
            }
        }
        arr = new String[jumlahData];
        return jumlahData;
    }
    
    public String isiData(){
        return inputan.nextLine();
    }
    
    public void isiDataIndeks(int i, String isi){
        arr[i] = isi;
    }
    
    public void urutkanData(){
        quickSort(arr, 0, arr.length-1);
    }
    
    public void quickSort(String[] array, int start, int end) {
        if(end <= start){
            return;
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    
    public int partition(String[] array, int start, int end) {
        String pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (array[j].compareTo(pivot)<0) {
                i++;
                //swap i dan j
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //swap pivotnya
        String temp = array[i+1];
        array[i+1] = array[end];
        array[end]= temp;
        return i+1;
    }

    public void tampilkanArray() {
        System.out.println("Data setelah disorting: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.println(arr[i] + ", ");
            }
        }
        System.out.println("");
    }

}
