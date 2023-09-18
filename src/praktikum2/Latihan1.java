package praktikum2;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Selamat datang di program penghitungan volume balok!");

        double panjang, tinggi, lebar;

        System.out.print("Masukkan panjang balok anda: ");
        panjang = inputUser.nextDouble();
        System.out.print("Masukkan lebar balok anda: ");
        lebar = inputUser.nextDouble();
        System.out.print("Masukkan tinggi balok anda: ");
        tinggi = inputUser.nextDouble();

        double hasil = panjang * tinggi * lebar;

        System.out.println("Hasil dari volume baloknya adalah: " + hasil + " cm^3");
    }
}
