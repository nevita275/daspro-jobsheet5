import java.util.Scanner;
public class Siakad22 {
    public static void main (String [] args) {
    
    Scanner sc = new Scanner(System.in);
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();
    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai UTS: ");
    nilaiUts = sc.nextDouble();
    System.out.print("Masukkan nilai UAS: ");
    nilaiUas = sc.nextDouble();

    nilaiAkhir = ((nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35))/ 4; {

    System.out.println("Nama: " + nama + "NIM: " + nim);
    System.out.println("Kelas: " + kelas + "Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);
    }

    String kualifikasi, nilaiAkhirHuruf;

    if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
        nilaiAkhirHuruf = "A";
        kualifikasi = "Sangat baik";    
    }
    else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
        nilaiAkhirHuruf = "B+";
        kualifikasi = "Lebih dari baik";
    }
    else if (nilaiAkhir <= 73 && nilaiAkhir > 65 ) {
        nilaiAkhirHuruf = "B";
        kualifikasi = "Baik";
    }
    else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
        nilaiAkhirHuruf = "C+";
        kualifikasi = "Lebih dari Cukup";    
    }
    else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
        nilaiAkhirHuruf = "C";
        kualifikasi = "Cukup";
    }
    else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
        nilaiAkhirHuruf = "D";
        kualifikasi = "Kurang";
    }
    else {
        nilaiAkhirHuruf = "E";
        kualifikasi = "Gagal";
    }

    System.out.println("Nilai akhir huruf : " + nilaiAkhirHuruf);
    System.out.println("Kualifikasi : " + kualifikasi);

    }
}
