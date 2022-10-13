public class SmartWatch extends SmartDevice {


    //1. Atributos
    String modelo;
    double numeroSerie;
    String SistemaOperativo;
    double almacenamientoInterno;
    boolean correaRespuesto;
    double Precio;

    //2. Constructor
    public SmartWatch(){}

    public SmartWatch(String marca, String procesador, int memoriaRam, double pulgadasPantalla, double mAhBateria, boolean conectividadWifi, boolean conectividadBluetooth, String modelo, double numeroSerie, String sistemaOperativo, double almacenamientoInterno, boolean correaRespuesto, double precio) {
        super(marca, procesador, memoriaRam, pulgadasPantalla, mAhBateria, conectividadWifi, conectividadBluetooth);
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        SistemaOperativo = sistemaOperativo;
        this.almacenamientoInterno = almacenamientoInterno;
        this.correaRespuesto = correaRespuesto;
        Precio = precio;
    }
}
