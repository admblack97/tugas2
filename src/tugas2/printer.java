package tugas2;

public class printer {
    //atribut
    String merek;
    Integer harga;
    Integer jumlah_item;

    //constructor sama dengan class
    public printer() {
        merek="Epson L605.";
        harga=2500000;
        jumlah_item=1;
    }
    
    //behavior
    void beli() {
        System.out.println("|Merek Printer : "+merek+"    |");
        System.out.println("|Harga Printer : Rp "+harga+"     |");
        System.out.println("|Jumlah Item   : "+jumlah_item+"              |");
        System.out.println("|===============================|");
    }
    
    //method dengan nilai balik
    Integer bayar() {
        Integer total;
        total=harga*jumlah_item;
        return total;
    }
    
    //method tanpa nilai balik
    void bayarPrinter(){
        System.out.println(" method tanpa nilai balik");
        System.out.println("|===============================|");
        System.out.println("|Total         : Rp "+bayar()+"     |");
        System.out.println("|===============================|"+"\n");
    }
    
}
