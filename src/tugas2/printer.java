package tugas2;

public class printer {
    //atribut
    String merek;
    Integer harga;
    double jumlah_item;
    
    //behavior
    void beli() {
        System.out.println("|=======Pembelian Printer=======|");
        System.out.println(" Merek Printer : "+merek);
        System.out.println(" Harga Printer : "+harga);
        System.out.println(" Harga Printer : "+jumlah_item);
        System.out.println("|===============================|");
    }
    
}
