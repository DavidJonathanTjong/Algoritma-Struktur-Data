package perpustakaan;

public class QuickSort {

    private String[] bookTitle;
    private String[] authorName;
    private String[] ratingScoreX;
    private String[] isbn;
    private String[] bahasa;
    private String[] ratingTotal;
    private String[] date;
    private String[] publisher;
    
    public QuickSort(String[]a,String[]b,String[]c,String[]d,String[]e,String[]f,String[]g,String[]h){
        bookTitle = a;
        authorName = b;
        ratingScoreX = c;
        isbn = d;
        bahasa = e;
        ratingTotal = f;
        date = g;
        publisher = h;
        quickSort(isbn, 0, isbn.length - 1);
    }

    public void quickSort(String[] array, int start, int end) {
        if (end <= start) {
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
            if (array[j].compareTo(pivot) < 0) {
                i++;
                //swap i dan j
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                String namaBuku = bookTitle[i];
                bookTitle[i] = bookTitle[j];
                bookTitle[j] = namaBuku;

                String namaPengarang = authorName[i];
                authorName[i] = authorName[j];
                authorName[j] = namaPengarang;

                String ratingX = ratingScoreX[i];
                ratingScoreX[i] = ratingScoreX[j];
                ratingScoreX[j] = ratingX;

                String lang = bahasa[i];
                bahasa[i] = bahasa[j];
                bahasa[j] = lang;

                String totalRating = ratingTotal[i];
                ratingTotal[i] = ratingTotal[j];
                ratingTotal[j] = totalRating;

                String tgl = date[i];
                date[i] = date[j];
                date[j] = tgl;

                String penerbit = publisher[i];
                publisher[i] = publisher[j];
                publisher[j] = penerbit;

            }
        }
        //swap pivotnya
        String temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        
        String tempNamaBuku = bookTitle[i+1];
        bookTitle[i+1] = bookTitle[end];
        bookTitle[end] = tempNamaBuku;
        
        String tempNamaPengarang = authorName[i+1];
        authorName[i+1] = authorName[end];
        authorName[end] = tempNamaPengarang;
        
        String tempRatX = ratingScoreX[i+1];
        ratingScoreX[i+1] = ratingScoreX[end];
        ratingScoreX[end] = tempRatX;
        
        String tempLang = bahasa[i+1];
        bahasa[i+1] = bahasa[end];
        bahasa[end] = tempLang;
        
        String tempTotalRating = ratingTotal[i+1];
        ratingTotal[i+1] = ratingTotal[end];
        ratingTotal[end] = tempTotalRating;
        
        String tempTgl = date[i+1];
        date[i+1] = date[end];
        date[end] = tempTgl;
        
        String tempPenerbit = publisher[i+1];
        publisher[i+1] = publisher[end];
        publisher[end] = tempPenerbit;
        
        return i + 1;
    }
    
    public String[] getArrBookTitle(){
        return bookTitle;
    }
    public String[] getArrAuthorName(){
        return authorName;
    }
    public String[] getArrScoreX(){
        return ratingScoreX;
    }
    public String[] getArrNoSeri(){
        return isbn;
    }
    public String[] getArrBahasa(){
        return bahasa;
    }
    public String[] getArrRatingTotal(){
        return ratingTotal;
    }
    public String[] getArrDate(){
        return date;
    }
    public String[] getArrPenerbit(){
        return publisher;
    }
    
}
