package pertemuan2;

public class MobilBeraksi {

    public static void main(String args[]) {
        // Membuat Object mobil1
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2020;
        
        // Panggil 
        System.out.println("Merk : " + mobil1.merk);
        System.out.println("Warna : " + mobil1.warna);
        System.out.println("Tahun : " + mobil1.tahun);
    }
}
