package Jobsheet1;

public class LaptopKantor extends Laptop {
    public double dayaTahanBaterai;
    public boolean adaFingerprint;

    public void aktifkanModeHemat() {
        System.out.println("Supeer hemat daya : " + dayaTahanBaterai + " jam");
    }

    public void scanSidikJari() {
        if (adaFingerprint) {
            System.out.println("Sidik jari sesuai Membuka kunci layar");
        } else {
            System.out.println("Tidak ada fingerprint");
        }
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Kategori        : Laptop Kantor");
        System.out.println("Daya Baterai    : " + dayaTahanBaterai + " jam");
        System.out.println("Ada Fingerprint : " + (adaFingerprint ? "ya" : "Tidak"));
    }
    
}
