package pertemuan3;

public class Pesawat {
    String jenis;
    int jumlahPenumpang;
    
    // Konstruktor
    public Pesawat(String jenis, int jumlahPenumpang) {
        this.jenis = jenis;
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    // Mutator (Setter)
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Mutator (Setter)
    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
    
    // Accessor (Getter)
    public String getJenis() {
        return jenis;
    }
    
    // Accessor (Getter)
    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }
}
