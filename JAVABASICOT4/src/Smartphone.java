public class Smartphone extends SmartDevice {

    //1. Atributos
    String modelo;
    double numeroSerie;
    String SistemaOperativo;
    double almacenamientoInterno;
    double Precio;



    //2. Constructor
    public Smartphone(){}

    public Smartphone(String marca, String procesador, int memoriaRam, double pulgadasPantalla, double mAhBateria, boolean conectividadWifi, boolean conectividadBluetooth, String modelo, double numeroSerie, String sistemaOperativo, double almacenamientoInterno, double precio) {
        super(marca, procesador, memoriaRam, pulgadasPantalla, mAhBateria, conectividadWifi, conectividadBluetooth);
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        SistemaOperativo = sistemaOperativo;
        this.almacenamientoInterno = almacenamientoInterno;
        Precio = precio;
    }
}
