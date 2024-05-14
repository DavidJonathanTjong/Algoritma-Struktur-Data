package nomorSatu;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList <Integer> data = new LinkedList<>();
        LinkedList <Integer> posisiUrutan = new LinkedList<>();
        while(data.size()!=8){
            data.add(input.nextInt());
        }
        Pengurutan pengurutan = new Pengurutan(data);
        pengurutan.urutkanData();
        posisiUrutan = pengurutan.getPosisiUrutan();
        
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i)+" ");
        }
        System.out.println("");
        for (int i = 0; i < posisiUrutan.size(); i++) {
            System.out.print(posisiUrutan.get(i)+" ");
        }
        
    }
}