package utp;

public class Sorting {
    protected int[] arr;
    protected String[] nama;
    
    public Sorting(int[]arr, String[] nama){
        this.arr = arr;
        this.nama = nama;
    }
    
    public void tampilkanRanking() {
        System.out.println("\n======Rangking Saat Ini======");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i+1)+". "+nama[i]+" dengan total benar: "+arr[i]);
        }
    }
    
}
