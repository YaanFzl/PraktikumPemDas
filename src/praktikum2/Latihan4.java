package praktikum2;

import java.util.Scanner;

public class Latihan4 {
        public static void main(String[] args) {
            Scanner userInput= new Scanner(System.in);
            final double PI= 3.141592;

            System.out.print("Masukkan jari-jari lingkaran yang anda mau: ");
            double r = userInput.nextDouble();

            //ini rumus lingkaran
            double hasil = PI*r*r;

            System.out.println("Hasil luas lingkarannya adalah: " + (int)hasil);

        }

}
