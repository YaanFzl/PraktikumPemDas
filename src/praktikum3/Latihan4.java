package praktikum3;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        int jumlahPembelian, menit, stokSemangka = 150, hargaSemangka = 100000, kelipatanDiskon;



        Scanner inputUser = new Scanner(System.in);
        System.out.println("======== TOKO BUAH A ========");
        System.out.print("Enter jumlah pembelian: ");
        jumlahPembelian = inputUser.nextInt();

        System.out.print("Enter jumlah menit: ");
        menit = inputUser.nextInt();

        int stokTersisa = stokSemangka;
        System.out.println("=============================");

        if (menit <= 0 || jumlahPembelian <= 0 || menit > 420 || jumlahPembelian > stokTersisa) {

            System.out.println("ERROR - Inputan Invalid!");
        } else {
            System.out.println("Jumlah pembelian : " + jumlahPembelian);
            stokTersisa -= jumlahPembelian;
            System.out.println("Stok tersisa : " + stokTersisa);
            hargaSemangka *= jumlahPembelian;
            if (menit >= 40){
                int check = menit / 40;
                kelipatanDiskon = check * 5000 * jumlahPembelian;
                hargaSemangka -= kelipatanDiskon;
                System.out.println("Hasil Pembelian : Rp" + hargaSemangka);
            } else {
                System.out.println("Hasil Pembelian : Rp" + hargaSemangka);
            }
    }
    }
}
