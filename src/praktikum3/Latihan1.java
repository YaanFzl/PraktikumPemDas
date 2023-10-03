package praktikum3;

import java.util.Scanner;

public class Latihan1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan bilangan yang berkelipatan 5 dan juga ganjil : ");
            int bilangan = input.nextInt();
            if (bilangan % 2 != 0) {
                System.out.println("Bilangan Genap");
            } else {
                System.out.println("Bilangan Ganjil");
            }
        }
}


