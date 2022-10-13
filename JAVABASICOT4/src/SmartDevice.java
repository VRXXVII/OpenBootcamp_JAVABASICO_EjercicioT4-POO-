public class SmartDevice {

    // Atributos
    String marca;
    String procesador;
    int memoriaRam;
    double pulgadasPantalla;
    double mAhBateria;
    boolean conectividadWifi;
    boolean conectividadBluetooth;
    boolean powerOn;


    // Constructor
    public SmartDevice(){}

    public SmartDevice(String marca, String procesador, int memoriaRam, double pulgadasPantalla, double mAhBateria, boolean conectividadWifi, boolean conectividadBluetooth) {
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.pulgadasPantalla = pulgadasPantalla;
        this.mAhBateria = mAhBateria;
        this.conectividadWifi = conectividadWifi;
        this.conectividadBluetooth = conectividadBluetooth;
    }

    // Métodos (comportamiento)
    public void powerOn (boolean ON){
        this.powerOn = ON;
    }

}
