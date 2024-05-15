package uts;

public class MobilBeraksi {

    public static void main(String args[]) {
        // Object
        Mobil mobilSaya = new Mobil("Toyota", 2);
        mobilSaya.infoMobil();
        
        // Mengubah isi 
        mobilSaya.setMerk("Toyota");
        mobilSaya.setNaikGigi(4);
        mobilSaya.infoMobil();
        
        // Turun Gigi
        mobilSaya.setTurunGigi(2);
        mobilSaya.infoMobil();
    }
}
