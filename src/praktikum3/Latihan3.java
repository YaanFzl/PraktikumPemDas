package praktikum3;
import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beli, cashback = 5500, tambahanBarang, jumlahBarang;

        System.out.println("======== Selamat Datang di Toko Charlie ========");
        System.out.print("Banyak pembelian barang : ");
        beli = input.nextInt();
        System.out.println("==========================================");
        if (beli <= 0){
            System.err.println("ERROR - Inputan harus lebih dari 0");
        } else {
            tambahanBarang = beli / 3;
            jumlahBarang = beli + tambahanBarang;
            if (beli % 7 == 0){
                System.out.println("Cashback : " + cashback);
            } else  {
                int kelipatan = beli / 7;
                System.out.println("Cashback : " + cashback * kelipatan);
            }
            System.out.println("Tambahan Barang : " + tambahanBarang);
            System.out.println("Jumlah Barang : " + jumlahBarang );
        }
    }
}