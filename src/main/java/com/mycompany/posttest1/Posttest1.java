package com.mycompany.posttest1;
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek-objek Perusahaan
        ArrayList<Perusahaan> companies = new ArrayList<>();

        // Menambahkan objek-objek Perusahaan ke dalam ArrayList dengan inisialisasi melalui constructor
        companies.add(new Perusahaan("PT Pertamina", "Ekstraktif", "Jl. Raktif No. 07", 5000));
        companies.add(new Perusahaan("PT Royal Coconut", "Agraris", "Jl. Raris No. 08", 8800));
        companies.add(new Perusahaan("PT Miwon Indonesia", "Industri", "Jl. Ustri No. 04", 2000));
        companies.add(new Perusahaan("PT Uswatun Development", "Jasa", "Jl. Asa No. 28", 1900));
        companies.add(new Perusahaan("PT Matahari Store", "Perdagangan", "Jl. Gangan No. 07", 1200));

        // Menampilkan informasi tentang setiap perusahaan dalam perulangan
        for (Perusahaan company : companies) {
            // Menggunakan string concatenation untuk menggabungkan informasi dengan kalimat
            System.out.println("Nama Perusahaan " + company.nama 
                    + " Yang Bergerak Di Bidang " + "Industri " + company.industri 
                    + " Dan Ber"+ "alamat Di " + company.alamat + " Dengan Total " 
                    + "Pendapatan Tahunan " + "Sebanyak "+ company.getPendapatanTahunan() + ".");
        }
    }
}
