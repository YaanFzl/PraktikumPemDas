package praktikum4;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Berapakah hasil dari 1 + 1 ?");
        System.out.println("A. 9 \nB. 7 \nC. 5 \nD. 2 \nE. 0");

        System.out.print("Manakah Pilihan yang Benar? ");
        char jawaban = input.next().toLowerCase().charAt(0);
        String label = null;

        switch (jawaban){
            case 'a':
            case 'b':
            case 'c':
                label = "salah";
                break;
            case 'd':
                label = "benar";
                break;
            case 'e':
                label = "salah";
        }
        System.out.println("Jawaban anda " + label);
    }
}
