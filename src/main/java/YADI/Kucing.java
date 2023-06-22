package YADI;

public class Kucing {

    String jenis, warna, asal;
    int berat ;
    public Kucing (String jenis, String warna, String asal, int berat) {
        this.jenis = jenis;
        this.warna = warna;
        this.asal = asal;
        this.berat = berat;
    }

    public void lari() {
        System.out.println("KCKCKCKCKCKC");
    }
    public void suara() {
        System.out.println("meowwwwwwww");
    }
    public void ee() {
        System.out.println("crotttt");
    }
}