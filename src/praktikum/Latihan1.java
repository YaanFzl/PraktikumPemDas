package praktikum;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        String nama, NIM, prodi;

        System.out.print("Siapa nama anda? ");
        nama = inputUser.nextLine();

        System.out.print("Berapakah NIM anda? ");
        NIM = inputUser.nextLine();

        System.out.print("Dari prodi manakah anda? ");
        prodi = inputUser.nextLine();

        System.out.println("Selamat datang " + nama + " dengan NIM " + NIM + " dari Prodi " + prodi);
    }
}
