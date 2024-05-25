package pertemuan5;

public class MobilListrikBeraksi {
    public static void main(String[] args) {
        // Object
        MobilListrik mobilListrikSaya = new MobilListrik("Tesla", 1, 100);
        mobilListrikSaya.infoMobil();
        
        mobilListrikSaya.setGigi(4);
        mobilListrikSaya.infoMobil();
        
        mobilListrikSaya.setGigi(2, true);
        mobilListrikSaya.infoMobil();
    }
}
