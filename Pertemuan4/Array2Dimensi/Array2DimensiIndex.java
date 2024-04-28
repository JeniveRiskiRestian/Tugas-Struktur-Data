package Array2Dimensi;
public class Array2DimensiIndex {
    public static void main(String[] args) {
        String[][] alamat = {
            {"Alex", "\t (Kediri)"},
            {"Kenz", "\t (Blitar)"},
            {"Alvaro", "\t (Malang)"},
        };
        for(int i=0; i<alamat.length; i++){
       
        System.out.print(alamat[i][0]);
        System.out.println(alamat[i][1]);
    }
    }
}
