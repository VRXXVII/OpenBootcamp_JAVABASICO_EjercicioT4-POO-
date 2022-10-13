public class Main {
    public static void main(String[] args) {

        Smartphone Iphone14 = new Smartphone("Apple", "Apple A15", 6, 6.1, 3200, true, true, "Iphone 14", 111212098, "iOS 16", 128, 1009);

        System.out.println("Marca: " + Iphone14.marca);
        System.out.println("Modelo: " + Iphone14.modelo);
        System.out.println("Procesador: " + Iphone14.procesador);
        System.out.println("Numero de serie: " + Iphone14.numeroSerie);
        System.out.println("Iphone 14 encendido: " + Iphone14.powerOn);

        Iphone14.powerOn (true);
        System.out.println("Iphone 14 encendido: " + Iphone14.powerOn);


        SmartWatch AppleWatchSeries8 = new SmartWatch("Apple", "Chip S8", 1, 1.57, 282, true, true, "Series 8", 1233214, "watchOS 9", 32, true, 619);

        System.out.println("Marca: " + AppleWatchSeries8.marca);
        System.out.println("Modelo: " + AppleWatchSeries8.modelo);
        System.out.println("Procesador: " + AppleWatchSeries8.procesador);
        System.out.println("Numero de serie: " + AppleWatchSeries8.numeroSerie);
        System.out.println("Correa de repuesto: " + AppleWatchSeries8.correaRespuesto);
        System.out.println("AppleWatch encendido: " + AppleWatchSeries8.powerOn);

        AppleWatchSeries8.powerOn (true);
        System.out.println("AppleWatch encendido: " + AppleWatchSeries8.powerOn);

    }
}