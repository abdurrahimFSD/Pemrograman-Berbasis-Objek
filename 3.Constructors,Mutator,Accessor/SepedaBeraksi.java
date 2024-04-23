package pertemuan3;

public class SepedaBeraksi {

    public static void main(String args[]) {
        Sepeda sepeda1 = new Sepeda();
        
        sepeda1.setGir(1);
        System.out.println("Gir saat ini : " + sepeda1.getGir());
        
        sepeda1.setMerk("Polygon");
        System.out.println("Merk sepeda saat ini : " + sepeda1.getMerk());
        
        sepeda1.setGir(3);
        System.out.println("Gir setelah di tambah : " + sepeda1.getGir());
        
        sepeda1.setTurunGir(6);
        System.out.println("Gir setelah di kurang : " + sepeda1.getGir());
    }
    
}
