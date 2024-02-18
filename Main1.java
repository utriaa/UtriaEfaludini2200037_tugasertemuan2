package no1;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
//input tigas bilangan bulat
    System.out.print("Masukan bilangan bulat pertama: ");
    int bil1=scanner.nextInt();
    System.out.print("Masukan bilangan bulat kedua: ");
    int bil2=scanner.nextInt();
    System.out.print("Masukan bilangan bulat ketiga: ");
    int bil3=scanner.nextInt();
    
//operasi aritmatika
    int penjumlahan = bil1 + bil2 + bil3;
    int pengurangan = bil1 - bil2 - bil3;
    int perkalian = bil1 * bil2 * bil3;
    double pembagian = (double) bil1 / bil2 / bil3;
    
//menampilkan hasil operasi aritmatika
System.out.println("Hasil penjumlahan:" +penjumlahan);
System.out.println("Hasil pengurangan:" +pengurangan);
System.out.println("Hasil perkalian:" +perkalian);

    
//menampilkan hasil pembagian jika bilangan kedua dan ketiga tidak nol
    if(bil2 != 0 && bil3 != 0){
    System.out.println("Hasil pembagian:" +pembagian);
}else {
    System.out.println("Tidak bisa melakukan pembagian karena bilangan kedua atau ketiga adalah nol.");
}
scanner.close();
    }  
}

