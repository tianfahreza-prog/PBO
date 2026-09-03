package Jobsheet1;

public class Lampu {
    public String merk;
    public boolean menyala;

    public void nyalakan() {
        menyala = true;
        System.out.println("Lampu " + merk + " nyala");
    }

    public void matikan() {
        menyala = false;
        System.out.println("Lampu " + merk + " mati");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Lampu ===");
        System.out.println("Merk      : " + merk);
        System.out.println("Status    : " + (menyala ? "nyala" : "Mati"));
    }
}
