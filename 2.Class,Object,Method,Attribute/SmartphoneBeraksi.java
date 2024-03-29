package pertemuan2;

public class SmartphoneBeraksi {

    public static void main(String args[]) {
        // Membuat Object
        
        // Object 1
        Smartphone hp1 = new Smartphone();
        hp1.merk = "Samsung";
        hp1.model = "Galaxy S23 Ultra";
        hp1.os = "Android 14";
        hp1.ukuranLayar = "6.8 inci";
        hp1.kapasitasBaterai = "5100 mAh";
        
        // Object 2
        Smartphone hp2 = new Smartphone();
        hp2.merk = "Apple";
        hp2.model = "iPhone 15 Pro Max";
        hp2.os = "iOS 17";
        hp2.ukuranLayar = "6.7 inci";
        hp2.kapasitasBaterai = "4700 mAh";
        
        // Memanggil Object
        
        // Object 1
        System.out.println("=== Object 1 : hp1 ===");
        System.out.println("Merk : " + hp1.merk);
        System.out.println("Model : " + hp1.model);
        System.out.println("OS : " + hp1.os);
        System.out.println("Ukuran Layar : " + hp1.ukuranLayar);
        System.out.println("Kapasitas Baterai : " + hp1.kapasitasBaterai);
        System.out.println("");
        
        // Object 2
        System.out.println("=== Object 2 : hp2 ===");
        System.out.println("Merk : " + hp2.merk);
        System.out.println("Model : " + hp2.model);
        System.out.println("OS : " + hp2.os);
        System.out.println("Ukuran Layar : " + hp2.ukuranLayar);
        System.out.println("Kapasitas Baterai : " + hp2.kapasitasBaterai);
    }
}
