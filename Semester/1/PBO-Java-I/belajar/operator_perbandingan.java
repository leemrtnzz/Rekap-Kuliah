package belajar;
import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        /*
        * Operator perbandingan
        *
        * == sama dengan (x == y)
        * != tidak sama dengan (x != y)
        * > lebih besar dari (x > y)
        * < kurang dari (x < y)
        * >= lebih besar dari atau sama dengan (x >= y)
        * <= kurang dari atau sama dengan ( x <= y )
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai 1: ");
        int nilai1 = input.nextInt();
        System.out.println("Nilai 2: ");
        int nilai2 = input.nextInt();
        // percabangan ganda
        if(nilai1 == nilai2) {
            System.out.println("Nilai 1 sama dengan Nilai 2");
        } else if(nilai1 != nilai2){
            System.out.println("Nilai 1 tidak sama dengan Nilai 2");
        } else if (nilai1 > nilai2) {
            System.out.println("Nilai 1 lebih besar dari Nilai 2");
        } else if (nilai1 < nilai2) {
            System.out.println("Nilai 1 kurang dari Nilai 2");
        } else if (nilai1 >= nilai2) {
            System.out.println("Nilai 1 lebih besar dari atau sama dengan Nilai 2");
        } else if (nilai1 <= nilai2) {
            System.out.println("Nilai 1 kurang dari atau sama dengan Nilai 2");
        } else {
            System.out.println("Nilai 1 atau 2 tidak diketauhi");
        }
    }
}
