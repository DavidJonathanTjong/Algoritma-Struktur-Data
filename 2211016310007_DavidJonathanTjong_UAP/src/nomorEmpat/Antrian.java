package nomorEmpat;

import java.util.LinkedList;
import java.util.Queue;

public class Antrian {
    private Queue<Integer> antrian = new LinkedList<>();

    public Queue<Integer> getAntrian() {
        return antrian;
    }
    
    public void tambahAntrian(int bilangan){
        if(antrian.size()<6){
            antrian.add(bilangan);
        }
    }
    
    public int hapusAntrian(){
        return antrian.poll();
    }
    
    public void tampilkanAntrian(){
        int j=1;
        System.out.println("===== Isi Antrian =====");
        for(int i: antrian){
            System.out.println(j+". "+i);
            j++;
        }
        
    }
}
