package tugas2;

public class printerAksi {
    public static void main(String[] args) {
        printer p1 = new printer();
        System.out.println("|=======Pembelian Printer=======|");
        p1.merek="Epson L605.";
        p1.harga=2500000;
        p1.jumlah_item=1;
        p1.beli();
        
        printer p2 = new printer();
        System.out.println("|=======Pembelian Printer=======|");
        p2.merek="Epson L310.";
        p2.harga=1500000;
        p2.jumlah_item=1;
        p2.beli();
        
        printer p3 = new printer();
        System.out.println("|=======Pembelian Printer=======|");
        p3.merek="Epson L600.";
        p3.harga=6000000;
        p3.jumlah_item=1;
        p3.beli();
    }
}
