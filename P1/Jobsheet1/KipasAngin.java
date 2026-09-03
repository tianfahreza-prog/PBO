package Jobsheet1;

public class KipasAngin {
    public String merk;
    public int kecepatan;

    public void tambahKecepatan() {
        kecepatan++;
        System.out.println("Tambah Cepat: " + kecepatan);
    }

    public void matikan() {
        kecepatan = 0;
        System.out.println("mati");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Kipas Angin ===");
        System.out.println("Merk      : " + merk);
        System.out.println("Kecepatan : " + kecepatan);
    }
    
}