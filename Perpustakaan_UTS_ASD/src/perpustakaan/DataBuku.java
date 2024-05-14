package perpustakaan;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DataBuku {
    private String path = "books.csv";
    private String kata = "";
    BufferedReader reader;
    BufferedReader cek;
    private String[]bookTitle;
    private String[]authorName;
    private String[]ratingScoreX;
    private String[]isbn;
    private String[]bahasa;
    private String[]ratingTotal;
    private String[]date;
    private String[]publisher;
    
    public DataBuku(){
        int inp = 0;
        try{
            cek = new BufferedReader(new FileReader(path));
            kata=cek.readLine();
            while((kata = cek.readLine()) != null){
                inp++;
            }
            bookTitle = new String[inp];
            authorName = new String[inp];
            ratingScoreX = new String[inp];
            isbn = new String[inp];
            bahasa = new String[inp];
            ratingTotal = new String[inp];
            date = new String[inp];
            publisher = new String[inp];
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                kata = "";
                inp = 0;
                cek.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        try{
            reader = new BufferedReader(new FileReader(path));
            kata=reader.readLine();
            while((kata = reader.readLine()) != null){
                String[]arr = kata.split(",");
                bookTitle[inp] = arr[1];
                authorName[inp] = arr[2];
                ratingScoreX[inp] = arr[3];
                isbn[inp] = arr[4];
                bahasa[inp] = arr[6];
                ratingTotal[inp] = arr[8];
                date[inp] = arr[10];
                publisher[inp] = arr[11];
                inp++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
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