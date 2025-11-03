package UKL;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        // Input bilangan dari pengguna
        System.out.print("Masukkan sebuah bilangan: ");
        bilangan = input.nextInt();

        // Mengecek ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
        }

       
    }
}

