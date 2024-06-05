import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai kamu: ");
        int nilai = input.nextInt();
        String hasil = (nilai >= 80) ? "Kamu lulus dengan nilai bagus" : (nilai >= 70) ? "Nilai kamu lumayan, kerja bagus" : "Remedial";
        System.out.println(hasil);
    }
}
