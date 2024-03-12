package Perulangan;
import java.util.Scanner;
public class LoopingFor {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int awal, akhir;
        System.out.println("Sejumlah Angka");
        System.out.print("Awal : ");
        awal = masuk.nextInt();
        System.out.print("Akhir : ");
        akhir = masuk.nextInt();
        for(int a = awal; a<=akhir; a++){
            System.out.println(a);
        }
    }
    
}
