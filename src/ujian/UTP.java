package ujian;

import java.util.Scanner;
public class UTP {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String username, NIM;
        int menu;

        System.out.print("Masukkan username anda (nama lengkap anda): ");
        username = inputUser.nextLine();
        System.out.print("Masukkan password anda (NIM anda): ");
        NIM = inputUser.nextLine();
        if (NIM.equals("2311016210031") && username.equals("ahmad ryan faizal")){
            System.out.println("\nMenu Quiz Matematika:");
            System.out.println("1. 5 digit (?)");
            System.out.println("2. Monster (?)");
            System.out.println("3. Ayam (?)");
            System.out.print("Pilih menu (1-3): ");

            menu = inputUser.nextInt();

            switch (menu){
                case 1 :
                    System.out.print("Yok coba tebak 5 digitnya π: 3,xxxxx: ");
                    float tebakan; tebakan = inputUser.nextFloat();

                    if (tebakan == 3.14159F){
                        System.out.println("Wow, kamu dapat menebak semua digit dengan benar");
                    }  else {
                        System.err.println("Tebakan anda tidak tepat");
                    } break;

                case 2 :
                    System.err.println("Didepanmu ada monster dengan darah 100 dan memiliki armor bernilai 300");
                    System.out.println(" ");
                    System.out.println("Kamu mempunyai 2 anak panah yaitu panah besi dan kayu");
                    System.out.println("Masing-masing anak panah besi dan kayu menghasilkan kerusakan pada monster senilai 30 dan 10");
                    System.out.println("dan kamu hanya memiliki masing-masing 12 stok dari anak-anak panah tersebut");

                    final int monster = 400; int pBesi = 30, pKayu = 10, pBesiUser, pKayuUser, total;

                    System.out.println("\n Berapakah anak panah besi yang akan kamu gunakan?");
                    pBesiUser = inputUser.nextInt();
                    System.out.println("dan berapakah anak panah kayu yang akan kamu gunakan?");
                    pKayuUser = inputUser.nextInt();

                    pBesi *= pBesiUser; pKayu *= pKayuUser; total = pBesi + pKayu;

                    if (pBesiUser > 12 || pKayuUser > 12){
                        System.out.println("Maaf anda tidak mempunyai anak panah sebanyak itu");
                        System.err.println("Dikarenakan kesalahan perhitungan anda maka anda telah mati");
                    } else {
                        if (total >= monster){
                            System.out.println("Selamat anda berhasil membunuh monster di depan anda!");
                        } else {
                            System.err.println("Sayang sekali anda termakan monster :( ");
                        }
                    } break;

                case 3 :
                    String telurAyam = "\uD83D\uDC23", anakAyam = "\uD83D\uDC23", ortuAyam = "\uD83D\uDC25";
                    System.out.println(telurAyam + " + " + telurAyam + " + " + telurAyam + " = 9");
                    System.out.println(telurAyam + " + " + anakAyam + " + " + ortuAyam + " = 17");
                    System.out.println(telurAyam + " + " + anakAyam + " + " + ortuAyam + " = 15");
                    System.out.println("Berapakah hasil dari soal berikut? ");
                    System.out.println(anakAyam + " + " + ortuAyam  + " + " + telurAyam + " = ?");

                    int ayam = inputUser.nextInt();
                    if (ayam == 22){
                        System.out.println("Kamu kerja di KFC ya? jawabanmu kok benar");
                    } else {
                        System.err.println("Coba lagi ya");
                    } break;
                default:
                    System.err.println("Silahkan memilih menu yang benar");
            }
        } else {
            System.err.println("Username atau Password anda salah");
        }
    }
}