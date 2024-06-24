package belajar;
import java.util.Scanner;
public class switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //switch
        System.out.println("Masukan pilihan: ");
        String perintah = input.next();
        switch (perintah) {
            case "1" : {
                System.out.println("Ini adalah perintah 1");
                break;
            }
            case "2" : {
                System.out.println("Ini adalah perintah 2");
                break;
            }
            default: {
                System.out.println("tidak ada dalam menu");
            }
        }
        // maka akan mencetak sesuai dengan apa yang dipilih
    }
}
