package belajar;
import java.util.Scanner;

public class while {
    public static void main(String[] args) {
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
        int nilai = 0;
        while(nilai <= 10) {
            System.out.println("Saya berjanji tidak akan telat lagi. ("+nilai+")");
            nilai++;
        }
    }
}
