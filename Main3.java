package no3;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter: ");
        char karakter1 = scanner.next().charAt(0);
        System.out.print("Masukkan karakter: ");
        char karakter2 = scanner.next().charAt(0);

        int kodeASCII1 = (int) karakter1;
        int kodeASCII2 = (int) karakter2;
        int jumlahKodeASCII = kodeASCII1 + kodeASCII2;
        
        System.out.println("Hasil penjumlahan kode ASCII adalah: " + jumlahKodeASCII);

        scanner.close();
    }
}
