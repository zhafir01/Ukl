Diketahui: 
Jarak kurang dari atau sama dengan 10 km: Rp 4250 per kg
Jarak lebih dari 10 km: Rp 6000 per kg
Volume paket akan dikenakan biaya Rp 50.000,- ketika volume melebihi 100 cm^3. 

variabel yang saya gunakan gunakan antara lain yaitu:
berat = berat paket dalam kilogram.
jarak = jarak pengiriman dalam kilometer.
panjang, lebar, tinggi = ukuran paket dalam sentimeter.
volume = hasil perhitungan panjang × lebar × tinggi.
biayaPerKg = biaya per kilogram tergantung jarak.
biayaVolume = biaya tambahan jika volume melebihi batas.
biayaTotal = total biaya pengiriman keseluruhan.

Untuk bagian input saya menggunakan System.out.print("Masukkan berat paket (kg): ");
berat = input.nextDouble();
dan nilai yang sudah dimasukkan akan disimpan di Scanner

volume = panjang * lebar * tinggi;
Code diatas digunakan untuk menghitung volume dari paket

if (jarak <= 10) {
    biayaPerKg = 4250;
} else {
    biayaPerKg = 6000;
}
Code diatas adalah untuk menghitung biaya paket per kg berdasarkan jarak sesuai ketentuan soal
Jika jarak kurang atau sama dengan 10 km, maka biaya per kg Rp 4.250.
Jika lebih dari 10 km, maka biaya per kg Rp 6.000.

if (volume > 100) {
    biayaVolume = 50000;
}
Code di atas digunakan untuk menghitung biaya tambahan jika volume paket lebih dari 100 cm

biayaTotal = (berat * biaya per kg) + biaya volume;
Code diatas digunakan untuk menghitung total biaya pengiriman paket

System.out.println("\n=== Rincian Biaya Pengiriman ===");
System.out.println("Volume paket: " + volume + " cm^3");
System.out.println("Biaya per kg: Rp " + biayaPerKg);
System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
System.out.println("Total biaya pengiriman: Rp " + biayaTotal);
Code diatas digunakan untuk menampilkan hasil akhir


<img width="823" height="276" alt="Screenshot 2025-11-03 122710" src="https://github.com/user-attachments/assets/14bf6201-91e9-47c5-8f8e-c16a200de3a6" />


