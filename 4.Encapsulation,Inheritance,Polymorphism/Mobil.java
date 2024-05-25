package pertemuan5;

public class Mobil {
    // Atribute dengan encapsulation
    private String merk;
    private int gigi;
    
    // Constructor
    public Mobil(String merk, int gigi) {
        this.gigi = gigi;
        this.merk = merk;
    }
    
    // Setter merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    // Setter gigi
    public void setGigi(int gigi) {
        this.gigi= gigi;
    }
    
    // Setter gigi (Polymorphism Overloading)
    public void setGigi(int gigi, boolean naikGigi) {
        if(naikGigi) {
            this.gigi += gigi;
        }
    }
    
    // Getter merk
    public String getMerk() {
        return merk;
    }
    
    // Getter gigi
    public int getGigi() {
        return gigi;
    }
    
    // Method infoMobil
    public void infoMobil() {
        System.out.println("Merk : " + merk);
        System.out.println("Gigi : " + gigi);
//        System.out.println("==============");
    }
}
