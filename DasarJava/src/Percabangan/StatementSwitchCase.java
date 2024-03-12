package Percabangan;
import java.util.Scanner;
public class StatementSwitchCase {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Input (1/2) : ");
        int pilihan = masuk.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("Laki-laki");
                break;
            case 2:
                System.out.println("Perempuan");
                break;
            default:
                System.out.println("pilihan salah");
                break;
            
        }
    }
    
}
