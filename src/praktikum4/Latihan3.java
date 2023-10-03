package praktikum4;

import java.util.Scanner;

public class Latihan3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nama bulan di kalender Hijriyah (Muharram, Safar, Rabiul Awal, dst.): ");

            String namaBulan = input.nextLine();
            String konversiNamaBulan = namaBulan.toLowerCase();

            switch (konversiNamaBulan) {
                case "muharram":
                case "rabiul awal":
                case "jumadil awal":
                case "rajab":
                case "zulkaidah":
                    System.out.println("Jumlah hari pada bulan " + namaBulan + " adalah 29 hari");
                    break;
                case "safar":
                case "rabiul akhir":
                case "jumadil akhir":
                case "syaban":
                case "ramadhan":
                case "syawal":
                    System.out.println("Jumlah hari pada bulan " + namaBulan + " adalah 30 hari");
                    break;
                case "zulhijjah":
                    System.out.println("Jumlah hari pada bulan " + namaBulan + " adalah 29/30 hari");
                    break;
                default:
                    System.out.println("Inputan tidak sesuai");
            }
        }
    }


