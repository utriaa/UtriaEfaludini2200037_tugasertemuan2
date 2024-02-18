package no2;
import java.util.Scanner;

public class Main2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang (dalam rupiah): ");
        int uang = scanner.nextInt();
        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = scanner.nextBoolean();

        if (uang > 5000 && !hujan) {
            System.out.println("Anda memiliki uang lebih dari 5000 rupiah dan hari tidak hujan.");
            System.out.println("Ayo saatnya membeli gorengan!");
        } else {
            System.out.println("Anda tidak bisa membeli gorengan.");
            if (uang <= 5000) {
                System.out.println("Anda tidak memiliki cukup uang.");
            } if (hujan) {
                System.out.println("Hari ini hujan, lebih baik menabung uang Anda."); }
        }
        scanner.close();
    } }
