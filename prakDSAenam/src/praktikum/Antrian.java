package praktikum;

import java.util.Queue;
import java.util.Scanner;

public class Antrian {
    private Customer customer;
    private Sembako sembako;
    private Queue<String> listAntrian; 
    private int sisaSembako;
    private Scanner input = new Scanner(System.in);
    
    //mengambil semua yang diperlukan untuk mencetak output
    Antrian(Customer customer, Sembako sembako){
        this.customer = customer;
        this.sembako = sembako;
        listAntrian = customer.getListCustomer();
        sisaSembako = sembako.getSisaSembako();
    }
    
    //mulai program
    public void mulaiAntrian(){
        System.out.println("Selamat datang untuk membagi Sembako");
        while(true){
            System.out.println("Sisa sembako sekarang "+sisaSembako+"..");
            System.out.println("Antrian : "+listAntrian+"\nPilih: ");
            System.out.println("1. Antrian Selanjutnya");
            System.out.println("2. Tutup Pembagian Sembako");
            System.out.print("Input: ");
            int choice = input.nextInt();
            System.out.println("");
            if(choice==1){
                if(sisaSembako>0){
                    if(listAntrian.size()>0){
                        System.out.println(listAntrian.poll()+" mendapatkan Sembako");
                        sisaSembako--;
                    }else{
                        System.out.println("Semua pelanggan telah mendapatkan Sembako");   
                    }
                }else{
                    System.out.println("Sembako habis, tidak dapat melanjutkan pembagian");
                }
            }else if(choice==2){
                System.out.println("Antrian sembako dibubarkan");
                break;
            }else{
                System.out.println("Pilihan tidak tersedia, Pilih Lagi");
            }
        }
    }
    
}
