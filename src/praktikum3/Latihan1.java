package praktikum3;

import java.util.Scanner;

public class Latihan1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan bilangan yang berkelipatan 5 dan juga ganjil : ");
            int bilangan = input.nextInt();
            if (bilangan % 5 == 0 && bilangan % 2 != 0) {
                System.out.println("Program Started");
            } else {
                System.out.println("Program Halted");
            }
        }
}


