
package com.mycompany.posttest1;

public class Perusahaan {
    public String nama;
    public String industri;
    public String alamat;
    public double pendapatanTahunan;

    public Perusahaan(String nama, String industri, String alamat, double pendapatanTahunan) {
        this.nama = nama;
        this.industri = industri;
        this.alamat = alamat;
        this.pendapatanTahunan = pendapatanTahunan;
    }
    
    // Metode public untuk mendapatkan informasi pendapatan tahunan perusahaan
    public double getPendapatanTahunan() {
        return pendapatanTahunan;
    }
    
    // Metode public untuk mengubah alamat perusahaan
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
