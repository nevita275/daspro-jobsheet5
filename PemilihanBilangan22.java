import java.util.Scanner;
public class PemilihanBilangan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        
        String hasil;

        if (angka % 2 == 0){
            hasil="Bilangan genap";
        }
        else{
            hasil="Bilangan ganjil";
        }
        
            System.out.println("Angka " + angka + " adalah " + hasil);
        }
    }   
