package perpustakaan;

public class Searching {
    private String[] kodeBuku;
    
    public Searching(String[]kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    
    public int cariBuku(String target) {
        int start = 0;
        int end = kodeBuku.length-1;
        while(start<end){
            int mid = (start + end) /2;
            //akan return 0 jika sama
            //akan return <0 atau >0 berdasarkan urutan alfabet
            //jika a= 135332 dan b = 129762 maka a.compare(b) akan >0 dan nilai
            //tergantung perbedaan urutan alfabetnya
            if(target.compareTo(kodeBuku[mid])>0){
                start = mid +1;
            }else if(target.compareTo(kodeBuku[mid])<0){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}
