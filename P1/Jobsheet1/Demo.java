package Jobsheet1;

public class Demo {
    public static void main(String[] args) {
        KipasAngin kipas = new KipasAngin();
        kipas.merk = "gojodoq";
        kipas.kecepatan = 1;
        kipas.cetakInformasi();
        kipas.tambahKecepatan();
        kipas.matikan();
        System.out.println();

        Lampu lampuRuangan = new Lampu();
        lampuRuangan.merk = "Pilips";
        lampuRuangan.menyala = false;

        lampuRuangan.cetakInformasi();
        lampuRuangan.nyalakan();
        lampuRuangan.matikan();
        System.out.println();

        Laptop laptopUmum = new Laptop();
        laptopUmum.merk = "ThinkPad";
        laptopUmum.ram = 8;
        laptopUmum.cetakInformasi();
        laptopUmum.nyalakanLaptop();
        laptopUmum.restartLaptop();
        System.out.println();

        LaptopKantor laptopKerja = new LaptopKantor();
        laptopKerja.merk = "Axioo hype";
        laptopKerja.ram = 8;
        laptopKerja.dayaTahanBaterai = 12.5;
        laptopKerja.adaFingerprint = true;
        laptopKerja.cetakInformasi();
        laptopKerja.aktifkanModeHemat();
        laptopKerja.scanSidikJari();
        System.out.println();

        LaptopGaming laptopGame = new LaptopGaming();
        laptopGame.merk = "Legion";
        laptopGame.ram = 128;
        laptopGame.modelGpu = "RTX 8090";
        laptopGame.refreshRate = 60;
        laptopGame.cetakInformasi();
        laptopGame.aktifkanFan();
        laptopGame.setRgbKeyboard();
    }
    
}