package uts;

// Class = Mobil
public class Mobil {
    // Attributes
    // Attributes dengan encapsulation
    private String merk;
    private int gigi;
    
    // Constructor
    public Mobil(String merk, int gigi) {
        this.merk = merk;
        this.gigi = gigi;
    }
    
    // Setter merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    // Setter naik gigi
    public void setNaikGigi(int naikGigi) {
        this.gigi += naikGigi;
    }
    
    // Setter turun Gigi
    public void setTurunGigi(int turunGigi) {
        int cekGigi = gigi - turunGigi;
        if (cekGigi <= 1) {
            this.gigi = 1;
        } else {
            this.gigi -= turunGigi;
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
        //System.out.println("--------------");
    }
}
