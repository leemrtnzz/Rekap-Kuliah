package belajar;
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan masukan nilai");
        double nilai = input.nextFloat();
        String hasil = (nilai >= 90) ? "Nilai kamu "+nilai+" bagus, Pertahankan!"
                : (nilai >= 75) ? "Nilai kamu "+nilai+" baik, semangat berjuang lagi!"
                : (nilai >= 60) ? "Nilai kamu "+nilai+" lumayan, semangat berjuang lagi!"
                : "Kamu harus ikut semester antara";
        System.out.println(hasil);
        // Mencetak hasil sesuai dengan nilai yang diinput, menggunakan ternary
}
}
