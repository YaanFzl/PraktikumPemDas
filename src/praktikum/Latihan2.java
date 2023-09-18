package praktikum;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String input1, input2, input3;

        System.out.print("Masukkan kalimat anda: ");
        input1 = inputUser.nextLine();
        System.out.print("Masukkan kalimat lainnya: ");
        input2 = inputUser.nextLine();
        System.out.print("Masukkan kalimat terakhir anda: ");
        input3 = inputUser.nextLine();

        System.out.println(input1 + "\n" + input2 + "\n" + "\t" + input3  );
    }

}
