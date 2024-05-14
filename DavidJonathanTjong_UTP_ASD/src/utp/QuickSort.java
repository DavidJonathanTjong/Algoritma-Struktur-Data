package utp;

public class QuickSort extends Sorting {
    
    public QuickSort(int[] arr, String[] nama) {
        super(arr, nama);
    }
    
    public void urutkanData(){
        quickSort(arr, 0, arr.length-1);
    }
    
    public void quickSort(int[] array, int start, int end) {
        if(end <= start){
            return;
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    
    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end; j++) {
            if (array[j]>pivot) {
                i++;
                //swap i dan j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                
                String namaSiswa = nama[i];
                nama[i] = nama[j];
                nama[j] = namaSiswa;
                
            }
        }
        //swap pivotnya
        int temp = array[i+1];
        array[i+1] = array[end];
        array[end]= temp;
        
        String namaSiswa = nama[i+1];
        nama[i+1] = nama[end];
        nama[end] = namaSiswa;
        
        return i+1;
    }
}
