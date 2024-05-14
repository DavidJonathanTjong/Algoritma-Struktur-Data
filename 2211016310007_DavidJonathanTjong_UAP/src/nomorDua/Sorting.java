package nomorDua;

import java.util.LinkedList;

public class Sorting {

    private LinkedList<Produk> list;
    
    //pakai insertion supaya gk lambat kalau datanya banyak
    public void sortingList(LinkedList<Produk> produkData) {
        for (int i = 1; i < produkData.size(); i++) {
            Produk produkTemp = produkData.get(i);
            int j = i - 1;
            while (j >= 0 && produkData.get(j).getBarang().compareTo(produkTemp.getBarang()) > 0) {
                produkData.set(j + 1, produkData.get(j));
                j--;
            }
            produkData.set(j + 1, produkTemp);
        }
        list = produkData;
    }

    public void tampilkanSorting() {
        System.out.println("Nama Barang\tStok");
        for(Produk p : list){
            System.out.println(p.getBarang()+"\t\t"+p.getJumlahBarang());
        }
    }

}
