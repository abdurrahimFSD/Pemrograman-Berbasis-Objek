package pertemuan5;

// Inheritance (MobilListrik)
public class MobilListrik extends Mobil{
    // Atribute MobilListrik dengan encapsulation
    private int baterai;
    
    // Constructor
    public MobilListrik(String merk, int gigi, int baterai) {
        // super
        super(merk, gigi);
        this.baterai = baterai;
    }
    
    // setter baterai
    public void setTurunBaterai(int turunBaterai) {
        this.baterai -= turunBaterai;
    }
    
    // Getter baterai
    public int getBaterai() {
        return baterai;
    }
    
    // Method
    // Polymorphism Overriding
    public void infoMobil() {
        super.infoMobil();
        System.out.println("Baterai : " + baterai);
        System.out.println("====================");
    }
}
