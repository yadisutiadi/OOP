package YADI;

public class objekKucing {
    public static void main(String[] args) {

        Kucing kucingAnggora = new Kucing("anggora","hitam","swedia",10);

        System.out.println(kucingAnggora.jenis);
        System.out.println(kucingAnggora.warna);
        System.out.println(kucingAnggora.asal);
        System.out.println(kucingAnggora.berat);

        kucingAnggora.lari();
        kucingAnggora.suara();
        kucingAnggora.ee();
    }
}
