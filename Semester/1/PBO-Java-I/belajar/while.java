package belajar;
import java.util.Scanner;

public class while {
    public static void main(String[] args) {
        /*
        * Operator Logika
        * && mengembalikan nilai benar jika kedua pernyataan bernilai benar ( x < 6 && x < 10)
        * || mengembalikan nilai benar jika salah satu pernyataan bernilai benar (x > 10 || x < 15)
        * ! mengembalikan hasil, mengembalikan salah jika hasilnya nilai benar (x = true)
        * */
        Scanner input = new Scanner(System.in);
        boolean stat = true;
        //while menggunakan input lalu cek menggunakan if percabangan
        while (stat) {
            System.out.println("Ulangi ngga? y/n");
            String ulang = input.next();
            if(ulang.equals("y")){
                stat = true;
            } else {
                stat = false;
            }
        }
        //while menggunakan input lalu cek menggunakan ternary
        while(stat) {
            System.out.println("Ulangi ngga? y/n");
            String ulang = input.next();
            boolean update = ulang.equals("y") ? true : false;
            stat = update;
        }
        
    }
}
