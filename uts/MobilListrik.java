package uts;

// Inheritance = Mobil Listrik
// Dari class = Mobil
public class MobilListrik extends Mobil{
    
    // Attribute
    int baterai;
    
    // Constructor
    public MobilListrik(String merk, int gigi, int baterai) {
        // super
        super(merk, gigi);
        this.baterai = baterai;
    }
    
    // Setter turunBaterai
    public void setTurunBaterai(int turunBaterai) {
        this.baterai -= turunBaterai;
    }
    
    // Getter Baterai
    public int baterai() {
        return baterai;
    }
    
    // Method
    // Polymorphism
    public void infoMobil() {
//        System.out.println("Merk : " + getMerk());
//        System.out.println("Gigi : " + getGigi());
        super.infoMobil();
        System.out.println("Baterai : " + baterai);
        System.out.println("--------------------");
    }
}
