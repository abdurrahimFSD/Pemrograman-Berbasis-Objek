package pertemuan3;

public class PesawatBeraksi {
    public static void main(String[] args) {
        // Membuat Objek Pesawat
        Pesawat pesawat1 = new Pesawat("Boeing 737", 150);
        
        // Mengakses dan Mencetak nilai
        System.out.println("Jenis Pesawat : " + pesawat1.getJenis());
        System.out.println("Jumlah Penumpang : " + pesawat1.getJumlahPenumpang());
        
        // Mengubah Nilai
        pesawat1.setJenis("Airbus A320");
        pesawat1.setJumlahPenumpang(180);
        
        // Mengakses dan Mencetak nilai setelah di ubah
        System.out.println("Jenis Pesawat Baru : " + pesawat1.getJenis());
        System.out.println("Jumlah Penumpang Baru : " + pesawat1.getJumlahPenumpang());
        
        
    }
}
