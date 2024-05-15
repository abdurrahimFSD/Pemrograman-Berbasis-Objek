package uts;

public class MobilListrikBeraksi {

    public static void main(String args[]) {
        // Object
        MobilListrik mobilListrikSaya = new MobilListrik("Tesla", 1, 100);
        mobilListrikSaya.infoMobil();
        
        // Turun Baterai
        mobilListrikSaya.setTurunBaterai(10);
        mobilListrikSaya.infoMobil();
        
        // Turun Baterai lagi
        mobilListrikSaya.setTurunBaterai(20);
        mobilListrikSaya.infoMobil();
        
        // Naik Gigi 
        mobilListrikSaya.setNaikGigi(4);
        mobilListrikSaya.infoMobil();
    }
}
