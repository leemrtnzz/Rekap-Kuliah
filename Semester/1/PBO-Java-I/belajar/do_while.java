package belajar;
import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // do while
        int i = 0;
        do {
            System.out.println("Ini perulangan ke-"+dowhile);
            i++;
        } while (i <= 10); // mengulang perulangan sampai kondisi while terpenuhi
        
        //Menggunakan input
        String ulang = "";
        do {
            System.out.println("Ulangi ngga? y/n");
            ulang = input.next();
        } while (ulang.equals("y"));
    }
}
