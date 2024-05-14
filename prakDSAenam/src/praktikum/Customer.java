package praktikum;

import java.util.LinkedList;

public class Customer {
    private LinkedList<String> listCustomer = new LinkedList<>();
    
    //tambah customer pada list
    public void addCustomerNama(String nama){
        listCustomer.add(nama);
    }

    //jika ingin mengganti list customer dengan list yang dibuat di main
    public void setListCustomer(LinkedList<String> listCustomer) {
        this.listCustomer = listCustomer;
    }
    
    //buat di get di class lain
    public LinkedList<String> getListCustomer() {
        return listCustomer;
    }
    
}
