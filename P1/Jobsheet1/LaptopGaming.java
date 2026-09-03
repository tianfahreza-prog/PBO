package Jobsheet1;

public class LaptopGaming extends Laptop {
    public String modelGpu;
    public int refreshRate;

    public void aktifkanFan() {
        System.out.println("fan kencang " + modelGpu + ".");
    }

    public void setRgbKeyboard() {
        System.out.println("aktifkan rgb untuk menambah fps " + refreshRate + " Hz");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Kategori     : Laptop Gaming");
        System.out.println("GPU          : " + modelGpu);
        System.out.println("Refresh Rate : " + refreshRate + " Hz");
    }
    
}
