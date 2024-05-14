package nomorSatu;

import java.util.LinkedList;

public class Pengurutan {
    private LinkedList<Integer> data;
    private LinkedList<Integer> posisiUrutan = new LinkedList<>();
    private LinkedList<Integer> dataSort;
    
    public Pengurutan(LinkedList<Integer> data){
        this.data = data;
        dataSort = new LinkedList<>(data);
    }
    
    public void urutkanData(){
        //sorting dari terbesar dulu datanya
        for (int i = 0; i < dataSort.size(); i++) {
            for (int j = 0; j < dataSort.size()-1-i; j++) {
                if(dataSort.get(j)<dataSort.get(j+1)){
                    int temp = dataSort.get(j);
                    dataSort.set(j, dataSort.get(j+1));
                    dataSort.set(j+1, temp);
                }
            }
        }
        //cek kesamaan lalu ambil indexnya
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size(); j++) {
                if(dataSort.get(i) == data.get(j)){
                    posisiUrutan.add(j+1);
                    break;
                }
            }
        }
    }

    public LinkedList<Integer> getPosisiUrutan() {
        return posisiUrutan;
    }

}