package pertemuan3;

public class Sepeda {
    int gir;
    String merk;
    
    // Method(mutator) dengan parameter
    void setGir(int pertambahanGir) {
        gir += pertambahanGir;
    }
    
    void setTurunGir(int turunGir) {
        gir -= turunGir;
        if(gir <= 1) {
            gir = 1;
            System.out.println("Posisi gir sudah paling rendah");
        }
    }
    
    void setMerk(String namaMerk) {
        merk = namaMerk;
    }
    
    // Method(accessor) 
    int getGir() {
        return gir;
    }
    
    String getMerk() {
        return merk;
    }
    
}
