package Perulangan;
import java.util.Scanner;
public class LoopingDoWhile {
    public static void main(String[] args) {
        String nama, alamat, loop;
        do {
            Scanner masuk = new Scanner (System.in);
            System.out.print("Nama : ");
            nama = masuk.nextLine();
            System.out.print("Alamat : ");
            alamat = masuk.nextLine();
            System.out.println("=========================");
            System.out.println(nama+ " tinggal di "+ alamat);
            System.out.print("Ulang (Y/N) : ");
            loop = masuk.next();
        }
        while (loop.equalsIgnoreCase("Y"));
        System.out.print("Program Selesai");
    }
    
}
