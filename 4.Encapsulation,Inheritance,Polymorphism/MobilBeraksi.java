package pertemuan5;

public class MobilBeraksi {
    public static void main(String[] args) {
        // Object
        Mobil mobilSaya = new Mobil("Toyota", 1);
        mobilSaya.infoMobil();
        
        mobilSaya.setGigi(5);
        mobilSaya.infoMobil();
        
        mobilSaya.setGigi(1, true);
        mobilSaya.infoMobil();
    }
}
