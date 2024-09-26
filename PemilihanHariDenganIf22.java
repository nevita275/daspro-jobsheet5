import java.util.Scanner;
public class PemilihanHariDenganIf22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayName, dayType;

        System.out.println("Masukkan day angka: ");
        dayName = sc.nextInt();

        if (dayName == 1) {
            System.out.println("Weekday");   
        }
        else if (dayName == 2) {
            System.out.println("Weekday");
        }
        else if (dayName == 3) {
            System.out.println("Weekday");
        }
        else if (dayName == 4) { 
            System.out.println("Weekday");
        }
        else if (dayName == 5) {
            System.out.println("Weekday");
        }
        else if (dayName == 6) {
            System.out.println("Weekend");
        }
        else if (dayName == 7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
    
}
