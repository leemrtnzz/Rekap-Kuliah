import java.util.Scanner;

public class for-x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukan nilai batas: ");
        int batas = input.nextInt();

        // Bagian atas
        for (int i = 0; i < batas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= batas; k++) {
                System.out.print(k);
            }
            for (int j = 0; j < (batas - i) * 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= batas; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        // Bagian bawah
        for (int i = batas - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= batas; k++) {
                System.out.print(k);
            }
            for (int j = 0; j < (batas - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= batas; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        input.close();
    }
}