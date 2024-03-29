package pertemuan2;

public class PesawatBeraksi {

    public static void main(String args[]) {
        // Membuat Object dari class Pesawat
        
        // Object 1
        Pesawat pesawat1 = new Pesawat();
        pesawat1.namaPesawat = "Garuda Indonesia";
        pesawat1.tipePesawat = "Boeing 747";
        pesawat1.jarakTempuh = "14000 km";
        pesawat1.kapasitasPenumpang = 450;
        
        // Object 2
        Pesawat pesawat2 = new Pesawat();
        pesawat2.namaPesawat = "Lion Air";
        pesawat2.tipePesawat = "Airbus";
        pesawat2.jarakTempuh = "10000 km";
        pesawat2.kapasitasPenumpang = 410;
        
        // Memanggil Object
        
        // Object 1
        System.out.println("==== Object 1 = Pesawat 1 ====");
        System.out.println("Nama Pesawat : " + pesawat1.namaPesawat);
        System.out.println("Tipe Pesawat : " + pesawat1.tipePesawat);
        System.out.println("Jarak Tempuh : " + pesawat1.jarakTempuh);
        System.out.println("Kapasitas Penumpang : " + pesawat1.kapasitasPenumpang);
        System.out.println("");
        
        // Object 2
        System.out.println("==== Object 2 = Pesawat 2 ====");
        System.out.println("Nama Pesawat : " + pesawat2.namaPesawat);
        System.out.println("Tipe Pesawat : " + pesawat2.tipePesawat);
        System.out.println("Jarak Tempuh : " + pesawat2.jarakTempuh);
        System.out.println("Kapasitas Penumpang : " + pesawat2.kapasitasPenumpang);
    }
}
