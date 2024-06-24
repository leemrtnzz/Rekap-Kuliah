import java.util.Scanner;

public class belajar_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai perulangan: ");
        int nilai = input.nextInt();
        for (int i = 1; i <= nilai; i++){
            System.out.println("Saya berjanji tidak akan mengulanginya lagi. [" + i + "]");
        }
    }
}
