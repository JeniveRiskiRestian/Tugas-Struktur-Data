package TipeData;

public class Biodata {
    
    public static void main(String[] args) {
        // Membuat biodata dengan 5 tipe data yang berbeda
        String nim = "2355201032";
        String nama = "Jenyve Riski Restian";
        Double BB = 41.9;
        int umur = 20;
        char goldar = 'O';
        boolean perempuan = true;
        
        System.out.println("===============BIODATA===============");
        System.out.println("NIM                  = " + nim);
        System.out.println("NAMA                 = " + nama); 
        System.out.println("BERAT BADAN          = " + BB);
        System.out.println("UMUR                 = " + umur);
        System.out.println("Goldar               = " + goldar);
        if(perempuan==true) {
            System.out.println("Gender               = perempuan");
        }
    }
}
