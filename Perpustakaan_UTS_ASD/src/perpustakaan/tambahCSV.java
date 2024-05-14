package perpustakaan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class tambahCSV {
    String msg;
    
    tambahCSV(String msg){
        this.msg=msg;
    }
    
    public void tambah(){
        try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("books.csv", true));
                writer.append(msg);
                writer.append("\n");
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
