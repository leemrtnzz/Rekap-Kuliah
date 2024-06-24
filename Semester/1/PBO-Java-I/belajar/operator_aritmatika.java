package belajar;
import java.util.Scanner;

public class operator_aritmatika {
    public static void main(String[] args) {
        /*
        * Operator arithmetic atau arithmetica:
        * + Penjumlahan Menjumlahkan dua nilai x + y
        * - Pengurangan Mengurangkan satu nilai dari nilai lainnya x - y
        * * Perkalian Mengalikan dua nilai x * y
        * / Pembagian Membagi satu nilai dengan nilai lainnya x / y
        * % Modulus Mengembalikan sisa pembagian x % y
        * ++ Kenaikan Menambah nilai variabel sebesar 1
        *  -- Pengurangan Mengurangi nilai variabel sebesar 1
        * */
        int x = 10;
        int y = 10;
        System.out.println(x + y); // 20
        System.out.println(x - y); // 0
        System.out.println(x * y); // 100
        System.out.println(x / y); //1
        System.out.println(x % y); //0
        System.out.println(x + y); //20
        System.out.println(++x); //11
        System.out.println(--x); //10
        /*
        * = sama seperti x = 5
        * += sama sepert x = x + 3
        * -= sama sepert x = x - 3
        * *= sama sepert x = x * 3
        * /= sama sepert x = x / 3
        * %= sama sepert x = x % 3
        * */
        int p;
        System.out.println(p = 5); // 5
        System.out.println(p += 3); // 8
        System.out.println(p -= 3); // 5
        System.out.println(p *= 5); // 25
        System.out.println(p /= 5); // 5
        System.out.println(p %= 5); // 0
    }
}
