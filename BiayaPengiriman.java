package UKL;

import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double berat, jarak, panjang, lebar, tinggi;
        double biayaPerKg, biayaTotal, volume, biayaVolume = 0;

        
        System.out.print("Masukkan berat paket (kg): ");
        berat = input.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm): ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        tinggi = input.nextDouble();

        //Hitung volume
        volume = panjang * lebar * tinggi;

        //Biaya per kg
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        //Tambah biaya volume
        if (volume > 100) {
            biayaVolume = 50000;
        }

        //Total biaya
        biayaTotal = (berat * biayaPerKg) + biayaVolume;

        
        System.out.println("\n=== Rincian Biaya Pengiriman ===");
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
        System.out.println("Total biaya pengiriman: Rp " + biayaTotal);

    }
}
