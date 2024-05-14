package praktikum;

public class ProgramAksi {
    public static void main(String[] args) {
        //menambahkan siapa saja yang akan menerima sembako
        Customer customer = new Customer();
        customer.addCustomerNama("Robert");
        customer.addCustomerNama("Gavin");
        customer.addCustomerNama("Eko");
        customer.addCustomerNama("Helen");
        customer.addCustomerNama("Eli");
        
        //menset sisa sembako
        Sembako sembako = new Sembako();
        sembako.setSisaSembako(3);
        
        //memulai antrian untuk customer dan sembako tertentu
        Antrian antrian = new Antrian(customer, sembako);
        antrian.mulaiAntrian();
        
    }
}