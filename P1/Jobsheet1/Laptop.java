package Jobsheet1;

public class Laptop {
    public String merk;
    public int ram;

    public void nyalakanLaptop() {
        System.out.println("Laptop " + merk + " booting");
    }

    public void restartLaptop() {
        System.out.println("Laptop " + merk + " muat ulang sistem");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Laptop ===");
        System.out.println("Merk : " + merk);
        System.out.println("RAM  : " + ram + " GB");
    }
}
