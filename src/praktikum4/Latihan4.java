package praktikum4;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sebutkan salah satu unsur penting pembuat sejarah: ");

        String unsur = input.nextLine();
        String konversiUnsur = unsur.toLowerCase();

        switch (konversiUnsur) {
            case "waktu", "manusia", "ruang" :
                System.out.println("\n" + unsur + " merupakan salah satu unsur penting pembuat sejarah");
                break;
            default:
                System.out.println(unsur + " bukanlah salah satu unsur penting pembuat sejarah");
        }
    }
}