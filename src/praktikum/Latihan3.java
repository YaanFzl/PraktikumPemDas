package praktikum;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String quotes;

        System.out.print("Masukkan quotes pusaka yang kamu miliki: ");
        quotes = inputUser.nextLine();

        System.out.println('\"' + quotes + '\"');

    }
}
