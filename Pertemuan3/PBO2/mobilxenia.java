package PBO2;
public class mobilxenia {
    public static void main(String[] args) {
        
        mobil xenia = new mobil();
        
        xenia.merkMobil = "Xenia" ;
        xenia.tahunMobil = 2016;
        xenia.warnaMobil = "Silver" ;
        
        System.out.println("Membuat objek mobil xenia dari class mobil");
        System.out.println("merk mobil = " + xenia.merkMobil);
        System.out.println("tahun mobil = " + xenia.tahunMobil);
        System.out.println("warna mobil = " + xenia.warnaMobil);
        xenia.mobilBerjalan();
        xenia.mobilBerhenti();
        
    }
    
}
