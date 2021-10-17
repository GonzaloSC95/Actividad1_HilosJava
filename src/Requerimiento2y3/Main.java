package Requerimiento2y3;

public class Main {

    public static void main(String[] args) {

        Buzon buzon = new Buzon();
        // PRODUCTORES
        Productor p1 = new Productor(ConsolaCOLOR.GREEN_BACKGROUND + "Productor 1" + ConsolaCOLOR.WHITE_BACKGROUND, buzon);
        Productor p2 = new Productor(ConsolaCOLOR.GREEN_BACKGROUND + "Productor 2" + ConsolaCOLOR.WHITE_BACKGROUND, buzon);
        Productor p3 = new Productor(ConsolaCOLOR.GREEN_BACKGROUND + "Productor 3" + ConsolaCOLOR.WHITE_BACKGROUND, buzon);
        //CONSUMIDORES
        Consumidor c1 = new Consumidor(ConsolaCOLOR.YELLOW_BACKGROUND + "Consumidor 1" + ConsolaCOLOR.WHITE_BACKGROUND, buzon);
        Consumidor c2 = new Consumidor(ConsolaCOLOR.YELLOW_BACKGROUND + "Consumidor 2" + ConsolaCOLOR.WHITE_BACKGROUND, buzon);
        //ARRANCAMOS
        p1.start();
        p2.start();
        p3.start();
        //-----------
        c1.start();
        c2.start();

    }

}
