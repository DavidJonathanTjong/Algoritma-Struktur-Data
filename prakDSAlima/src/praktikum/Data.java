package praktikum;

public class Data {
    private int id;
    private String barang;
    private double hargaSatuan;
    
    Data(int id, String barang, double hargaSatuan){
        this.id = id;
        this.barang = barang;
        this.hargaSatuan =hargaSatuan;
    }
    
    public int getID(){
        return id;
    }
    
    public String getNamaBarang(){
        return barang;
    }
    
    public double getHargaBarang(){
        return hargaSatuan;
    }
    
    public void tampilkanBarang(){
        System.out.println(id+"\t"+barang+"\t"+hargaSatuan);
    }
    
}
