package praktikum3;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        double laptop = 850.56, bukuTulis = 250.11, kotakPensil = 23.11, smartphone = 200.00, beratBarang;
        char indeksBerat = 0;
        int total;

        double hasil1, hasil2, hasil3, hasil4;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("======== Indeks Berat Barang Bawaan Tasku ========");
        System.out.print("Banyak laptop: ");
        total = inputUser.nextInt();
        hasil1 = total * laptop;


        System.out.print("Banyak Buku Tulis: ");
        total = inputUser.nextInt();
        hasil2 = total * bukuTulis;

        System.out.print("Banyak Kotak Pensil: ");
        total = inputUser.nextInt();
        hasil3 = total * kotakPensil;

        System.out.print("Banyak Smartphone: ");
        total = inputUser.nextInt();
        hasil4 = total * smartphone;

        System.out.println("=============================================");
        
        beratBarang = hasil1 + hasil2 + hasil3 + hasil4;

        if( hasil1 < 0 || hasil2 < 0 || hasil3 < 0 || hasil4 < 0){
            System.err.println("ERROR - Tidak diperkenankan bilangan negatif");
        } else {
            if (beratBarang > 2000){
                indeksBerat = '5';
            } else if (beratBarang >= 1500){
                indeksBerat = '4';
            } else if (beratBarang >= 1000) {
                indeksBerat = '3';
            } else if (beratBarang >= 500) {
                indeksBerat ='2';
            } else if (beratBarang > 0) {
                indeksBerat = '1';
            } else if (beratBarang >= 0){
                indeksBerat = '0';
            }

            System.out.println("Indeks Berat Barangnya adalah : " + indeksBerat);
            if (indeksBerat == '5'){
                System.err.println("Berat barang melebihi ketentuan");
            } else {
                System.out.println("Barang tidak melebihi ketentuan lur");
            }

        }
    }
}
