package belajar;
import java.util.Scanner;

public class for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // for atau perulangan
        for(int i = 0; i <= 100;i++){
            System.out.println("Saya berjanji tidak akan mengulanginya lagi");
        }
        // for menggunakan input
        System.out.println("Masukan mau berapa yang diulang: ");
        int hitung = input.nextInt();
        for(int i = 0; i <= hitung;i++) {
            System.out.println("ini adalah perulangan ke-"+i);
        }
    }
}
