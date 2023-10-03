package praktikum4;

import java.util.Scanner;
public class Latihan1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Program Penghitungan Sisi Segitiga");
            System.out.println("1. Mencari Nilai Sisi a (alas) ");
            System.out.println("2. Mencari Nilai Sisi b (tinggi) ");
            System.out.println("3. Mencari Nilai Sisi c (diagonal) ");
            System.out.print("Pilih operasi (1/2/3): ");
            int operasi = input.nextInt();

            double a, b, c;

            switch (operasi) {
                case 1:
                    System.out.print("Masukkan nilai sisi b (tinggi): ");
                    b = input.nextDouble();
                    System.out.print("Masukkan nilai sisi c (diagonal): ");
                    c = input.nextDouble();
                    a = Math.sqrt(c * c - b * b);
                    System.out.println("Nilai sisi a adalah: " + a);
                    break;
                case 2:
                    System.out.print("Masukkan nilai sisi a (alas): ");
                    a = input.nextDouble();
                    System.out.print("Masukkan nilai sisi c (diagonal): ");
                    c = input.nextDouble();
                    b = Math.sqrt(c * c - a * a);
                    System.out.println("Nilai sisi b adalah : " + b);
                    break;
                case 3:
                    System.out.print("Masukkan nilai sisi a (alas): ");
                    a = input.nextDouble();
                    System.out.print("Masukkan nilai sisi b (tinggi): ");
                    b = input.nextDouble();
                    c = Math.sqrt(a * a + b * b);
                    System.out.println("Nilai sisi c adalah: " + c);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }