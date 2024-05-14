package nomorTiga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer;
        Antrian antrian = new Antrian();
        System.out.println("Isi Antrian : "+antrian.getDataAntrian()+"\n");
        while(true){
            System.out.print("Input Nama : ");
            String nama = input.nextLine();
            customer = new Customer(nama);
            antrian.tambahOrang(customer);
        }
        
    }
}