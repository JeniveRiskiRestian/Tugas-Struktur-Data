package PBO1;
public class PanggilObjek {
    public static void main(String[] args) {
        
        Lingkaran L = new Lingkaran();
        System.out.println("Panggil Objek Lingkaran");
        System.out.println("phi = " + L.phi);
        System.out.println("jari-jari = " + L.jari2);
        L.luas = L.phi * (L.jari2*L.jari2);
        System.out.println("Luas Lingkaran = " + L.luas);
    }
    
}
