package praktikum2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int bilangan;
        System.out.print("Masukkan bilangan anda: ");
        bilangan = inputUser.nextInt();


        String cek = bilangan % 2 == 0 ? "genap" : "ganjil";

        System.out.println("Bilangan yang anda masukkan adalah bilangan " + cek );
    }
}