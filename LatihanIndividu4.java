import java.util.Scanner;
public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int umur;
        String kategori;

        System.out.println("Masukkan umur : ");
        umur = sc.nextInt();

        if (umur >= 0 && umur <= 12) {
            System.out.println("Kategori Anak");
        }
        else if (umur > 12 && umur <= 19) {
            System.out.println("Ktegori Remaja");
        }
        else if (umur > 19 && umur <= 64) {
            System.out.println("Kategori Dewasa");
        }
        else if (umur >= 65) {
            System.out.println("Kategori Lansia");
        }
        else {
            System.out.println("umur tidak valid");
        }

         }
    }
    