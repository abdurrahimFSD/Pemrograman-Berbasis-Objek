package pertemuan2;

public class SepedaBeraksi {

    public static void main(String args[]) {
        // Membuat Object
        
        // Object 1
        Sepeda sepeda1 = new Sepeda();
        sepeda1.merk = "Polygon";
        sepeda1.tipe = "Sepeda Gunung";
        sepeda1.ukuranRoda = "26 inci";
        sepeda1.warna = "Hitam";
        sepeda1.jumlahGigi = 10;
        
        // Object 2
        Sepeda sepeda2 = new Sepeda();
        sepeda2.merk = "United";
        sepeda2.tipe = "Sepeda Lipat";
        sepeda2.ukuranRoda = "16 inci";
        sepeda2.warna = "Biru";
        sepeda2.jumlahGigi = 6;
        
        // Memanggil Object
        
        // Object 1
        System.out.println("Object 1 : Sepeda 1");
        System.out.println("Merk : " + sepeda1.merk);
        System.out.println("Tipe : " + sepeda1.tipe);
        System.out.println("Ukuran Roda : " + sepeda1.ukuranRoda);
        System.out.println("Warna : " + sepeda1.warna);
        System.out.println("Jumlah Gigi : " + sepeda1.jumlahGigi);
        System.out.println("");
        
        // Object 2
        System.out.println("Object 2 : Sepeda 2");
        System.out.println("Merk : " + sepeda2.merk);
        System.out.println("Tipe : " + sepeda2.tipe);
        System.out.println("Ukuran Roda : " + sepeda2.ukuranRoda);
        System.out.println("Warna : " + sepeda2.warna);
        System.out.println("Jumlah Gigi : " + sepeda2.jumlahGigi);
    }
}
