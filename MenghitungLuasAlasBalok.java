package menghitung.luas.alas.balok;
import java.util.Scanner;

public class MenghitungLuasAlasBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang balok: ");
        int panjang = input.nextInt();
        System.out.print("Masukan lebar alas balok: ");
        int lebar  = input.nextInt();
        
        int LuasAlas = panjang * lebar;
        System.out.print("Luas alas balok tersebut adalah: "+ LuasAlas);
       
    }
    
}
