package belajar;
import java.util.Scanner;

public class operator_logika {
    public static void main(String[] args) {
        /*
        * Operator Logika
        * && mengembalikan nilai benar jika kedua pernyataan bernilai benar ( x < 6 && x < 10)
        * || mengembalikan nilai benar jika salah satu pernyataan bernilai benar (x > 10 || x < 15)
        * ! mengembalikan hasil, mengembalikan salah jika hasilnya nilai benar (x = true)
        * */
       Scanner input = new Scanner(System.in);
       System.out.println("Masukan profesi: ");
       String profesi = input.next();
       int umur = input.nextInt();
       if (profesi.equals("programmer") && umur >= 18 || profesi.equals("desainer") && umur >= 18) {
            System.out.println("Kamu sudah cocok jadi mantuku");
       } else {
            System.out.println("Kamu sudah cocok jadi mantuku");
       }
       System.out.println(hasil);
    }
}  
