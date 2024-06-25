package belajar;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Nama kamu adalah "+name);
    }
}
